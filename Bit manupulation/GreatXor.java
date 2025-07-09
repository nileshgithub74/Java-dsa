import java.util.Scanner;

public class GreatXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();

        int[] arr = new int[x];
       
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 1; j < arr[i]; j++) { 
                if ((j ^ arr[i]) > arr[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
