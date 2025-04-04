import java.util.*;
class Arr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        /* 
        char[] ch={'h','e','l','l','o'};
        for(char c:ch){
            System.out.print(c+" ");
        }
        int[] arr={1,2,3,4};
        for(int i:arr){
            System.out.println(i+" ");
        }
            */
        
        System.out.println("Enter n:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
