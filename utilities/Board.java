package utilities;
import java.util.*;
public class Board{
  int[][] grid;
  public Board(int rows, int columns){
    grid = new int[rows][columns];
    for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++){
        grid[i][j] = 0;
      }
    }
  }
  public void print(){
    int k = 8;
    for(int i=0; i<grid.length; i++){
      System.out.print(k + "   ");
      k--;
      for(int j=0; j<grid[i].length; j++){
        if(j==grid[i].length-1) System.out.println(toPiece(grid[i][j]));
        else{
          System.out.print(toPiece(grid[i][j]));
          if(grid[i][j]!=10) System.out.print(" ");
        }
      }
    }
    System.out.println(" ");
    System.out.println("    1 2 3 4 5 6 7 8 9 10");
    System.out.println(" ");
  }
  private String toPiece(int character){
    if(character==14) return "-";
    if(character==0) return "O";
    if(character==11) return "S";
    if(character==12) return "B";
    if(character==13) return "F";
    if(character>=1 && character<=10) return Integer.toString(character);
    if(character>=21 && character<=33) return "X";
    else return null;
  }
  public void prepBoard(){
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[i].length; j++){
        if((i==3 || i==4) && (j==2 ||j==3 || j==6 || j==7)) grid[i][j] = 0;
        else grid[i][j] = 14;
      }
    }
  }
  public int getPiece(int r,int c){
    return grid[r][c];
  }
  public static boolean isValid(int row, int column){
    if(row<0 || row>7) return false;
    if(column<0 || column >9) return false;
    if((row==3 || row==4) && (column==2 || column==3 || column==6 || column==7)) return false;
    return true;
  }
  public boolean isOccupiedPlayer(int row, int column){
    if(grid[row][column]>=1 && grid[row][column]<=13){
      return true;
    }
    return false;
  }
  public boolean isOccupiedComp(int row, int column){
    if(grid[row][column]<=33 && grid[row][column]>=21){
      return true;
    }
    return false;
  }
  public void draw(Piece p){
    grid[p.getRow()][p.getColumn()]=p.getType();
  }
  public Piece getPiece(ArrayList<Piece> listOfPieces, int r, int c){
    for(int i=0; i<listOfPieces.size(); i++){
      if(listOfPieces.get(i).getRow()==r && listOfPieces.get(i).getColumn()==c) return listOfPieces.get(i);
    }
    Piece output = new Piece(0,0,0);
    return output;
  }
  public Piece battle(Piece pone, Piece ptwo){
    int tone=pone.getType();
    int ttwo=ptwo.getType();
    if(tone>=21)tone-=20;
    if(ttwo>=21)ttwo-=20;
    Piece tie = new Piece(99,99,99);
    if(tone==ttwo)return tie;
    if(tone==3 && ttwo==12) return ptwo;
    if(ttwo==12) return pone;
    if(ttwo==13) return ptwo;
    if(tone==11 && ttwo==10) return ptwo;
    if(tone==11) return pone;
    if(tone>ttwo) return ptwo;
    if(ttwo>tone) return pone;
    else return pone;
  }
}