package utilities;
import utilities.Piece;
import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface{
  public ArrayList<Piece> setUpBoard(){
    ArrayList<Piece> output = new ArrayList<Piece>(30);
    output.add(0, new Flag(13, 7, 0));
    output.add(1, new Spotter(1, 7, 1));
    output.add(2, new Spotter(1, 7, 2));
    output.add(3, new Scout(2, 7, 3));
    output.add(4, new Scout(2, 7, 4));
    output.add(5, new Scout(2, 7, 5));
    output.add(6, new Scout(2, 7, 6));
    output.add(7, new Scout(2, 7, 7));
    output.add(8, new Miner(3, 7, 8));
    output.add(9, new Miner(3, 7, 9));
    output.add(10, new Miner(3, 6, 0));
    output.add(11, new Miner(3, 6, 1));
    output.add(12, new Miner(3, 6, 2));
    output.add(13, new Piece(4, 6, 3));//4
    output.add(14, new Piece(4, 6, 4));//4
    output.add(15, new Piece(5, 6, 5));//5
    output.add(16, new Piece(5, 6, 6));//5
    output.add(17, new Piece(6, 6, 7));//6
    output.add(18, new Piece(6, 6, 8));//6
    output.add(19, new Piece(7, 6, 9));//7
    output.add(20, new Piece(8, 5, 0));//8
    output.add(21, new Piece(9, 5, 1));//9
    output.add(22, new Piece(10, 5, 2));//10
    output.add(23, new Bomb(12, 5, 3));
    output.add(24, new Bomb(12, 5, 4));
    output.add(25, new Bomb(12, 5, 5));
    output.add(26, new Bomb(12, 5, 6));
    output.add(27, new Bomb(12, 5, 7));
    output.add(28, new Bomb(12, 5, 8));
    output.add(29, new Spy(11, 5, 9));
    return output;
  }
  public Move turn(ArrayList<Move> input){
    Scanner kb = new Scanner(System.in);//kb.nextLine();
    System.out.println("Enter Move");
    while(1==1){
      int or = kb.nextInt()-1;
      int oc = kb.nextInt()-1;
      int nr = kb.nextInt()-1;
      int nc = kb.nextInt()-1;
      for(int i=0; i<input.size(); i++){
        if(or==input.get(i).getFromRow() && oc==input.get(i).getFromColumn() && nr==input.get(i).getToRow() && nc==input.get(i).getToColumn()){
          return input.get(i);
        }
      }
      System.out.println("Not a valid move");
    }
  }
}