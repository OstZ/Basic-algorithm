package JAVA;

import javax.swing.*;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Vector;

public class Basic {
    private int age = 10;
    int num = 10;
    protected int id = 9;
    public Basic(){}

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
    public static void prt(){
        System.out.println("Basic");;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("2333", 2333);
        tm.put("34444", 2333);
    }
}
