package utilities;
import utilities.Piece;
import java.util.ArrayList;
public class UserInterface{
  public ArrayList<Piece> setUpBoard(){
    ArrayList<Piece> output = new ArrayList<Piece>(30);
    output.set(0, new Flag(13, 7, 0));
    output.set(1, new Spotter(1, 7, 1));
    output.set(2, new Spotter(1, 7, 2));
    output.set(3, new Scout(2, 7, 3));
    output.set(4, new Scout(2, 7, 4));
    output.set(5, new Scout(2, 7, 5));
    output.set(6, new Scout(2, 7, 6));
    output.set(7, new Scout(2, 7, 7));
    output.set(8, new Miner(3, 7, 8));
    output.set(9, new Miner(3, 7, 9));
    output.set(10, new Miner(3, 6, 0));
    output.set(11, new Miner(3, 6, 1));
    output.set(12, new Miner(3, 6, 2));
    output.set(13, new Piece(4, 6, 3));//4
    output.set(14, new Piece(4, 6, 4));//4
    output.set(15, new Piece(5, 6, 5));//5
    output.set(16, new Piece(5, 6, 6));//5
    output.set(17, new Piece(6, 6, 7));//6
    output.set(18, new Piece(6, 6, 8));//6
    output.set(19, new Piece(7, 6, 9));//7
    output.set(20, new Piece(8, 5, 0));//8
    output.set(21, new Piece(9, 5, 1));//9
    output.set(22, new Piece(10, 5, 2));//10
    output.set(23, new Bomb(12, 5, 3));
    output.set(24, new Bomb(12, 5, 4));
    output.set(25, new Bomb(12, 5, 5));
    output.set(26, new Bomb(12, 5, 6));
    output.set(27, new Bomb(12, 5, 7));
    output.set(28, new Bomb(12, 5, 8));
    output.set(29, new Spy(11, 5, 9));
    return output;
  }
}