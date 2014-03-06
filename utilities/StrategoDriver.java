package utilities;
import java.util.*;
import utilities.Randomizer;
import utilities.Board;
import utilities.Piece;
import utilities.UserInterface;
public class StrategoDriver{
  public static void main(String[] args){
    System.out.println("Stratego");
    System.out.println("By Rafe");
    System.out.println("go learn the rules on google");
    System.out.println("There are no spotters because the AI sucks and it would be 2 eezzyy");
    System.out.println("standard x,y coordinates to move");
    System.out.println(" ");
    ArrayList<Piece> compPieces = new ArrayList<Piece>();
    ArrayList<Piece> playerPieces = new ArrayList<Piece>();
    UserInterface player = new UserInterface();
    Strategy compPlayer = new Strategy();
    compPieces.addAll(compPlayer.setUpBoard());
    playerPieces.addAll(player.setUpBoard());
    Board grid = new Board(8,10);
    grid.prepBoard();
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
        if(nextMove.getFromRow()==99){
          hasWon=true;
          System.out.println("You have won!");
        }
        for(int i=0; i<playerPieces.size();i++){
          if(nextMove.getFromRow()==playerPieces.get(i).getRow() && nextMove.getFromColumn()==playerPieces.get(i).getColumn()){
            if(grid.isOccupiedComp(nextMove.getToRow(), nextMove.getToColumn())){
              if(grid.battle(playerPieces.get(i), grid.getPiece(compPieces, nextMove.getToRow(), nextMove.getToColumn())).getType()==99){
                playerPieces.remove(i);
                compPieces.remove(grid.getPiece(compPieces, nextMove.getToRow(), nextMove.getToColumn()));
              }
              else{
                playerPieces.remove(grid.battle(playerPieces.get(i), grid.getPiece(compPieces, nextMove.getToRow(), nextMove.getToColumn())));
                compPieces.remove(grid.battle(playerPieces.get(i), grid.getPiece(compPieces, nextMove.getToRow(), nextMove.getToColumn())));
              }
            }
            for(int j=1;j<=nextMove.getNumberOfTimes();j++){
              playerPieces.get(i).move(nextMove.getDirection());
            }
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
        if(nextMove.getFromRow()==99){
          hasWon=true;
          System.out.println("You have lost!");
        }
        for(int i=0; i<compPieces.size();i++){
          if(nextMove.getFromRow()==compPieces.get(i).getRow() && nextMove.getFromColumn()==compPieces.get(i).getColumn()){
            if(grid.isOccupiedPlayer(nextMove.getToRow(), nextMove.getToColumn())){
              if(grid.battle(compPieces.get(i), grid.getPiece(playerPieces, nextMove.getToRow(), nextMove.getToColumn())).getType()==99){
                compPieces.remove(i);
                playerPieces.remove(grid.getPiece(playerPieces, nextMove.getToRow(), nextMove.getToColumn()));
              }
              else{
                playerPieces.remove(grid.battle(compPieces.get(i), grid.getPiece(playerPieces, nextMove.getToRow(), nextMove.getToColumn())));
                compPieces.remove(grid.battle(compPieces.get(i), grid.getPiece(playerPieces, nextMove.getToRow(), nextMove.getToColumn())));
              }
            }
            for(int j=1;j<=nextMove.getNumberOfTimes();j++){
              compPieces.get(i).move(nextMove.getDirection());
            }
            i=compPieces.size();
          }
        }
        turn = true;
      }
      boolean hasFlag = false;
      for(int i=0;i<compPieces.size();i++){
        if (compPieces.get(i).getType()==33) hasFlag=true;
      }
      if (hasFlag==false){
        hasWon=true;
        System.out.println("You have won!");
      }
      hasFlag=false;
      for(int i=0;i<playerPieces.size();i++){
        if (playerPieces.get(i).getType()==13) hasFlag=true;
      }
      if (hasFlag==false){
        hasWon=true;
        System.out.println("You have lost!");
      }
      if(!hasWon){
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
}