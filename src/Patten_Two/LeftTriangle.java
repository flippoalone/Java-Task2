package Patten_Two;

public class LeftTriangle {
    public static void main(String[] args) {


        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // Print star at borders
                if (i == rows || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
