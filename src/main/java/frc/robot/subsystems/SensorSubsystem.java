/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
public class SensorSubsystem extends SubsystemBase {

  DigitalInput sensor1;
  DigitalInput sensor2;
  DigitalInput sensor3;
  DigitalInput sensor4;
  DigitalInput sensor5;
  DigitalInput sensor6;
  DigitalInput sensor7;
  DigitalInput sensor8;
  
  /**
   * This subsystem just provieds a way to access sensors.
   * They are enabled here and provide a getter for each sensor.
   */
  public SensorSubsystem() {
    System.out.println("Initialize subsystem");
    sensor1 = new DigitalInput(Constants.SENSOR_1_PIN);
    sensor2 = new DigitalInput(Constants.SENSOR_2_PIN);
    sensor3 = new DigitalInput(Constants.SENSOR_3_PIN);
    sensor4 = new DigitalInput(Constants.SENSOR_4_PIN);
    sensor5 = new DigitalInput(Constants.SENSOR_5_PIN);
    sensor6 = new DigitalInput(Constants.SENSOR_6_PIN);
    sensor7 = new DigitalInput(Constants.SENSOR_7_PIN);
    sensor8 = new DigitalInput(Constants.SENSOR_8_PIN);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean isSensor1On() {
    return sensor1.get();
  }
  
  public boolean isSensor2On() {
    return sensor2.get();
  }

  public boolean isSensor3On() {
    return sensor3.get();
  }

  public boolean isSensor4On() {
    return sensor4.get();
  }

  public boolean isSensor5On() {
    return sensor5.get();
  }

  public boolean isSensor6On() {
    return sensor6.get();
  }

  public boolean isSensor7On() {
    return sensor7.get();
  }

  public boolean isSensor8On() {
    return sensor8.get();
  }
}
