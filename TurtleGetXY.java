import ch.aplu.turtle.*;

public class TurtleGetXY {
	static Turtle t1=new Turtle();
	public TurtleGetXY(){};
	
	public void drawSquare(int size,double x, double y) {
        t1.setPos(x,y);
		for(int i=0;i<4;i++){
			t1.forward(size);
			t1.right(90);
		}

		
	}
	public static void main(String[] args) {
		TurtleGetXY a=new TurtleGetXY();
		a.drawSquare(100,40,40);
	}
}
