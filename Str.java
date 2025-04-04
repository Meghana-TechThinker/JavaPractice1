import java.util.*;
public class Str {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        String res="";
        char ch[] =s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch1=ch[i];
            if((ch[i]>='A')&&(ch[i]<='Z')){
                ch1=Character.toLowerCase(ch[i]);
            }
            else{
                ch1=Character.toUpperCase(ch[i]);
            }
            System.out.print(ch1);
        }
        //System.out.println(ch1);


    }
    
}
