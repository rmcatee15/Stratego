package utilities;
import utilities.Board;
public class Piece{
  int type, row, column;
  boolean hasShown = false;
  boolean team;//true=computer, false=player
  public Piece(int i, int r, int c, boolean t){
    type = i;
    row = r;
    column = c;
    team = t;
  }
  public boolean move(int direction){
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
  public int getRow(){return row;}
  public int getColumn(){return column;}
  public boolean getTeam(){return team;}
  public int getType(boolean t){
    if(team==t) return type;
    else if(hasShown) return type;
    else return 15;
  }
}