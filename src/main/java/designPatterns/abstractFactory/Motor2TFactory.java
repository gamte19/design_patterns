package designPatterns.abstractFactory;


public class Motor2TFactory implements IMotorFactory {
    @Override
    public ISpeedMotor getSpeedMotor() {
        return new SpeedMotor2T();
    }

    @Override
    public ISuperMotor getSuperMotor() {
        return new SuperMotor2T();
    }
}
