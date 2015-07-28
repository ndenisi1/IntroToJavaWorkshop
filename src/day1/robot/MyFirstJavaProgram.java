package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot sheyanne = new Robot();
sheyanne.sparkle();
sheyanne.show();		
		
sheyanne.penDown();	
sheyanne.setPenColor(Color.cyan);
for (int i = 0; i < 4; i++) {
	

sheyanne.move(100);
sheyanne.turn(90);
}

	
	
	
	
	}}