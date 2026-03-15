package Transport_Fare_System;
import java.util.Scanner;

abstract class Transport {

    abstract  double calculateFare();

}

class Bus extends Transport {

    int ticket;
    double price;

    Bus(int ticket , double price){

        this.ticket = ticket;
        this .price = price;
    }

    @Override
    public double calculateFare(){

        return ticket * price;
    }
}


class Taxi extends  Transport{

    int booking;
    double price;

    Taxi(int booking , double price){
        this.booking = booking;
        this.price = price;
    }

    @Override
    public double calculateFare(){
        return booking * price;
    }
}


class Train extends  Transport{

    int ticket;
    double price;

    Train(int ticket , double price){
        this.ticket = ticket;
        this.price = price;

    }

    @Override
    public double calculateFare(){
        return ticket * price;
    }
}



public class TransportSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Transport travel;

        System.out.println("Welcome to Transport Travels");

        System.out.print("Select the Transport? (1.Bus , 2.Train , 3.Taxi): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            travel = new Bus(2 , 200);
            System.out.println("Bus Ticket Booking Cost: "+ travel.calculateFare());
        } else if (choice == 2) {
            travel = new Train(4 , 100);
            System.out.println("Train Ticket Booking Cost: " + travel.calculateFare());
        }else if (choice == 3){
            travel = new Taxi(3 , 300);
            System.out.println("Taxi Booking Cost: " + travel.calculateFare());
        }else {
            System.out.println("Invalid choice");
        }


        scanner.close();

    }
}
