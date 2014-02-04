package utilities;
import utilities.Board;
import utilities.StrategoDriver;
public class Spotter extends Piece{
  public Spotter(int i, int r, int c){
    type = i;
    row = r;
    column = c;
    if(type>20) value=type-20;
    value=type;
  }
}