package Array_Basic;

public class AverageNumber {
    public static void main(String[] args){

        int[] number = {1,2,3,4,5};
        int sum = 0;

        for(int i = 0; i < number.length; i++){
            sum += number[i];
        }

        int avg = sum / number.length;
        System.out.println(avg);

    }
}
