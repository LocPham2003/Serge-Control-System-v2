/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.motorcontrollerhelper.MotorController;

public class Climber extends SubsystemBase {
  private boolean isLocked = false;
  
    private static Climber instance;

  private VictorSPX masterClimber775 = MotorController.createMaster775(0, false);
  private Solenoid pancakeCylinders = new Solenoid(0);  

  public static Climber getInstance() {
    if (instance == null){
        instance = new Climber();
    }
    return instance;
  }

  public Climber(){
      MotorController.createFollower775(0, masterClimber775);
  }

  public void setClimberSpeed(double speed){
      masterClimber775.set(ControlMode.PercentOutput, speed);
  }
  
  public void toggleClimberLock(){
    if(this.isLocked == isLocked()\)
  }

  public boolean isLocked(){
    return pancakeCylinders.get();
  }
}
