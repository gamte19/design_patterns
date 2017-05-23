package designPatterns.abstractFactory;


public interface IMotorFactory {
    ISpeedMotor getSpeedMotor();
    ISuperMotor getSuperMotor();
}
