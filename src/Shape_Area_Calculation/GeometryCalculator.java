package Shape_Area_Calculation;

abstract class Shapes { //Parent Class

    abstract double area();


}

class Circle extends  Shapes{ // Child Class Connect to Parent

    double radius;

    Circle(double radius){
        this.radius = radius;

    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

}


class Rectangle extends Shapes {// 2nd Child class Connect to Parent

    double length;
    double width;

    Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return 0.5 * length * width;
    }

}

class Square extends Shapes{ // 3rd Child Class Connect to Parent

    int side;

    Square(int side){
        this.side = side;
    }

    @Override
    double area() {
        return 4 * side;
    }
}



public class GeometryCalculator {
    public static void main(String[] args){



        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10 , 15);
        Square square = new Square(10);

        System.out.println(circle.area()); // Child 1
        System.out.println(rectangle.area()); // Child 2
        System.out.println(square.area()); // Child 3

    }
}
