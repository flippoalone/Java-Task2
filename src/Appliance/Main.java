package Appliance;

abstract class Appliance {

    void turnOn(){

    }
    void turnOff(){

    }
}

class Fan extends Appliance{

    @Override
    void turnOn(){
        System.out.println("The fan is  running");
    }
}


class WashingMachine extends Appliance{

    @Override
    void turnOff(){
        System.out.println("WashingMachine is going to turn Off");
    }
}

public class Main {
    public static void main(String[] args){

        Fan fan = new Fan();
        WashingMachine washingMachine = new WashingMachine();

        fan.turnOn();
        washingMachine.turnOff();


    }
}
