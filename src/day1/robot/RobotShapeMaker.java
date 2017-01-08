package day1.robot;

import org.jointheleague.graphical.robot.Robot;

class RobotShapeMaker {

	private Robot Phil;

	RobotShapeMaker(Robot r) {

		this.Phil = r;
	}
	void drawSquare(int length) {
		for (int i = 0; i < 4; i++) {

			Phil.penDown();
			Phil.move(length);
			Phil.turn(90);
		}
	}
	void drawTriangle(int length){
		
		for (int i = 0; i < 3; i++) {
			
			Phil.turn(360/3);
			Phil.move(length);
		}
			}
	
	void drawRectangle(int width, int length){
		
		for (int i = 0; i < 2; i++) {
			
			Phil.move(width);
			Phil.turn(90);
			Phil.move(length);
			Phil.turn(90);
			
		}
		
	}
	
	
	void drawCircle(int r){
		
		int circumference = r*2*3;
		
		for (int i = 0; i < circumference; i++) {
			
			Phil.move(circumference/360);
			Phil.turn(1);
			
			
			
			
		}
		
		
		
	}
	
	
	void drawCube(int length){
		
		for (int i = 0; i < 4; i++) {
			
			Phil.move(length);
			Phil.turn(90);
			
		}
		Phil.move(length/2);
		Phil.turn(90);
		Phil.move(length/2);
		Phil.turn(90);
		for (int i = 0; i < 3; i++) {
			
			Phil.move(length);
			Phil.turn(90);
			
		}
		Phil.move(length/2);
		Phil.move(length/2);
		Phil.turn(-45);
		Phil.move((int) ((length/2)*Math.sqrt(2)));
		Phil.turn(-135);
		Phil.move(length);
		Phil.turn(-45);
		Phil.move((int) ((length/2)*Math.sqrt(2)));
		
	}
	
	
	
	
	
	}
