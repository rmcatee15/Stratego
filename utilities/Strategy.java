package utilities;
import utilities.Randomizer;
import java.util.*;
import utilities.Piece;
public class Strategy{
  public ArrayList<Piece> setUpBoard(){
    ArrayList<Piece> output = new ArrayList<Piece>(30);
    Randomizer randomGenerator = new Randomizer();
    int[] randomLoc = new int[2];
    randomLoc = randomGenerator.getRandomLoc();
    output.add(0, new Flag(33, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(1, new Spy(31, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(2, new Spy(31, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(3, new Scout(22, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(4, new Scout(22, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(5, new Scout(22, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(6, new Scout(22, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(7, new Scout(22, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(8, new Miner(23, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(9, new Miner(23, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(10, new Miner(23, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(11, new Miner(23, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(12, new Miner(23, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(13, new Piece(24, randomLoc[0], randomLoc[1]));//4
    randomLoc = randomGenerator.getRandomLoc();
    output.add(14, new Piece(24, randomLoc[0], randomLoc[1]));//4
    randomLoc = randomGenerator.getRandomLoc();
    output.add(15, new Piece(25, randomLoc[0], randomLoc[1]));//5
    randomLoc = randomGenerator.getRandomLoc();
    output.add(16, new Piece(25, randomLoc[0], randomLoc[1]));//5
    randomLoc = randomGenerator.getRandomLoc();
    output.add(17, new Piece(26, randomLoc[0], randomLoc[1]));//6
    randomLoc = randomGenerator.getRandomLoc();
    output.add(18, new Piece(26, randomLoc[0], randomLoc[1]));//6
    randomLoc = randomGenerator.getRandomLoc();
    output.add(19, new Piece(27, randomLoc[0], randomLoc[1]));//7
    randomLoc = randomGenerator.getRandomLoc();
    output.add(20, new Piece(28, randomLoc[0], randomLoc[1]));//8
    randomLoc = randomGenerator.getRandomLoc();
    output.add(21, new Piece(29, randomLoc[0], randomLoc[1]));//9
    randomLoc = randomGenerator.getRandomLoc();
    output.add(22, new Piece(30, randomLoc[0], randomLoc[1]));//10
    randomLoc = randomGenerator.getRandomLoc();
    output.add(23, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(24, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(25, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(26, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(27, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(28, new Bomb(32, randomLoc[0], randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(29, new Spy(31, randomLoc[0], randomLoc[1]));
    return output;
  }
  public Move turn(ArrayList<Move> input){
    int x = (int)(Math.random()*input.size());
    if(input.size()==0) return new Move(99,99,99,99);
    return input.get(x);
  }
}