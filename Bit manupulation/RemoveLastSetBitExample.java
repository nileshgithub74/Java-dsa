public class RemoveLastSetBitExample {
    public static void main(String[] args) {
        int n = 12;

        System.out.println("Original n    = " + n + " (" + Integer.toBinaryString(n) + ")");

        int result = n & (n - 1);

        System.out.println("n - 1         = " + (n - 1) + " (" + Integer.toBinaryString(n - 1) + ")");
        System.out.println("n & (n - 1)   = " + result + " (" + Integer.toBinaryString(result) + ")");
    }
}
