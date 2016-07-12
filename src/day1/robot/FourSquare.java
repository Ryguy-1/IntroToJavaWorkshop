package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot phil = new Robot();

	void go() {

		phil.setSpeed(10);

		phil.setPenWidth(5);

		for (int i = 0; i < 4; i++) {

			phil.setRandomPenColor();

			drawSquare();

			phil.turn(90);
		}
	}

	void drawSquare() {

		for (int i = 0; i < 4; i++) {

			phil.penDown();
			phil.move(400);
			phil.turn(90);
		}
	}

	void drawLine(int length) {
		for (int i = 0; i < length; i++) {
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new FourSquare().go();
	}

}
