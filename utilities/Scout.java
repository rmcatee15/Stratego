package utilities;
import utilities.Board;
import java.util.ArrayList;
import utilities.StrategoDriver;
public class Scout extends Piece{
  public Scout(int i, int r, int c){
    super(i, r, c);
  }
  public ArrayList<Move> getMoves(Board grid){
    ArrayList<Move> output = new ArrayList<Move>();
    int newRow = row;
    int newColumn = column;
    for(int i = 1; i<=4; i++){
      newRow = row;
      newColumn = column;
      for(int j=0; j<9; j++){
        if(i == 1) newRow -=1;
        else if(i == 2) newColumn += 1;
        else if(i == 3) newRow += 1;
        else if(i == 4) newColumn -= 1;
        if(type>=1 && type<=13){
          if(Board.isValid(newRow, newColumn) && !grid.isOccupiedPlayer(newRow, newColumn)){
            Move toAdd = new Move(row, column, newRow, newColumn);
            toAdd.setNumberOfTimes(j+1);
            output.add(toAdd);
          }
          else j=9;
        }
        else if(type>=21 &&type<=33){
          if(Board.isValid(newRow, newColumn) && !grid.isOccupiedComp(newRow, newColumn)){
            Move toAdd = new Move(row, column, newRow, newColumn);
            toAdd.setNumberOfTimes(j+1);
            output.add(toAdd);
          }
          else j=9;
        }
      }
    }
    return output;
  }
}