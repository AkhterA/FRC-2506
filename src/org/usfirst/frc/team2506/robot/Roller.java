package org.usfirst.frc.team2506.robot;

import com.ctre.*;
import edu.wpi.first.wpilibj.*;

public class Roller {
	
	private final int MOTOR_BUTTON = 0x04;
	private final int MOTOR_ROLLING = 0x01;
	private final int MOTOR_STOP = 0x00;
	
	private CANTalon motor;
	
	public Roller (int talonID) {
		motor = new CANTalon (talonID);
	}
	
	public void driveContoller (Joystick joystick) {
			double speed;
			
		if (joystick.getRawButton (MOTOR_BUTTON)) {
			speed = MOTOR_ROLLING;
		} else {
			speed = MOTOR_STOP;
		}
		drive (speed);
	}
	
	public void drive (double speed) {
		motor.set (speed);
	}

}
