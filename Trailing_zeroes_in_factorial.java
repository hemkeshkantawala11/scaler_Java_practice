import java.util.*;
public class Trailing_zeroes_in_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int zeroes_sum = 0;
        while (num>0){
            zeroes_sum = zeroes_sum + (num/5);
            num = num/5;
        }
        System.out.print(zeroes_sum);


    }
}
