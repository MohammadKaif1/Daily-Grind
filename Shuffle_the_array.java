import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_array {
    public static void main(String[] args) {
        /*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
            Return the array in the form [x1,y1,x2,y2,...,xn,yn]
            Example-->>Input-[2,5,1,3,4,7]
                       Output-[2,3,4,4,1,7]

        */
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int [] arr = new int[2*n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();


        }
        int [] ans = shuffle(arr,n);
        System.out.println(Arrays.toString(ans));

    }
    static int [] shuffle(int [] nums,int n)
    {
        int [] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+n];
        }

                return ans;
    }
}
