package utilities;
import utilities.Piece;
import utilities.Randomizer;
import java.util.Scanner;
import java.util.*;
public class UserInterface{
  public ArrayList<Piece> setUpBoard(){
    ArrayList<Piece> output = new ArrayList<Piece>(30);
    Randomizer randomGenerator = new Randomizer();
    int[] randomLoc = new int[2];
    randomLoc = randomGenerator.getRandomLoc();
    output.add(0, new Flag(13, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(1, new Spotter(1, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(2, new Spotter(1, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(3, new Scout(2, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(4, new Scout(2, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(5, new Scout(2, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(6, new Scout(2, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(7, new Scout(2, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(8, new Miner(3, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(9, new Miner(3, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(10, new Miner(3, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(11, new Miner(3, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(12, new Miner(3, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(13, new Piece(4, randomLoc[0]+5, randomLoc[1]));//4
    randomLoc = randomGenerator.getRandomLoc();
    output.add(14, new Piece(4, randomLoc[0]+5, randomLoc[1]));//4
    randomLoc = randomGenerator.getRandomLoc();
    output.add(15, new Piece(5, randomLoc[0]+5, randomLoc[1]));//5
    randomLoc = randomGenerator.getRandomLoc();
    output.add(16, new Piece(5, randomLoc[0]+5, randomLoc[1]));//5
    randomLoc = randomGenerator.getRandomLoc();
    output.add(17, new Piece(6, randomLoc[0]+5, randomLoc[1]));//6
    randomLoc = randomGenerator.getRandomLoc();
    output.add(18, new Piece(6, randomLoc[0]+5, randomLoc[1]));//6
    randomLoc = randomGenerator.getRandomLoc();
    output.add(19, new Piece(7, randomLoc[0]+5, randomLoc[1]));//7
    randomLoc = randomGenerator.getRandomLoc();
    output.add(20, new Piece(8, randomLoc[0]+5, randomLoc[1]));//8
    randomLoc = randomGenerator.getRandomLoc();
    output.add(21, new Piece(9, randomLoc[0]+5, randomLoc[1]));//9
    randomLoc = randomGenerator.getRandomLoc();
    output.add(22, new Piece(10, randomLoc[0]+5, randomLoc[1]));//10
    randomLoc = randomGenerator.getRandomLoc();
    output.add(23, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(24, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(25, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(26, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(27, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(28, new Bomb(12, randomLoc[0]+5, randomLoc[1]));
    randomLoc = randomGenerator.getRandomLoc();
    output.add(29, new Spy(11, randomLoc[0]+5, randomLoc[1]));
    return output;
  }
  /*public Move turn(ArrayList<Move> input){
    if(input.size()==0) return new Move(99,99,99,99);
    Scanner kb = new Scanner(System.in);//kb.nextLine();
    System.out.println("Enter Move");
    while(1==1){
      int oc = kb.nextInt()-1;
      int or = swap(kb.nextInt()-1);
      int nc = kb.nextInt()-1;
      int nr = swap(kb.nextInt()-1);
      for(int i=0; i<input.size(); i++){
        if(or==input.get(i).getFromRow() && oc==input.get(i).getFromColumn() && nr==input.get(i).getToRow() && nc==input.get(i).getToColumn()){
          return input.get(i);
        }
      }
      System.out.println("Not a valid move");
    }
  }*/
  public Move turn(ArrayList<Move> input){
    int x = (int)(Math.random()*input.size());
    if(input.size()==0) return new Move(99,99,99,99);
    return input.get(x);
  }
  private int swap(int input){
    int output = 0;
    int total = 7;
    for(int i=0; i<8;i++){
      if(input == i) output=total;
      total--;
    }
    return output;
  }
}