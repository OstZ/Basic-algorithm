package JAVA.learnThread;

public class Dog implements Runnable{
    @Override
    public void run(){
        int times = 0;
        while(times < 10){
            System.out.println("Man!!" + times++);
            try {
                Thread.sleep(399);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
