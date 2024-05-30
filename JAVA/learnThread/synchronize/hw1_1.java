package JAVA.learnThread.synchronize;

import java.util.Scanner;

public class hw1_1 extends Thread{
    @Override
    public void run(){
        Scanner s1 = new Scanner(System.in);
        while(true){
            if(s1.hasNext() && s1.next().equals("Q")) break;
        }
    }
}
