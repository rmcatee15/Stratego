package utilities;
import utilities.Board;
import utilities.Piece;
public class StrategoDriver{
  public static void main(String[] args){
    Board grid = new Board(8,10);
    boolean hasWon = false;
    while(!hasWon){
      grid.prepBoard();
      grid.print();
    }
  }
  private void createPieces(){
    Piece[] compPieces = new Piece[30];
    Piece[] playerPieces = new Piece[30];
  }
}