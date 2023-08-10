import java.util.*;
public class THE_BEST_ONE_STAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;

//equi sidha

        for (int i = 1 ; i<=(num) ; i++){
            System.out.print("  ");
            for (int j = 0 ; j<(num-i) ; j++){

                System.out.print(" ");
            }


            for (int k = 1 ; k<=(i*2-1);k++){
                System.out.print("*");
            }

            for (int l = 0 ; l<(num-i) ; l++){
                System.out.print(" ");
            }

            System.out.print("\n");
        }

        // trapezium ulta
        for (int i = num ; i<=(num) && i>0 ; i--){
            for (int j = 0 ; j<(num-i) ; j++){
                System.out.print(" ");
            }


            for (int k = 0 ; k<=(i*2+2);k++){
                System.out.print("*");
            }

            for (int l = 0 ; l<(num-i) ; l++){
                System.out.print(" ");
            }

            System.out.print("\n");
        }

        // trapezium sidha

        for (int i = 1 ; i<=(num) ; i++){
            for (int j = 0 ; j<(num-i) ; j++){
                System.out.print(" ");
            }


            for (int k = 0 ; k<=(i*2+2);k++){
                System.out.print("*");
            }

            for (int l = 0 ; l<(num-i) ; l++){
                System.out.print(" ");
            }

            System.out.print("\n");
        }

        //equi ulta

        for (int i = 0 ; i<(num) ; i++){
            System.out.print("  ");

            for (int j = 0 ; j<(i) ; j++){
                System.out.print(" ");
            }


            for (int k = 1 ; k<=(2*num-i*2-1);k++){
                System.out.print("*");
            }

            for (int l = 0 ; l<i ; l++){
                System.out.print(" ");
            }

            System.out.print("\n");
        }

    }
}
