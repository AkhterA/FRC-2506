package org.usfirst.frc.team2506.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;

public class Shooter {
	
	private CANTalon alwaysOnMotor;
	private CANTalon selectorMotor;
	private final double MOTOR_ALWAYS_ON_SPEED = 1;
	private final int SHOOTER_BUTTON = 0x06;
	private final double MOTOR_SELECTOR_ON = 1;
	private final double MOTOR_SELECTION_STOP = 0;

	
	public Shooter (int alwaysOnMotorID, int selectorMotorID) {
		alwaysOnMotor = new CANTalon (alwaysOnMotorID);
		selectorMotor = new CANTalon (selectorMotorID);
		
		alwaysOnMotor.set(MOTOR_ALWAYS_ON_SPEED);
	}
	public void driveConroller (Joystick joystick) {
		if (joystick.getRawButton (SHOOTER_BUTTON)) {
			drive (MOTOR_SELECTOR_ON);
		} else {
			drive (MOTOR_SELECTION_STOP);
		}
	}
	
	public void drive (double selectorMOTORSpeed) {
		selectorMotor.set (selectorMOTORSpeed);
	}

}
