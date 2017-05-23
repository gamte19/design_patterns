package designPatterns.abstractFactory;


public class Main {
    public static void main(String[] args) {

        Motor2TFactory motor2TFactory = new Motor2TFactory();
        ISuperMotor superMotor = motor2TFactory.getSuperMotor();
        ISpeedMotor speedMotor = motor2TFactory.getSpeedMotor();

        System.out.println(speedMotor.sayType());
        System.out.println(superMotor.sayType());

        Motor4TFactory motor4TFactory = new Motor4TFactory();
        ISpeedMotor speedMotor1 = motor4TFactory.getSpeedMotor();
        ISuperMotor superMotor1 = motor4TFactory.getSuperMotor();

        System.out.println(speedMotor1.sayType());
        System.out.println(superMotor1.sayType());
    }
}
