/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Hopper;

public class FeedingCommand extends CommandBase {
    DoubleSupplier speedSupplier;
    private Feeder feeder = Feeder.getInstance();
    private Hopper hopper = Hopper.getInstance();
    public FeedingCommand(DoubleSupplier speedSupplier) {
        addRequirements(feeder, hopper);
        this.speedSupplier = speedSupplier;
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      double speed = this.speedSupplier.getAsDouble();
      feeder.set
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
