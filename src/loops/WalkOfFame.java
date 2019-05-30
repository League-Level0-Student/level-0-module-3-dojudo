
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

	// 2. Make the robot draw a star shape. Hint: 144.
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(250);
	int y =100;
	int x = 250;
	
	for(int i=0;i<10;i++) {	
		
		rob.penDown();
		rob.setSpeed(20);
			
		
		for(int j=0;j<5;j++) {
			
			rob.move(150);
		    rob.turn(144);
		
		}
		rob.setX(rob.getX()+150);
	}		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
