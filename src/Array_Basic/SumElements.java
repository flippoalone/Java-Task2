package Array_Basic;

public class SumElements {
    public static void main(String[] args){

        int[] number = {10 , 30, 40, 60};
        int sum = 0;

        for(int i = 0; i < number.length; i++){
            sum += number[i];

            System.out.println(sum);
        }

    }
}
