/*
  Christos Kambosos
  Mahveen Faisal
  05/10/23
  AP CS G12
*/

import java.awt.*;
public class Board {

  private int rows;
  private int columns;
  private Color myColor;

  public void setBoardSize(int r, int c){
    rows = r;
    columns = c;
  }

  public void setBoardColor(Color c){
    myColor.setColor(c);
  }

  public static void display(){
    DrawingPanel panel = new DrawingPanel(400, 800);
    Graphics g = panel.getGraphics();
    panel.setBackground(Color.WHITE);

    g.drawOval(80,80);
    
  }
  
  public static void winCheck(){}
  public static void main(String[] args){}

}