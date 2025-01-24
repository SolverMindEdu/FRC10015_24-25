package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase{
    private final TalonFX elevatormotor = new TalonFX(14);

    public ElevatorSubsystem() {
        elevatormotor.setNeutralMode(NeutralModeValue.Brake, 0.01);
      }
    
      public void setMotorSpeed(double speed) {
        elevatormotor.set(speed);
      }
    
      /**
       * An example method querying a boolean state of the subsystem (for example, a digital sensor).
       *
       * @return value of some boolean subsystem state, such as a digital sensor.
       */
      public boolean exampleCondition() {
        return false;
      }
    
      @Override
      public void periodic() {
      }
    
      @Override
      public void simulationPeriodic() {
      }
}
