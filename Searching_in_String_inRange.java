public class Searching_in_String_inRange {
    public static void main(String[] args) {

        String name = "kaifmalik";

        char target = 'k';
        int ans= search(name,target,2,5);
        System.out.println(ans);


    }

    static int  search(String naam,char target, int start , int end) {
        if (naam.length()==0)
        {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if(naam.charAt(index)==target)

            {
                return index;

            }

        }
        return -1;

    }

}
