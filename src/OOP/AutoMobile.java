package OOP;

public class AutoMobile {
    private void drive() {
        System.out.println("automobile drive");
    }
}

abstract class Car extends AutoMobile {
    protected void drive() {
        System.out.println("car drive");
    }

    public abstract void Drive();
}

class ElectricCar extends Car {
     @Override
    public  void Drive() {
        System.out.println("electric car ");
    }

    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.Drive();




    }
}
