// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.revrobotics.spark.SparkMax;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class motorsubsystem extends SubsystemBase {
  private final SparkMax wrist_motor = new SparkMax(17, MotorType.kBrushless);
 // private final SparkMax m_morbor = new SparkMax(18, MotorType.kBrushless);
  /** Creates a new ExampleSubsystem. */

private AbsoluteEncoder wrist_Encoder = wrist_motor.getAbsoluteEncoder();

  public motorsubsystem() {}

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
 // public void m_morbor(double speed){
 // m_morbor.setVoltage(speed);

  public void wrist_motor(double motor_speed){
    // this is the motor speed for the wrist motor.
    
       wrist_motor.setVoltage(motor_speed);}

  public void m_intake(double motor_speed){
    // this is the motor speed for the wrist motor.
  }
  public double getwristposition(){
    return wrist_Encoder.getPosition();
  }
}
//}
