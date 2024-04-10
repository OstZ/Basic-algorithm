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
        StringBuffer sb0 = new StringBuffer();
        sb0.append(2);
        sb0.append('x');
        sb0.append("弄");
        System.out.println(sb0.indexOf("2"));
        System.out.println(sb0.toString());
    }
}
class myException extends RuntimeException{
    public myException(){}
    public myException(String message){
        super(message);
    }
}
