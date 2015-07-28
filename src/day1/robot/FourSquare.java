package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 1. Create a new Robot
Robot bob = new Robot();	

	void go() {
		// 3. Make the robot move as fast as possible
bob.setSpeed(10);
bob.penDown();
bob.setPenWidth(5);
		// 5. Do steps #6 to #7 four times...
for (int i = 0; i < 4; i++) {
	

			// 6. Set the pen color to random
bob.setRandomPenColor();	
			// 1. Call the drawSquare() method
drawSquare();	
			// 7. Turn the robot 90 degrees to the right
bob.turn(90);
	}}

	/* 2. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
for (int i = 0; i < 4; i++) {
bob.move(100);	
bob.turn(90);
}		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
