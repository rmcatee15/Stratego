package utilities;
import java.util.ArrayList;
import utilities.Piece;
public class Strategy{
  public ArrayList<Piece> setUpBoard(){
    ArrayList<Piece> output = new ArrayList<Piece>(30);
    output.set(0, new Flag(33, 0, 0));
    output.set(1, new Spotter(21, 0, 1));
    output.set(2, new Spotter(21, 0, 2));
    output.set(3, new Scout(22, 0, 3));
    output.set(4, new Scout(22, 0, 4));
    output.set(5, new Scout(22, 0, 5));
    output.set(6, new Scout(22, 0, 6));
    output.set(7, new Scout(22, 0, 7));
    output.set(8, new Miner(23, 0, 8));
    output.set(9, new Miner(23, 0, 9));
    output.set(10, new Miner(23, 1, 0));
    output.set(11, new Miner(23, 1, 1));
    output.set(12, new Miner(23, 1, 2));
    output.set(13, new Piece(24, 1, 3));//4
    output.set(14, new Piece(24, 1, 4));//4
    output.set(15, new Piece(25, 1, 5));//5
    output.set(16, new Piece(25, 1, 6));//5
    output.set(17, new Piece(26, 1, 7));//6
    output.set(18, new Piece(26, 1, 8));//6
    output.set(19,  new Piece(27, 1, 9));//7
    output.set(20, new Piece(28, 2, 0));//8
    output.set(21, new Piece(29, 2, 1));//9
    output.set(22, new Piece(30, 2, 2));//10
    output.set(23, new Bomb(32, 2, 3));
    output.set(24, new Bomb(32, 2, 4));
    output.set(25, new Bomb(32, 2, 5));
    output.set(26, new Bomb(32, 2, 6));
    output.set(27, new Bomb(32, 2, 7));
    output.set(28, new Bomb(32, 2, 8));
    output.set(29, new Spy(31, 2, 9));
    return output;
  }
}