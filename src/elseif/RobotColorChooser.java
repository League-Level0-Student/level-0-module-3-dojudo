//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.security.SecurityPermission;


public class RobotColorChooser {
	private static Color red;

	public static void main(String[] args) {
		//1. Create a new Robot
		Robot spot=new Robot();
		
		
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("what color d you want");
		//5. Use an if/else statement to set the pen color that the user requested
   if(color.equals("red")) {
	   spot.setPenColor(red);
	
   
        //7. Put a loop around your code so that you 
	   
   }
        //6. If the user doesn’t enter anything, choosekeep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		spot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
spot.penDown();
		spot.move(100);

	}
}
