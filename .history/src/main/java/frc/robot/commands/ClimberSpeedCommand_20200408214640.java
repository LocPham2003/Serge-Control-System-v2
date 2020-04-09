/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climber;

public class ClimberSpeedCommand extends CommandBase {
    Climber climber = Climber.getInstance();
    private DoubleSupplier climbingSpeed;
   public ClimberSpeedCommand(DoubleSupplier climbingSpeed) {
      addRequirements(climber);
  this.climbingSpeed = climbingSpeed;
    }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      double speed = cli
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
