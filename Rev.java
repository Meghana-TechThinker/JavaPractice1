import java.util.*;
class Rev{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int r=0;
        int rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse no:"+rev);
    }
}