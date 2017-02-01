package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	private double XAxis;
	private double YAxis;
	private static PIDController driveControllerX = new PIDController(1, 3, 5, RobotMap.backLeft, RobotMap.backRight);
	private static PIDController driveControllerY = new PIDController(2, 4, 6, RobotMap.backLeft, RobotMap.backRight);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand());
    }
    public void getAxes(){
    	XAxis = OI.joystick1.getRawAxis(0);
    	YAxis = OI.joystick1.getRawAxis(1);
    	
   	driveControllerX = new PIDController(1, 3, 5, RobotMap.backLeft, RobotMap.backRight);
    	driveControllerY = new PIDController(2, 4, 6, RobotMap.backLeft, RobotMap.backRight);
    	
    	
    	driveControllerX.setSetpoint(XAxis);
    	driveControllerY.setSetpoint(YAxis);
    	
    	RobotMap.robotDrive.arcadeDrive(XAxis, YAxis);
    }
}

