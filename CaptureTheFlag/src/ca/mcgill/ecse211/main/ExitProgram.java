package ca.mcgill.ecse211.main;

import lejos.hardware.Button;

/**
 * This class allows the program to be stopped at any time
 * by pressing the escape button on the robot.
 * 
 * @author Esa Khan
 */
public class ExitProgram extends Thread {

	@Override
	public void run() {
		while (Button.waitForAnyPress() != Button.ID_ESCAPE) {
			
		}
		System.exit(0);
	}

}