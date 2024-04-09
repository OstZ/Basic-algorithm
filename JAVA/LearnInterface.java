package JAVA;

public class LearnInterface implements B{
    @Override
    public void prt() {
        System.out.println(2333);
    }

    public static void main(String[] args) {
        A one = new LearnInterface();
        B tow = new LearnInterface();
        one.prt();
        tow.prt();

    }
}
interface A {
    void prt();
}
interface B extends A{}

interface Vehicle{
    void work();
}
class Horse implements Vehicle{
    @Override
    public void work(){
        System.out.println("ride horse");
    }
}
class Boat implements Vehicle{
    @Override
    public void work(){
        System.out.println("on boat");
    }
}
class VehicleFactory{
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicle veh;
    public Person(String str, Vehicle veh){
        name = str;
        this.veh = veh;
    }

    public static void main(String[] args) {
        String circu = "river";
        Person p0;
        if(circu.equals("river")) p0 = new Person("Jack", VehicleFactory.getHorse());
        p0 = new Person("Jack", VehicleFactory.getBoat());
    }
}
