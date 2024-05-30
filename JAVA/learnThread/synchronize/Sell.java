package JAVA.learnThread.synchronize;

import java.awt.*;

public class Sell {
    public static void main(String[] args) {
//        window1 w0 = new window1();
//        window1 w1 = new window1();
//        window1 w2 = new window1();
//        w0.start();
//        w1.start();
//        w2.start();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Sold Ticket: " + w0.getSoldTik());
        hw1 hw = new hw1();
        hw.setDaemon(true);
        hw1_1 hw0 = new hw1_1();
        hw0.start();
        hw.start();
    }
}
