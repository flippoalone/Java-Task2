package Patten_Two;

public class RightTriangle {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print star at borders
                if (i == 1 || i == rows || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
