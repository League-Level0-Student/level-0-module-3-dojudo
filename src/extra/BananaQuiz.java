//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String objects =JOptionPane.showInputDialog("do you like banannas");
		//2. if they say no, 
			if(objects.equals("no")) {
//		/tell them they are crazy 
			JOptionPane.showMessageDialog(null, "your crazy");
				//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
			}else if(objects.equals("yes")) {
		String hobby   = JOptionPane.showInputDialog(null,"whats your favorite hobby");
	    JOptionPane.showMessageDialog(null,hobby+" is much better with bannanas");
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		
           //	show a pop up that says “You are bananas!�?
	    
	
			
			}
			else {
				JOptionPane.showMessageDialog(null,"you are bannanas");
			}
}
}