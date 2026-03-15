package Foods;

abstract class Food {

    void prepare(){

    }
}

class Pizza extends Food{

    @Override
    void prepare() {
        System.out.println("The Pizza  is preparing ");
    }
}

class Burger extends Food{

    @Override
    void prepare(){
        System.out.println("The Burger is Ready for Serve");
    }
}

public class Main {
    public static void main(String[] args){

        Pizza pizza = new Pizza();
        Burger burger = new Burger();

        pizza.prepare();
        burger.prepare();

    }
}
