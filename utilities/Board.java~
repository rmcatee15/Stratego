package utilities;
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
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[i].length; j++){
        if(j==grid[i].length-1) System.out.println(toPiece(grid[i][j]));
        else{
          System.out.print(toPiece(grid[i][j]));
          if(grid[i][j]!=10) System.out.print(" ");
        }
      }
    }
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
  public static boolean isValid(int row, int column){
    if(row<0 || row>7) return false;
    if(column<0 || column >9) return false;
    if((row==3 || row==4) && (column==2 || column==3 || column==6 || column==7)) return false;
    return true;
  }
  public void draw(int type, int row, int column){
    grid[row][column]=type;
  }
}