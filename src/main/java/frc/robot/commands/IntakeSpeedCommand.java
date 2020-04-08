/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeSpeedCommand extends CommandBase {
  Intake intake = Intake.getInstance();

  DoubleSupplier getIntakingSpeed;

  public IntakeSpeedCommand(DoubleSupplier getIntakingSpeed) {
      this.getIntakingSpeed = getIntakingSpeed;
      addRequirements(intake);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = this.getIntakingSpeed.getAsDouble();

    intake.setIntakeSpeed(speed);
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
