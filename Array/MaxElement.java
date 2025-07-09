package Array;

public class MaxElement {

   public  int maxElement(int[] arr){
    int max =0;

        for(int i = 0; i< arr.length; i++){
            if( arr[i] >max){
                max = arr[i];
            }

    
        }
        return max;

    }
    public static int minelement(int[] arr){
        int min = arr[0];

        for(int i =0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min ;

    }



    public static void main(String[] args){
         
        int[] arr = {1,3,4,5,2,3,4,2,2,32,2};

        MaxElement max = new MaxElement();
      int res =   max.maxElement(arr);
      System.out.println(res);

      System.out.println(minelement(arr));
     

     
    }
    
}
