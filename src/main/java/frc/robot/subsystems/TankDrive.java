package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class TankDrive extends SubsystemBase {
    private static final double SPEED_MODIFIER = 0.25;
    private VictorSP left1 = new VictorSP(16);
    private VictorSP left2 = new VictorSP(2);
    private VictorSP right1 = new VictorSP(3);
    private VictorSP right2 = new VictorSP(4);
    private CommandXboxController controller;

    public TankDrive(CommandXboxController controller) {
        this.controller = controller;
        left1.addFollower(left2);
        right1.addFollower(right2);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        left1.set(leftSpeed * SPEED_MODIFIER);
        right1.set(rightSpeed * SPEED_MODIFIER);
    }
}
