public class Board{
  public void print(int[][] grid){
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[i].length; j++){
        if(j==grid[i].length-1) System.out.println(toPiece(grid[i][j]));
        else{
          System.out.print(toPiece(grid[i][j]));
          if(grid[i][j]==10) System.out.print(" ");
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
  public int[][] prepBoard(int[][] grid){
    int[][] output = new int[grid.length][grid[0].length];
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[i].length; j++){
        if((i==4 || i==5) && (j==3 ||j==4 || j==7 || j==8)) output[i][j] = 0;
        else output[i][j] = 14;
      }
    }
    return output;
  }
}