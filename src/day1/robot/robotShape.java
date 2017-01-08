package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import apple.laf.JRSUIConstants.FrameOnly;

public class robotShape {

	public static void main(String[] args) {

		Robot Phil = new Robot();

		RobotShapeMaker rsm = new RobotShapeMaker(Phil);
		
		String shape = JOptionPane.showInputDialog("What Shape U want");
		Phil.setSpeed(10);
		Phil.penDown();
		Phil.hide();
		if (shape.equalsIgnoreCase("Square")){
			rsm.drawSquare(100);
		}else if (shape.equalsIgnoreCase("Triangle")){
			rsm.drawTriangle(200);
		}else if (shape.equalsIgnoreCase("Rectangle")){
			rsm.drawRectangle(200, 400);
		}else if (shape.equalsIgnoreCase("Circle")){
			rsm.drawCircle(360);
		}else if (shape.equalsIgnoreCase("Cube")){
			rsm.drawCube(400);
		}

	}
}

