public class Threads1 extends Thread{
    int c=0;
    public void run(){
        for(int i=0;i<=200;i++){
            c++;
        }
        System.out.println("CT "+Thread.currentThread().getName());
        System.out.println("PT "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        Threads1 t1=new Threads1();
        Thread t2=new Thread(t1,"T1");
        Thread t3=new Thread(t1,"T2");
        t2.setPriority(1);
        t3.setPriority(MAX_PRIORITY);
        t2.start();
        t3.start();
    }
}
