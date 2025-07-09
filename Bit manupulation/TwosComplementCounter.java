import java.util.Scanner;

public class TwosComplementCounter {

    public static int countOnesInRange(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            int num = i;

            sum += Integer.bitCount(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int a = sc.nextInt();

            int b = sc.nextInt();
            System.out.println(countOnesInRange(a, b));
        }

        sc.close();
    }
}
