package JAVA.learnThread.synchronize;

public class hw1 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println((int)(100 * Math.random()));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
