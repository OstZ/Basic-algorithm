package JAVA;

public class LearnInnerClass {
    private static int myint = 23;
    private void f0(){
        System.out.println("f0");
    }
    public void f2(){
        final class inner{
            private final int myint = 90;
            private void f0(){
                System.out.println(LearnInnerClass.myint);
                System.out.println("inner 99");
            }
        }
        new inner().f0();
    }

    public static void main(String[] args) {
        LearnInnerClass lic = new LearnInnerClass();
        lic.f2();
    }
}

class Car{
    private double temperature;
    public Car(double temp){
        temperature = temp;
    }
    private class Air{
        void flow(){
            if(Car.this.temperature > 40){
                System.out.println("blow cool air");
                temperature -= 5;
            } else if(Car.this.temperature < 0){
                System.out.println("blow hot air");
                temperature += 5;
            } else return;
        }
    }
    public void useAir(){
        new Air().flow();
    }

    public static void main(String[] args) {
        Car car = new Car(60);
        car.useAir();
    }
}
