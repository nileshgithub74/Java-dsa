import java.util.Scanner;

public class CounterGame {

    public static boolean isPower(long n) {
        return (n & (n - 1)) == 0;
    }

    public static long calPower(long n) {
        long power = 1;
        while (power * 2 < n) {
            power *= 2;
        }
        return power;
    }

    public static String counterGame(long n) {
        boolean isLouise = true; 

        while (n != 1) {
            if (isPower(n)) {
                n = n / 2;
            } else {
                n -= calPower(n);
            }
            isLouise= !isLouise;  
        }

        return isLouise ? "Richard" : "Louise";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(counterGame(n));
        }

        sc.close();
    }
}
