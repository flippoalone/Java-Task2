package Array_Basic;

public class SmallestNumber {
    public static void main(String[] args){

        int[] number = {10, 22, 30, 47,15, 68, };
        int sum = number[0];

        for (int i = 0 ; i < number.length; i++){

            if(number[i] < sum){
                sum = number[i];
            }
        }
        System.out.println("Smallest" + sum);
    }
}
