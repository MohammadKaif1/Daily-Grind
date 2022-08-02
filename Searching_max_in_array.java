public class Searching_max_in_array {
    public static void main(String[] args) {
        int [] arr= {45,222456,67788,245,90,234,98,100101010,2234,564,335,9866};
        int ans = Findmax(arr);
        System.out.println(ans);
    }

     static int Findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max){
                 max=arr[i];
             }
         }
        return max;
    }
}
