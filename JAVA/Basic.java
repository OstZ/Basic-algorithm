package JAVA;

import java.util.Arrays;

public class Basic {
    private int age = 10;
    int num = 10;
    protected int id = 9;
    public Basic(int age, int num, int id){
        this.age = age;
        this.num = num;
        this.id = id;
    }
    public void tell(){
        System.out.println(this.getClass());
    }
    public void getAge(){
        int age = 20;
        System.out.println(this.age);
    }
    public static void prt(Basic b){
        b.getAge();
    }

    public static void main(String[] args) {
    }
}
