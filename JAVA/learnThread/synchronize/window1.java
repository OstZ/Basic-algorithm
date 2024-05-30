package JAVA.learnThread.synchronize;

public class window1 extends Thread{
    private static int tickets = 500;
    private static int soldTik = 0;
    private static Object o0 = new Object();
    @Override
    public void run(){
        while(tickets > 0){
            synchronized (o0){
                if(tickets <= 0) return;

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " sell 1 ticket and " + --tickets + " left");
                soldTik++;
            }
        }
    }
    public int getSoldTik(){
        return soldTik;
    }
}
