
public class Pieces extends Board{

  
  private int player;

  public void setPlayer (int player){
    this.player = player;
  }
  
  public int getPlayer ( ){
    return player;
  }
  
  public static void placePiece( ){
    
  }
  public static void createPiece(int row, int col, int radius ){
  g.drawOval(row, col, radius, radius);
  }
  public static void movePiece (int row, int col){
    
  }
  
  public static void main(String[] args){

    
  }
}