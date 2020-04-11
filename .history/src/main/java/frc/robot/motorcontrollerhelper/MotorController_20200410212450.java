/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.motorcontrollerhelper;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
/**
 * Add your docs here.
 */
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Add your docs here.
 */
public class MotorController {
    public static TalonFX createMasterTalon(int id, boolean isReversed){
        TalonFX masterTalon = new TalonFX(id);
        masterTalon.setInverted(isReversed);
        masterTalon.configFactoryDefault();
        masterTalon.enableVoltageCompensation(true);
        return masterTalon;
    }

    public static CANSparkMax createMasterNeo(int id, boolean isReversed){
        CANSparkMax masterNeo = new CANSparkMax(id, MotorType.kBrushless);
        masterNeo.setInverted(isReversed);
        masterNeo.setIdleMode(IdleMode.kCoast);
        masterNeo.restoreFactoryDefaults();
        return masterNeo;
    }

    public static void createFollowerNeo(int id, CANSparkMax master){
        CANSparkMax followerNeo = new CANSparkMax(id, MotorType.kBrushless);
        followerNeo.follow(master);
        followerNeo.setIdleMode(IdleMode.kCoast);
        followerNeo.restoreFactoryDefaults();
        followerNeo.close();
    }

    public static VictorSPX createMaster775(int id, boolean isReversed){
        VictorSPX master775 = new VictorSPX(id);     
        master775.enableVoltageCompensation(true);
        master775.configFactoryDefault();
        master775.setInverted(isReversed);
        return master775;
    }

    public static void createFollower775(int id, VictorSPX master){
        VictorSPX follower775 = new VictorSPX(id);
        follower775.follow(master);
        follower775.enableVoltageCompensation(true);
        follower775.configFactoryDefault();
    }
}