// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ExampleSubsystem;

import com.ctre.phoenix6.swerve.SwerveModuleConstants.DriveMotorArrangement;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/** An example command that uses an example subsystem. */
public class moveBot extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveSubsystem m_subsystem;
private final CommandXboxController controller;
private double leftY;
private double rightY;
private double rY;
private double lY;
/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public moveBot(DriveSubsystem subsystem, CommandXboxController Controllername) {
    m_subsystem = subsystem;
    controller = Controllername;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
leftY = controller.getLeftY();
rightY = controller.getRightY();

lY = Math.pow(leftY,3);
rY = Math.pow(rightY,3);
m_subsystem.leftMotors(-lY);
m_subsystem.rightMotors(rY);

}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
