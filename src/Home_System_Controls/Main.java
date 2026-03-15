package Home_System_Controls;

interface SmartDevice {

void turnOn();

void turnOff();
}

class Fan implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("The fans is turned on in all room");
    }


    public void turnOff() {
        System.out.println();
    }
}

class Light implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("the light is so bright and reflect throw walls");
    }


    public void turnOff() {

    }
}

class AirConditioner implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Air conditioner is on but it power problem");
    }


    public void turnOff() {
        System.out.println("UnKnow problem consume");
    }
}


public class Main {
    public static void main(String[] args){

       Fan fan = new Fan();
       Light light = new Light();
       AirConditioner  AC = new AirConditioner();

       fan.turnOff();
       fan.turnOn();

       light.turnOn();
       light.turnOff();

        AC.turnOff();
        AC.turnOn();


    }
}
