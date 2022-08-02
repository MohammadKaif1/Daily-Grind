public class Searching_min_in_array {
    public static void main(String[] args) {
        int [] arr = {56,34,12,345,78,9,-45542,-1,-46};
        int ans = Findmin(arr);
        System.out.println(ans);
    }
    static int Findmin(int []arr){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
