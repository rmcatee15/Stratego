import utilities.Board;
public class StrategoDriver{
  public static void main(String[] args){
    Board grid = new Board(8,10);
    grid.prepBoard();
    grid.print();
  }
}