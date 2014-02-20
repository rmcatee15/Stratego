package utilities;
import java.util.ArrayList;
import utilities.Board;
import utilities.Piece;
import utilities.UserInterface;
public class StrategoDriver{
  public static void main(String[] args){
    UserInterface player = new UserInterface();
    Strategy compPlayer = new Strategy();
    ArrayList<Piece> compPieces = new ArrayList<Piece>();
    ArrayList<Piece> playerPieces = new ArrayList<Piece>();
    compPieces.addAll(compPlayer.setUpBoard());
    playerPieces.addAll(player.setUpBoard());
    Board grid = new Board(8,10);
    for(int i=0;i<compPieces.size();i++){
      grid.draw(compPieces.get(i));
    }
    for(int i=0;i<playerPieces.size();i++){
      grid.draw(playerPieces.get(i));
    }
    grid.print();
    boolean hasWon = false;
    boolean turn = true;
    while(!hasWon){
      if(turn){
        ArrayList<Move> listOfMoves = new ArrayList<Move>();
        for(int i=0; i<playerPieces.size();i++){
          listOfMoves.addAll(playerPieces.get(i).getMoves());
        }
        //compPlayer.turn(listOfMoves); returns the move to act upon
        //turn = false;
      }
      grid.prepBoard();
      for(int i=0;i<compPieces.size();i++){
        grid.draw(compPieces.get(i));
      }
      for(int i=0;i<playerPieces.size();i++){
        grid.draw(playerPieces.get(i));
      }
      grid.print();
    }
  }
}