package JAVA;

public class SubBasic extends Basic{
    public SubBasic(int age, int num, int id) {
        super(age, num, id);
    }

    @Override
    public void getAge() {
        super.getAge();
    }

    public void tell(){
        System.out.println(this.getClass());
    }

    public void prt(){
        System.out.println(num);
        System.out.println(id);
    }
    public static void main(String[] args) {
    }
}
