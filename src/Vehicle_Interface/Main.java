package Vehicle_Interface;

interface Vehicle {
    void enginStart();
    void enginStop();
}

class Car implements  Vehicle{

    @Override
    public void enginStart() {
        System.out.println("The Car  is Started ");
    }

    @Override
    public void enginStop() {
        System.out.println("Car is Going to stop in Gas Station");
    }
}

class Bike implements Vehicle{

    @Override
    public void enginStop() {
        System.out.println("The Bike has No Petrol");
    }

    @Override
    public void enginStart() {
        System.out.println("The biker  is going to fill the Tank ");
    }
}


class Truck implements Vehicle {

    @Override
    public void enginStart() {
        System.out.println("The is Truck in ideal state ");
    }

    @Override
    public void enginStop() {
        System.out.println("truck stops midel of the road");
    }
}


public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();

        car.enginStart();
        car.enginStop();

        bike.enginStart();
        bike.enginStop();

        truck.enginStart();
        truck.enginStop();

    }
}
