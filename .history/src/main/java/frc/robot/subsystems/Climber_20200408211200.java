/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.motorcontrollerhelper.MotorController;

public class Climber extends SubsystemBase {
  private static Climber instance;

    
    
  public static Climber getInstance() {
    if (instance == null){
        instance = new Climber();
    }
    return instance;
  }

  public Climber(){
    private VictorSPX masterClimber775 = MotorController.createMaster775(0, false);
      MotorController.createFollower775(0, masterClimber775);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
