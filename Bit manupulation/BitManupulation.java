import java.lang.classfile.constantpool.IntegerEntry;

public class BitManupulation {

    // public static int IthBits(int n, int i ){
    // if( (n &( 1<< i -1 ) ) != 0){
    // return 1;
    // }
    // return 0;

    // }

    public static boolean isOdd(int n) {
        if ((n & 1) == 0) {
            return true;
        }

        return false;
    }

    public static int unique(int[] arr) {
        int res = 0;

        for (int num : arr) {
            res ^= num;
        }
        return res;
    }

    public static int IthBits(int n, int i) {
        if (((n >> i) & 1) != 0) {
            return 1;

        }
        return 0;

    }

    // set - 0 ->1 and 1 -> 1
    // reset = 0 -> 1 and 1 -> 0

    public static void setNthBits(int n, int i) {

        System.out.println(Integer.toBinaryString(n));
        n = n | (1 << (i - 1));
        System.out.println("after Nth bits set" + Integer.toBinaryString(n));

    }

    public static void ResetNthBits(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        n = n & ~(1 << (i - 1));
        System.out.println("after Nth bits set" + Integer.toBinaryString(n));

    }

    public static int FirstSetbits(int n) {

       return Integer.numberOfLeadingZeros( (n  & (-n) )+ 1);




    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 2, 42, 3, 4, 3, 5, 6 };
        // System.out.println(unique(arr));

        // System.out.println(11^1);
        // System.out.println(15^0);
        // System.out.println(12^1);

        // System.out.println(IthBits(10, 4));

        // setNthBits(10, 4);

        // ResetNthBits(10, 2);

       

    //     System.out.println(Integer.toBinaryString(~10));

    // System.out.println(Integer.toBinaryString(-10));

    // System.out.println(Integer.toBinaryString(~100));
    // System.out.println(~(-50));

    // System.out.println( ~10 + 1);

}
}

// Bits manupulation in java - find the nth bits of the given number n ;






