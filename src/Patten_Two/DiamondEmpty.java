package Patten_Two;

public class DiamondEmpty {
    public static void main(String[] args) {

        int height = 20;
        int width = 23;

        for(int i = 0; i < height; i ++){

            for(int j = 0; j < width; j++){

                if(j >(width/2 -i / 2 - 1) && j < (width /2 +i /2+1) && i < height /2){
                    System.out.print(" ");

                } else if (j > (i/2) && j < (width -i / 2 -1) && i >= height / 2) {
                    System.out.print(" ");


                }
                else {
                    System.out.print("*");
                }


            }
            System.out.println();

        }

    }
}
