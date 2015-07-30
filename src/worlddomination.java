import javax.swing.JOptionPane;

public class worlddomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String wonderwoman = JOptionPane.showInputDialog("Do you know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (wonderwoman.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You rule the world!");
		} else {JOptionPane.showMessageDialog(null, "Then good luck being my servant.");
		}
	}
	// 3. Otherwise, wish them good luck washing dishes.

}
