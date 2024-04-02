package JAVA;

public class GrandSubBasic extends SubBasic{
    public GrandSubBasic(int age, int num, int id) {
        super(age, num, id);
    }

    public static void main(String[] args) {
        GrandSubBasic gsb = new GrandSubBasic(23,33,3);
        SubBasic sb0 = new SubBasic(88,99,88);
        SubBasic sb1 = sb0;
        System.out.println(sb1 instanceof GrandSubBasic);
        System.out.println(sb1 instanceof SubBasic);
        System.out.println(sb1 instanceof Basic);
    }
}
