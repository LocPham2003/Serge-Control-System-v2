/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TeleopCommand extends CommandBase {
    XboxController driverController = new XboxController(0);
    XboxController operatorController = new XboxController(1);

    SingleFunctionCommand singleFunctionCommand = new SingleFunctionCommand();
    IntakeSpeedCommand intakeSpeedCommand = new IntakeSpeedCommand(this::getIntakeSpeed);
    IntakeActuationCommand intakeActuationCommand = new IntakeActuationCommand();
    ClimberSpeedCommand climberSpeedCommand = new 
    public double getIntakeSpeed(){
        return driverController.getTriggerAxis(Hand.kRight);
    }

  @Override
  public void initialize() {
    intakeSpeedCommand.schedule();
}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      if(driverController.getAButtonPressed()){
            intakeActuationCommand.schedule();
      }

      if(operatorController.getAButtonPressed()){
            singleFunctionCommand.toggleClimberLock().schedule();
      }


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
