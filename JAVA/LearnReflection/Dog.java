package JAVA.LearnReflection;

public class Dog {
    private int age;
    public String name;
    public static String time(){
        String str = System.currentTimeMillis() + "";
        return str;
    }
    public static void bark(){
        System.out.println("2222");
    }
    public void bite(){
        System.out.println("bite");
    }
    public void run(int n){
        System.out.printf("run %d steps", n);
    }
}
