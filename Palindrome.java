import java.util.*;
public class Palindrome {
        public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        int r=0;
        int rev=0;
        int temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse no:"+rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

