package JAVA.learnThread;

public class master {
    public static void main(String[] args) {
        Thread t0 = new Thread(new Dog());
        for(int i = 0; i < 10; ++i){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i == 5){
                t0.start();
                try {
                    t0.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
