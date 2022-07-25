import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        boolean check = IsPalindrome(num);
        System.out.println(check);

    }

     static boolean IsPalindrome(int n) {
        int original = n;
        int sum=0;
        while(n>0)
        {
            int rem = n%10;
            n/=10;
            sum= sum*10+rem;
        }

        return sum==original;
    }
}
