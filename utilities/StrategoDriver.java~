package utilities;
import java.util.ArrayList;
import utilities.Board;
import utilities.Piece;
import utilities.UserInterface;
public class StrategoDriver{
  public static void main(String[] args){
    UserInterface player = new UserInterface();
    Strategy compPlayer = new Strategy();
    //Piece[] compPieces = new Piece[30];
    ArrayList<Piece> compPieces = new ArrayList<Piece>(30);
    //Piece[] playerPieces = new Piece[30];
    ArrayList<Piece> playerPieces = new ArrayList<Piece>(30);
    compPieces = compPlayer.setUpBoard();
    playerPieces = player.setUpBoard();
    Board grid = new Board(8,10);
    boolean hasWon = false;
    while(!hasWon){
      grid.prepBoard();
      for(int i=0;i<compPieces.size();i++){
        grid.draw(compPieces.get(i));
      }
      for(int i=0;i<playerPieces.size();i++){
        grid.draw(playerPieces.get(i));
      }
      hasWon = true;
      grid.print();
    }
  }
}