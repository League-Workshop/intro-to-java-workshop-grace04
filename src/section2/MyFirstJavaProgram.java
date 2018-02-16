package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot Rob = new Robot();
		Rob.setRandomPenColor();
		Rob.setSpeed(10);
		Rob.miniaturize();
		Rob.penDown();
		Rob.setPenWidth(3);
		for (int i = 0; i < 360; i++) {
			Rob.move(3);
			Rob.turn(1);
		}
		for (int i = 0; i < 360; i++) {
			Rob.move(3);
			Rob.turn(-1);
		}
		Rob.penUp();
		Rob.turn(90);
		Rob.move(180);
		Rob.penDown();
		Rob.setPenWidth(10);
		Rob.move(3);
		Rob.penUp();
		Rob.turn(180);
		Rob.move(363);
		Rob.penDown();
		Rob.move(3);
		Rob.hide();
	}
}
