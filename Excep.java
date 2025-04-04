/*public class Excep {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello");
        
    }

}*/
import java.util.Arrays;
public class Excep {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        try{
            System.out.println(a[9]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("hello");
        
    }

}

