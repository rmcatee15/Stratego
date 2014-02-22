package utilities;
import utilities.Board;
import java.util.ArrayList;
public class Piece{
  int type, row, column, value;
  boolean hasShown = false;
  boolean isAlive=true;
  public Piece(int i, int r, int c){
    type = i;
    row = r;
    column = c;
    if(type>20) value=type-20;
    value=type;
  }
  public boolean move(int direction){
    if (!isAlive) return false;
    int testRow = row;
    int testColumn = column;
    if(direction == 1) testRow-=1;
    else if(direction==2) testColumn+=1;
    else if(direction==3) testRow+=1;
    else if(direction==4) testColumn-=1;
    if(Board.isValid(testRow, testColumn)){
      row = testRow;
      column = testColumn;
      return true;
    }
    return false;
  }
  public void removeSelfFromGrid(){
    isAlive=false;
    row=99;
    column=99;
  }
  public int getRow(){return row;}
  public int getColumn(){return column;}
  public int getType(){
    return type;
  }
  public ArrayList<Move> getMoves(Board grid){
    ArrayList<Move> output = new ArrayList<Move>();
    int newRow = row;
    int newColumn = column;
    for(int i = 1; i<=4; i++){
      newRow = row;
      newColumn = column;
      if(i == 1) newRow -=1;
      else if(i == 2) newColumn += 1;
      else if(i == 3) newRow += 1;
      else if(i == 4) newColumn -= 1;
      if(type>=1 && type<=13){
        if(Board.isValid(newRow, newColumn) && !grid.isOccupiedPlayer(newRow, newColumn)){
          output.add(new Move(row, column, newRow, newColumn));
        }
      }
      else if(type>=21 &&type<=33){
        if(Board.isValid(newRow, newColumn) && !grid.isOccupiedComp(newRow, newColumn)){
          output.add(new Move(row, column, newRow, newColumn));
        }
      }
    }
    return output;
  }
}