import java.util.Scanner;

public class Searching_in_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "kaifmalik";
        
        char target = 'm';
       boolean ans= search(name,target);
        System.out.println(ans);
             System.out.println(Arrays.toString(name.toCharArray()));
        //name.toCharArray() is a function which converts the string into array format which helps us to iterate easily,,


    }
    //we can also use for each loop to iterate on every element of our string
    static boolean  search2(String naam, char target) {
        if (naam.length()==0) {
            return false;
        }
        for (char ch: naam.toCharArray()) {
            if(ch==target)
            {
                return true;
            }

        }
        return false;

        }

     static int  search(String naam, char target) {
        if (naam.length()==0)
        {
            return -1;
        }
         for (int index = 0; index < naam.length(); index++) {
             if(naam.charAt(index)==target)

             {
                 return index;

             }

         }
         return -1;

    }
}
