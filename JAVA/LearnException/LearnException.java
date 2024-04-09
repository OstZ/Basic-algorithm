package JAVA.LearnException;

import edu.princeton.cs.algs4.In;

public class LearnException {
    public static int calculate(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){

    }
}
class myException extends RuntimeException{
    public myException(){}
    public myException(String message){
        super(message);
    }
}
