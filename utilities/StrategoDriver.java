package utilities;
import java.util.ArrayList;
import utilities.Board;
import utilities.Piece;
import utilities.UserInterface;
public class StrategoDriver{
  public static void main(String[] args){
    ArrayList<Piece> compPieces = new ArrayList<Piece>();
    ArrayList<Piece> playerPieces = new ArrayList<Piece>();
    UserInterface player = new UserInterface();
    Strategy compPlayer = new Strategy();
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
          listOfMoves.addAll(playerPieces.get(i).getMoves(grid));
        }
        Move nextMove = new Move(0,0,0,0);
        nextMove = player.turn(listOfMoves);
        for(int i=0; i<playerPieces.size();i++){
          if(nextMove.getFromRow()==playerPieces.get(i).getRow() && nextMove.getFromColumn()==playerPieces.get(i).getColumn()){
            if(grid.isOccupiedComp(nextMove.getToRow(), nextMove.getToColumn())){
              if(grid.battle(playerPieces.get(i), grid.getPiece(compPieces, nextMove.getFromRow(), nextMove.getFromColumn())).getType()==99){
                playerPieces.remove(i);
                compPieces.remove(grid.getPiece(compPieces, nextMove.getFromRow(), nextMove.getFromColumn()));
              }
              else playerPieces.remove(grid.battle(playerPieces.get(i), grid.getPiece(compPieces, nextMove.getFromRow(), nextMove.getFromColumn())));
            }
            playerPieces.get(i).move(nextMove.getDirection());
            i=playerPieces.size();
          }
        }
        turn = false;
      }
      else{
        ArrayList<Move> listOfMoves = new ArrayList<Move>();
        for(int i=0; i<compPieces.size();i++){
          listOfMoves.addAll(compPieces.get(i).getMoves(grid));
        }
        Move nextMove = new Move(0,0,0,0);
        nextMove = compPlayer.turn(listOfMoves);
        for(int i=0; i<compPieces.size();i++){
          if(nextMove.getFromRow()==compPieces.get(i).getRow() && nextMove.getFromColumn()==compPieces.get(i).getColumn()){
            if(grid.isOccupiedPlayer(nextMove.getToRow(), nextMove.getToColumn())){
              if(grid.battle(compPieces.get(i), grid.getPiece(playerPieces, nextMove.getFromRow(), nextMove.getFromColumn())).getType()==99){
                compPieces.remove(i);
                playerPieces.remove(grid.getPiece(playerPieces, nextMove.getFromRow(), nextMove.getFromColumn()));
              }
              else compPieces.remove(grid.battle(compPieces.get(i), grid.getPiece(playerPieces, nextMove.getFromRow(), nextMove.getFromColumn())));
            }
            compPieces.get(i).move(nextMove.getDirection());
            i=compPieces.size();
          }
        }
        turn = true;
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