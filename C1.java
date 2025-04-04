public class C1 {
    int x;
    void xample(){
        System.out.println(+x);
        System.out.println("Hi !!");
    }
    public static void main(String[] args) {
        C1 ch=new C1();
        ch.x=10;
        System.out.println("from main method");
        ch.xample();
    }
}
