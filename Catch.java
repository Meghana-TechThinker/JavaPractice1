public class Catch {
    public static void main(String[] args) {
        try{
            int n=args.length;
            int a=45/n;
            System.out.println("division:"+a);    
            int[]b={10,20,30,40};
            b[8]=100;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }
    }
}
