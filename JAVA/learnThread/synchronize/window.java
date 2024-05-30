package JAVA.learnThread.synchronize;

public class window implements Runnable{
    private int tickets = 300;
    private int soldTik = 0;
    @Override
    public void run(){
        while(tickets > 0) toSell();
    }
    public synchronized void toSell(){
        if(tickets <= 0) return;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " sell 1 ticket and " + --tickets + " left");
        soldTik++;
    }
    public int getSoldTik(){
        return soldTik;
    }
}
