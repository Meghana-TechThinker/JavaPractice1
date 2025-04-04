class P5 {
    P5(){
        System.out.println("Parent constructor");
    }
}
class Super2  extends P5{
    Super2(){
        //super();
        System.out.println("child constructor");
    }
    public static void main(String[] args) {
        Super2  m1=new Super2 ();
    }
}