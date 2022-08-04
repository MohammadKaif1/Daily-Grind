public class Searching_min_in_2D_array {
    public static void main(String[] args) {
        int [][ ]arr = {
                {23,1,5,6,-7,8},
                {56,676,89,24,77},
                {78,-48,54},
                {-45,-656}
        };
        int ans =searchMin(arr);
        System.out.println(ans);


    }
    static int searchMin(int [][]nums){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if(min>nums[row][col]){
                    min=nums[row][col];

                }

            }
        }
        return min;
    }

}
