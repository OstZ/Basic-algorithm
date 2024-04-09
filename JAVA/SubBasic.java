package JAVA;

public class SubBasic extends Basic{
    public static int age = 20;
    static {
        System.out.println("i am code block.");
    }
    {
        System.out.println("i am commen code block");
    }
    public SubBasic(int age, int num, int id) {

        super(age, num, id);
        System.out.println("2333");
    }
    public SubBasic(){
        this(22,2,22);
    }

    @Override
    public void getAge() {
        super.getAge();
    }

    public void tell(){
        System.out.println(this.getClass());
    }

    public static void prt(){
        System.out.println("sub");
    }
    public static void main(String[] args) {
        //SubBasic sb0 = new SubBasic(23,333,33);
        SubBasic.prt();
    }
}
