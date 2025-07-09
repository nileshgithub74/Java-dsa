package Array;

public abstract class MaxSubArray {
    public static void main(String[] args){
        int[] arr =  {2,9,31,-4,21,7};
        int sum =0;
        int maxsum = 0;
       int k =3;
        for(int i = 0; i<=arr.length-k; i++){

            for(int j =i; j<k; j++){
                sum += arr[j];

            }
            maxsum = Math.max(sum, maxsum);
        }

        System.out.println(maxsum);

    }
    
}
