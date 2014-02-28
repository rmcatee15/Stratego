package utilities;
import java.util.*;
public class Randomizer{
  ArrayList<int[]> fakeGrid = new ArrayList<int[]>();
  public Randomizer(){
    for(int i=0;i<10;i++){
      for(int j=0;j<3;j++){
        int[] coords= new int[2];
        coords[0] = j;
        coords[1] = i;
        fakeGrid.add(coords);
      }
    }
  }
  public int[] getRandomLoc(){
    int[] output = new int[2];
    output = fakeGrid.get((int) (Math.random() * fakeGrid.size()));
    fakeGrid.remove(output);
    return output;
  }
}