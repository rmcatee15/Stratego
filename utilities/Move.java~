package utilities;
public class Move{
  public Move(int fr, int fc, int tr, int tc){
    fromRow = fr;
    fromColumn = fc;
    toRow = tr;
    toColumn = tc;
    if(toRow>fromRow) direction=3;
    if(toRow<fromRow) direction=1;
    if(toColumn>fromColumn) direction=2;
    if(toColumn<fromColumn) direction=4;
  }
  int fromRow;
  int fromColumn;
  int toRow;
  int toColumn;
  int direction;
  public int getFromRow(){return fromRow;}
  public int getFromColumn(){return fromColumn;}
  public int getToRow(){return toRow;}
  public int getToColumn(){return toColumn;}
  public int getDirection(){return direction;}
}