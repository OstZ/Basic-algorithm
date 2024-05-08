package JAVA.LearnCollection;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<Car> al0 = new ArrayList<>();
        al0.add(new Car("BMW", 400000));
        al0.add(new Car("Bentley", 5000000));
        System.out.println(al0.size());
        Car tmp = al0.get(1);
        al0.remove(tmp);
        al0.add(new Car("BYD", 79800));
        al0.addAll(al0);
        System.out.println(al0);

    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.price = price;
        this.name = name;
    }
     @Override
     public String toString(){
        return name + " worth " + price;
     }
}