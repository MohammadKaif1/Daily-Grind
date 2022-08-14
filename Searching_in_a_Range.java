package com.company;

public class Searching_in_a_Range {
    public static void main(String[] args) {
        //Q-->>Search 3 in range of index [1,4]
        int[] arr = {18,12,-7,3,14,28};
        int ans = LinearSearch(arr,1,4);
        System.out.println(ans);


    }
    static int LinearSearch(int [] nums,int start ,int end) {
        for (int index = start; index <= end; index++) {
            int element = nums[index];
            if(element == 3){
                return index;
            }


        }
        return -1;
    }
}
