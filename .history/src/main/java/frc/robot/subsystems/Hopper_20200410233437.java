/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.motorcontrollerhelper.MotorController;

public class Hopper extends SubsystemBase {
  public static Hopper instance;
  
  private CANSparkMax hopperNeo = MotorController.createMasterNeo(0, false);

  public static Hopper getInstance(){
      if(instance == null){
          instance = new Hopper();
      }
      return instance;
  }

 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
