package JAVA.learnThread;

public class Cat extends Thread{
    @Override
    public void run(){
        int times = 0;
        while(true){
            System.out.println("what can i say" + times++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times > 9) break;
        }
    }
}
