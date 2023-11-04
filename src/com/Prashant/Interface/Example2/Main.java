package com.Prashant.Interface.Example2;

public class Main {
    public static void main(String[] args) {

        DumbCar myCar=new DumbCar();
        myCar.modernStart();
        myCar.modernStop();
        DumbCar yourCar=new DumbCar();
        yourCar.vintageStart();
        yourCar.vintageStop();

        Car car=new Car(new ModernEngine());
        car.start();
        car.stop();
        Car car1=new Car(new VintageEngine());
        car1.start();
        car1.stop();
        car1.changeEngine(new ModernEngine());
        car1.start();
        car1.stop();
    }
}
