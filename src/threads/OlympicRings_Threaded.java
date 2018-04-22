package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void drawCircle(Robot rob, int r) {
		for (int i = 0; i < 360; i++) {
			rob.penDown();
			rob.turn(1);
			rob.move(r);
		}
	}

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		Robot r4 = new Robot();
		Robot r5 = new Robot();
		Thread t1 = new Thread(() -> {
			r1.setSpeed(1000);
			r1.setPenColor(Color.BLUE);
			r1.moveTo(500, 300);
			drawCircle(r1, 1);
			r1.hide();
		});
		Thread t2 = new Thread(() -> {
			r2.setSpeed(1000);
			r2.setPenColor(Color.BLACK);
			r2.moveTo(625, 300);
			drawCircle(r2, 1);
			r2.hide();
		});
		Thread t3 = new Thread(() -> {
			r3.setSpeed(1000);
			r3.setPenColor(Color.RED);
			r3.moveTo(750, 300);
			drawCircle(r3, 1);
			r3.hide();
		});
		Thread t4 = new Thread(() -> {
			r4.setSpeed(1000);
			r4.setPenColor(Color.YELLOW);
			r4.moveTo(563, 350);
			drawCircle(r4, 1);
			r4.hide();
		});
		Thread t5 = new Thread(() -> {
			r5.setSpeed(1000);
			r5.setPenColor(Color.GREEN);
			r5.moveTo(688, 350);
			drawCircle(r5, 1);
			r5.hide();
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
