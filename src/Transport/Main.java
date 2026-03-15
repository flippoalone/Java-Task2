package Transport;

abstract class Transport {

    void bookTicket(){

    }
}

class Bus extends  Transport{
    @Override
    void bookTicket(){

        System.out.println("Bus ticket is booked");
    }
}

class Train extends Transport{

    @Override
    void bookTicket(){

        System.out.println("Train ticket is booked");
    }
}


public class Main {
    public static void main(String[] args){

        Bus bus = new Bus();
        Train train = new Train();

        bus.bookTicket();
        train.bookTicket();
    }
}
