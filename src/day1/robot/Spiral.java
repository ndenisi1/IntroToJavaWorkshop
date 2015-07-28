package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
	
		Robot bella = new Robot();
		bella.penDown();
        bella.setSpeed(10);
        for (int i = 0; i < 75; i++) {
			
		
	    bella.setPenColor(Color.cyan);
        bella.move(5*i);	
	    bella.turn(360/7);
			// 7. Change the number of sides to 7 (don’t add a new line of code for this one!)
	    
			// 8. Set the pen width to i
        }
	}
}
