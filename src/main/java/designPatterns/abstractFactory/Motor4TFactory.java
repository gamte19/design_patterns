package designPatterns.abstractFactory;


public class Motor4TFactory implements IMotorFactory {
    @Override
    public ISpeedMotor getSpeedMotor() {
        return new SpeedMotor4T();
    }

    @Override
    public ISuperMotor getSuperMotor() {
        return new SuperMotor4T();
    }
}
