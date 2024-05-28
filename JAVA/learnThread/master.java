package JAVA.learnThread;

public class master {
    public static void main(String[] args) {
        Thread t0 = new Thread(new Dog());
        t0.start();
    }
}
