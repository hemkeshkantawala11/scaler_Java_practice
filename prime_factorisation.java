import java.util.*;
public class prime_factorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
    }
}