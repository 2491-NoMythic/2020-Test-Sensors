/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.SensorSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * This comand takes the sensors from the SensorSubsystem and displays
 * them on the SmartDashboard
 */
public class SensorCommand extends CommandBase {
  private final SensorSubsystem m_subsystem;

  /**
   * Creates the SensorCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public SensorCommand(SensorSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    SmartDashboard.putBoolean("Sensor 1", m_subsystem.isSensor1On());
    SmartDashboard.putBoolean("Sensor 2", m_subsystem.isSensor2On());
    SmartDashboard.putBoolean("Sensor 3", m_subsystem.isSensor3On());
    SmartDashboard.putBoolean("Sensor 4", m_subsystem.isSensor4On());
    SmartDashboard.putBoolean("Sensor 5", m_subsystem.isSensor5On());
    SmartDashboard.putBoolean("Sensor 6", m_subsystem.isSensor6On());
    SmartDashboard.putBoolean("Sensor 7", m_subsystem.isSensor7On());
    SmartDashboard.putBoolean("Sensor 8", m_subsystem.isSensor8On());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  // This example will not end
  @Override
  public boolean isFinished() {
    return false;
  }
}
