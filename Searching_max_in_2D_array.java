
public class Searching_max_in_2D_array {

            public static void main(String[] args) {
                int [][ ]arr = {
                        {23,1,5,6,7,8},
                        {56,676,89,24,77},
                        {78,990,54},
                        {45,656}
                };
                int ans =searchMax(arr);
                System.out.println(ans);


            }
            static int searchMax(int [][]nums){
                int max = Integer.MIN_VALUE;
                for (int row = 0; row < nums.length; row++) {
                    for (int col = 0; col < nums[row].length; col++) {
                        if(max<nums[row][col]){
                            max=nums[row][col];

                        }

                    }
                }
                return max;
            }
        }



