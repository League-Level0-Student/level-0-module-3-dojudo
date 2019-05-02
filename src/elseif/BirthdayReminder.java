
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "october 15";
		String myBirthday = "october 5";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday =JOptionPane.showInputDialog("who's birthday do you want to put");
		// 3. Print out what the user typed
		System.out.println(birthday);
		if(birthday.equals("moms")) {
			JOptionPane.showMessageDialog(null,"moms birthday is "+momsBirthday);
		}
		else if(birthday.equals("dads")) {
			JOptionPane.showMessageDialog(null,"dads birthday is "+ dadsBirthday);
		}
		else if(birthday.equals("victor")) {
			JOptionPane.showMessageDialog(null,"victors birthday is "+myBirthday);
		}
		
		
		
		
		
		
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
