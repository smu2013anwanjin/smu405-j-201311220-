import ch.aplu.turtle.*;

public class TurtleTriangle {
	static Turtle t1= new Turtle();
	
	enum Shape{TRIANGLE, SQUARE};
	public static  void drawShape(int size, int sides,double angle) {

		for(int i=0;i<sides;i++){
			t1.forward(size);
			t1.right(angle);
		}
	}

		
	public static void main(String[] args){
    	Shape sel=Shape.TRIANGLE;
	    int size=100;
	    int sides=0;
	    double angle=0;
	    switch (sel) {
		    case TRIANGLE:
		       sides=3;
		       angle=120;
	           break;
		    case SQUARE:
   		       sides=4;
		       angle=90;
	   	       break;
		}
		TurtleTriangle a = new TurtleTriangle();
		a.drawShape(size,sides,angle);
	}
}	