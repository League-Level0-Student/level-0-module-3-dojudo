


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class dodo {
public static void main(String[] args) {
		drawsquare();
		drawtriangle();
	    drawcircle();
	

}

static void drawsquare() {
	Robot spot=new Robot();
	spot.setSpeed(10);
	spot.penDown();
	spot.setAngle(90);
	spot.move(90);
	spot.setAngle(180);
	spot.move(90);
   spot.setAngle(270);	
   spot.move(90);
   spot.setAngle(0);
   spot.move(90);
   }
static void drawtriangle() {
	Robot spot=new Robot();
	spot.setSpeed(6);
	spot.penDown();
	spot.setAngle(30);
	spot.move(90);
	spot.setAngle(150);
	spot.move(90);
   spot.setAngle(270);	
   spot.move(90);
   
   
   
}
static void drawcircle() {
	
		Robot spot=new Robot();
	spot.setSpeed(10);
	spot.penDown();
	for(int i=0;i<360;i++) {
		spot.setSpeed(6);
		spot.setAngle(i);
	spot.move(5);
	}

}
}

