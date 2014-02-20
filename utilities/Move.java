package utilities;
public class Move{
  public Move(int fr, int fc, int tr, int tc){
    fromRow = fr;
    fromColumn = fc;
    toRow = tc;
    toColumn = tc;
  }
  int fromRow;
  int fromColumn;
  int toRow;
  int toColumn;
  public int getFromRow(){return fromRow;}
  public int getFromColumn(){return fromColumn;}
  public int getToRow(){return toRow;}
  public int getToColumn(){return toColumn;}
}