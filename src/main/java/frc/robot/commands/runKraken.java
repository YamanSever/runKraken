// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Kraken;

public class runKraken extends Command {
  /** Creates a new runKraken. */
  Kraken m_kraken;
  double m_speed;

  public runKraken(Kraken kraken, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_kraken = kraken;
    this.m_speed = speed;
    addRequirements(m_kraken);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_kraken.runKraken(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_kraken.runKraken(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
