public class Find_num_with_even_digits {
    public static void main(String[] args) {
        /*Given an array nums of integers,
        return how many of them contain an even number of digits.
        Example-->> INPUT-->[12,4,34,6,2345]
                    OUTPUT-->3
                    */
        int [] prr= {12,34,555,2222,123444,77};
        int result = findNumber(prr);
        System.out.println(result);


    }
    static int findNumber(int []nums)
    {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int count =0;int digit=0;
            while(nums[i]>0)
            {
                digit=nums[i]%10;
                nums[i]/=10;
                count++;

            }
            if(count%2==0)
            {
                result++;
            }



        }
        return result;
    }
}
