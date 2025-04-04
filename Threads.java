public  class Threads implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("i "+i);
        }
    }
    public static void main(String[] args) {
        Threads t1=new Threads();
        Thread t2=new Thread(t1);
        t2.start();
        
    }
}
