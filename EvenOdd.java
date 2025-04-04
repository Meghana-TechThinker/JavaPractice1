import java.util.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ed=0,od=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
                ed+=r;
            }
            else{
                od+=r;
            }
            n=n/10;
        }
        System.out.println(ed+" "+od);
    }
}