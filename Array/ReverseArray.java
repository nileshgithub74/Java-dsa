package Array;

public class ReverseArray {

    public static int[] reverse(int[] arr){
        int n  = arr.length;

        int[] temp = new int[n];
        int  k=0;

        for(int i= n-1; i>=0; i--){
            temp[k++] = arr[i];
        }

        return temp;
    }

    public static void main(String[] args){
         int[] arr = {1, 2, 3, 4, 5};
        
         System.out.println(reverse(arr));



    }



    
}
