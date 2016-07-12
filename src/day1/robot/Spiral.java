package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot phil=new Robot();
	
phil.penDown();

phil.setSpeed(10);

for (int i = 0; i < 75; i++) {
	


	phil.setRandomPenColor();

	phil.move(5*i);
	phil.turn(360/7);
		
	phil.setPenWidth(i);

}
	}
}
