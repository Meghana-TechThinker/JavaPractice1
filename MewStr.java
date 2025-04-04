import java.util.*;
public class MewStr {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        String t=obj.next();
        //String res="";
        /*char ch[]=s.toCharArray();
        char th[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(th);
        for(int i:ch){
            for(int j:th){
                if (ch[i]!=th[j]){
                    System.out.println(th[i]);
                }
            }
    
        }*/
        int res=0,res1=0;
        for(int i=0;i<s.length();i++){
            res+=(int)s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            res1+=(int)t.charAt(j);
        }
        int res2=res1-res;
        System.out.println((char)res2);

    }  
}
