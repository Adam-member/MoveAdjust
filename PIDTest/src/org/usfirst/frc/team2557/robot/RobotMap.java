package org.usfirst.frc.team2557.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon frontRight;
	public static CANTalon backRight;
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	
	public static RobotDrive robotDrive;
	
	
	public static void init(){
		frontRight = new CANTalon(8);
		backRight = new CANTalon(5);
		frontLeft = new CANTalon(7);
		backLeft = new CANTalon(6);
		
		robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
