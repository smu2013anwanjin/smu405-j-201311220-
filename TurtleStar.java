package com.sd.turtle;
import ch.aplu.turtle.*;

public class TurtleStar {
	static Turtle t1= new Turtle();
	public TurtleStar(){};
	
	public void drawstar(int size,double x, double y){

		for (int i=1;i<6;i++){
			
			t1.forward(size);
			t1.right(144);
			
		}
	}
	public static void main(String[] args){
		TurtleStar a=new TurtleStar();
		a.drawstar(200,30,30);
	}
}