import java.util.Scanner;

public class Searching_in_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "kaifmalik";
        
        char target = 'm';
       int ans= search(name,target);
        System.out.println(ans);

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
