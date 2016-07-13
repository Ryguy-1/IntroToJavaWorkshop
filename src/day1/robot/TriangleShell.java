package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot phil = new Robot();

	void go() {

		phil.setSpeed(10);

		int length = 50;

		for (int i = 0; i < 60; i++) {

			phil.setRandomPenColor();

			length += 10;

			drawTriangle(length);

			phil.turn(6);

		}
	}

	private void drawTriangle(int length) {
		phil.move(length);
		phil.turn(120);
		phil.penDown();
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
