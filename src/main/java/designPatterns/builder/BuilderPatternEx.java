package designPatterns.builder;


public class BuilderPatternEx {
    public static void main(String[] args) {
        Director director = new Director();

        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();

        //Making Car
        director.Construct(carBuilder);
        Product myCar = carBuilder.GetVehicle();
        myCar.Show();

        //Making MotorCycle
        director.Construct(motorBuilder);
        Product myMotor = motorBuilder.GetVehicle();
        myMotor.Show();
    }
}
