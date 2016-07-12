package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Phil=new Robot();
Phil.setSpeed(7);
Phil.penDown();
Phil.setPenWidth(20);
for (int i = 0; i < 12; i++) {
	Phil.setRandomPenColor();
Phil.move(400);
Phil.turn(120);
Phil.clear();
}

	}
}
