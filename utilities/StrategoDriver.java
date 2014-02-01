package utilities;
import utilities.Board;
import utilities.Piece;
public class StrategoDriver{
  public static void main(String[] args){
    Board grid = new Board(8,10);
    //Piece[] compPieces = new Piece[30];
    //Piece[] playerPieces = new Piece[30];
    //for(int i=0; i<30; i++){
    //  compPieces[i] = new piece(i;i;i;true)
    //}
    //for(int i=0; i<30; i++){
    //  playerPieces[i] = new piece(i;i;i;false)
    //}
    boolean hasWon = false;
    Piece test = new Piece(5,1,1,true);//replace with method to set up board
    while(!hasWon){
      grid.prepBoard();
      test.move(2);//replace with methods that move for both players
      grid.draw(3,test.getRow(),test.getColumn());//replace with method that draws all pieces
      grid.print();
    }
  }
}