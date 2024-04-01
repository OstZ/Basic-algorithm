package JAVA;

import java.util.Arrays;

public class Basic {
    private int age = 10;
    public void getAge(){
        int age = 20;
        System.out.println(this.age);
    }
    public static void prt(Basic b){
        b.getAge();
    }

    public static void main(String[] args) {
        new Basic().getAge();
        Basic b;
    }
}
