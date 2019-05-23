


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
	
	spot.setAngle(30);
	spot.move(70);
    spot.setAngle(40);	
    spot.move(70);
    spot.setAngle(50);
    spot.move(70);
    spot.setAngle(60);	
    spot.move(70);
    spot.setAngle(70);
    spot.move(70);
    spot.setAngle(80);
    spot.move(70);
    spot.setAngle(90);
    spot.move(70);
	spot.setAngle(100);
	spot.move(70);
   spot.setAngle(110);	
   spot.move(70);
   spot.setAngle(120);
   spot.move(70);
   spot.setAngle(130);
   spot.move(70);
   spot.setAngle(140);
   spot.move(70);
   spot.setAngle(150);
   spot.move(70);
   spot.setAngle(160);
   spot.move(70);
   spot.setAngle(170);	
   spot.move(70);
   spot.setAngle(180);
   spot.move(70);
   spot.setAngle(190);
   spot.move(70);
   spot.setAngle(200);
   spot.move(70);
   spot.setAngle(210);
   spot.move(70);
   spot.setAngle(220);
	spot.move(70);
  spot.setAngle(230);	
  spot.move(70);
  spot.setAngle(240);
  spot.move(70);
  spot.setAngle(250);
  spot.move(70);
  spot.setAngle(260);
  spot.move(70);
  spot.setAngle(270);
  spot.move(70);
  spot.setAngle(280);
  spot.move(70);
  spot.setAngle(290);	
  spot.move(70);
  spot.setAngle(300);
  spot.move(70);
  spot.setAngle(310);
  spot.move(70);
  spot.setAngle(320);
  spot.move(70);
  spot.setAngle(330);
  spot.move(70);
  spot.setAngle(340);
	spot.move(70);
 spot.setAngle(350);	
 spot.move(70);
 spot.setAngle(360);
 spot.move(70);
 spot.setAngle(370);
 spot.move(70);
}
}

