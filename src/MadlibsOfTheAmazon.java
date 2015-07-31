
	import javax.swing.JOptionPane;

	public class MadlibsOfTheAmazon {
		public static void main(String[] args) {

			// Put this sentence in a pop up:
			// If you find yourself having to cross a piranha-infested river, here's how to do it...
			JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
			// Get the user to enter an adjective
String answer = JOptionPane.showInputDialog("Type in an adjective.");
			// Get the user to enter a type of liquid
String wonderwoman = JOptionPane.showInputDialog("Type in a type of liquid.");
			// Get the user to enter a body part
String batman = JOptionPane.showInputDialog("Type in a body part.");
			// Get the user to enter a verb
String superman = JOptionPane.showInputDialog("Type in a verb.");
			// Get the user to enter a place
String storm = JOptionPane.showInputDialog("Type in a place.");
			// Fit the user's words into this sentence, and save it in a String:
			// Piranhas are more [adjective] during the day, so cross the river at
			// night. Piranhas are attracted to fresh [type of liquid] and will most
			// likely take a bite out of your [body part] if you [verb]. Whatever
			// you do, if you have an open wound, try to find another way to get
			// back to the [place]. Good luck!
			JOptionPane.showMessageDialog(null, "Piranhas are more "  + answer+" during the day, so cross the river at night.");
			JOptionPane.showMessageDialog(null, "Piranhas are attracted to fresh " + wonderwoman+" and will most likely take a bite of your " + batman+" if you " + superman);
			JOptionPane.showMessageDialog(null, "Whatever you do, if you have an open wound, try to find another way to get back to " + storm);
			JOptionPane.showMessageDialog(null, "Good  Luck!!!!");
			// Make a pop-up for the final story. You can use \n to go to the next line.
			

		}
	}


