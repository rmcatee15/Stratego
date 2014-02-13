package utilities;
import utilities.Board;
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
  public int getType(boolean t){
    return type;
  }
}