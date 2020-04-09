
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.motorcontrollerhelper.*;
public class Intake extends SubsystemBase {
    public static Intake instance = Intake.getInstance();

    boolean isExtended = false;

    private CANSparkMax intakeMiniNeo = MotorController.createMasterNeo(Constants.kIntakeMiniNeoID, false);

    private Solenoid leftIntakePiston = new Solenoid(Constants.kLeftIntakePistonID);
    private Solenoid rightIntakePiston = new Solenoid(Constants.kRightIntakePistonID);

    public static Intake getInstance() {
        if (instance == null) {
            instance = new Intake();
        }
        return instance;
    }

    public void setIntakeSpeed(double speed){
        intakeMiniNeo.set(speed);
    }

    public void actuateIntake(){
        if(this.isExtended == getIntake()){
            leftIntakePiston.set(!getIntake());
            rightIntakePiston.set(!getIntake());
        this.isExtended = !getIntake();
        }
    }

    public boolean getIntake(){
        return leftIntakePiston.get();
    }
}
