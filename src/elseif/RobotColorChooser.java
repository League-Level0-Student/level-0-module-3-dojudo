//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.security.SecurityPermission;


public class RobotColorChooser {
	

	public static void main(String[] args) {
		for(int i =0;i<100;i++) {
		//1. Create a new Robot
		Robot spot=new Robot();
		
		
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("what color d you want");
		//5. Use an if/else statement to set the pen color that the user requested
   if(color.equals("red")) {
	   drawsquare(Color.red);
//	   spot.setPenColor(Color.red);
//		spot.setPenWidth(100);
//		spot.penDown();
//		spot.setAngle(90);
//		spot.move(300);
       break;
		
		
		//7. Put a loop around your code so that you 
	   
   }else if(color.equals("blue")){
	   drawsquare(Color.blue);  
   }
        //6. If the user doesn’t enter anything, choosekeep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
	}

	}
static void drawsquare(Color color) {
	Robot spot=new Robot();
	spot.setPenColor(Color.red);
    spot.setSpeed(10);
	spot.penDown();
	spot.move(30);
	spot.setAngle(30);
	spot.move(200);
   spot.setAngle(60);	
   spot.move(200);
   spot.setAngle(120);
   spot.move(200);
   spot.setAngle(240);
   spot.move(200);
   spot.setAngle(290);
   spot.move(-300);
   spot.setAngle(90);
   spot.move(500);
}  
}