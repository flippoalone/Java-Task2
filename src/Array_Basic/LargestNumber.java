package Array_Basic;

public class LargestNumber {
    public static void main(String[] args){

        int[] number = {1, 2, 3,5, 6};
        int sum = number[0];

        for(int i = 1; i < number.length; i++){

            if(number[i] > sum){
                sum = number[i];
            }

        }
        System.out.println("Largest number "+sum);


    }
}
