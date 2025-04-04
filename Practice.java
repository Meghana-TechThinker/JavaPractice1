import java.util.*;
public class Practice {
    public static void main(String[] args) {
        String s="123";
        String s1="012";
        int a=0;
        for(int i=0;i<s.length();i++){
            a=s.charAt(i);
        }
        for(int j=0;j<s1.length();j++){
            a+=s1.charAt(j);
            String m=new String(a+"");
            System.out.println(m);
        }
    }
    
}
