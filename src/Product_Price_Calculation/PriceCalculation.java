package Product_Price_Calculation;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void calculateTotalPrice() {
        double total;
        total = price * quantity;
        System.out.printf("Total Price: %.2f \n", total);
    }

}

public class PriceCalculation {

    public static void main(String[] args){

        Product product = new Product(101 , "Rc-remote-control" , 105.10 , 3);
        Product product1 = new Product(102 , "Game-console" , 200.10 , 4);

      product.calculateTotalPrice();
      product1.calculateTotalPrice();

    }
}
