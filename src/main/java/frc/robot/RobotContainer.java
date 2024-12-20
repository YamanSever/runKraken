// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.runKraken;
import frc.robot.subsystems.Kraken;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  // Replace with CommandPS4Controller or CommandJoystick if needed

  Joystick ps5 = new Joystick(0);
  Kraken kraken = new Kraken();


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5, 1).whileTrue(new runKraken(kraken, 1));
    new JoystickButton(ps5, 2).whileTrue(new runKraken(kraken, -1));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
