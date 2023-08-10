import java.util.*;
public class Similar_number_Scaler_assignment {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int num) {
        int nextPrime = num + 1;
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }
        return nextPrime;
    }

    public static int downPrime(int num) {
        int downPrime = num - 1;
        while (!isPrime(downPrime)) {
            downPrime--;
        }
        return downPrime;
    }

    public static ArrayList<Integer> primeFactorization(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num = num / i;
            }
        }
        return primeFactors;
    }

    public static int product(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static int absoluteDifference(int num1, int num2) {
        int absDiff = Math.abs(num1 - num2);
        return absDiff;
    }

    public static int minimumDifference(ArrayList<Integer> arr, int num) {
        int min = absoluteDifference(arr.get(0), num);
        for (int i = 0; i < arr.size(); i++) {
            if (absoluteDifference(arr.get(i), num) < min) {
                min = absoluteDifference(arr.get(i), num);
            }
        }
        return min;
    }

    public static int minNum(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static int solve(int num) {
        if(num == 1) return 2;
        ArrayList<Integer> primeFactors = primeFactorization(num);
        int[] factors = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            factors[i] = primeFactors.get(i);
        }
        int[] factorsCopy1 = factors.clone();
        int[] factorsCopy2 = factors.clone();
        ArrayList<Integer> mins = new ArrayList<Integer>();
        ArrayList<Integer> downProduct = new ArrayList<Integer>();
        ArrayList<Integer> upProduct = new ArrayList<Integer>();
        for (int i = 0; i < factors.length; i++) {

            if (factors[i] != 2) {
                // Down Prime check
                int downPrime = downPrime(factors[i]);
                factorsCopy1[i] = downPrime;
                int product = product(factorsCopy1);
                downProduct.add(product);
                factorsCopy1 = factors.clone();
            }

            // Up Prime check
            int upPrime = nextPrime(factors[i]);
            factorsCopy2[i] = upPrime;
            int newProduct = product(factorsCopy2);
            upProduct.add(newProduct);
            factorsCopy2 = factors.clone();
        }

        ArrayList<Integer> products = new ArrayList<Integer>();
        products.addAll(downProduct);
        products.addAll(upProduct);

        int min = minimumDifference(products, num);
        ArrayList<Integer> closestAns = new ArrayList<Integer>();

        for (int i = 0; i < products.size(); i++) {
            if (absoluteDifference(products.get(i), num) == min) {
                closestAns.add(products.get(i));
            }
        }

        int max = closestAns.get(0);
        for (int i = 0; i < closestAns.size(); i++) {
            if (max < closestAns.get(i)) {
                max = closestAns.get(i);
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(solve(num1));
    }

}