
import ch.aplu.turtle.*;


public class TurtleSquare {
  static Turtle t1=new Turtle();
  
  
  
  public TurtleSquare(){};
  
  
  
  public void drawSquare(int size) {
    for(int i=0;i<4;i++) {
      t1.forward(size);
      t1.right(90);
    }
  }
  
  
  public static void main(String[] args){
		p1_TurtleSquare a = new p1_TurtleSquare();
		a.drawSquare(50);
  }
}  
