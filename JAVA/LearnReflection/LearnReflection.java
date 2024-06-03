package JAVA.LearnReflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearnReflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        String str = "JAVA.LearnReflection.Dog";
        Class cls = Class.forName(str);
        Object obj = cls.getConstructor().newInstance();
        System.out.println("cls.getName(): " + cls.getName());
        Method method1 = cls.getMethod("time");
        method1.invoke(obj);
        Class<?> cls1 = cls.getSuperclass();
        System.out.println(cls1.getName());

        //fields
        Field field = cls.getDeclaredField("name");
        System.out.println("modifier: " +field.getModifiers());
        System.out.println(field);

        //change name
//        Field field = cls.getField("name");
//        System.out.println(field.getName());
//        field.set(obj, "mike");
        System.out.println(field.get(obj));

        //use method
        Class<?> clstmp = int.class;
        Method mtd = cls.getMethod("run", clstmp);
        mtd.invoke(obj, 23);

        //class for class
        Class clsnow = Class.forName("java.lang.Class");
        System.out.println("clsnow: " + clsnow.getName());

        //static method
        Method mtds = cls.getMethod("bark");
        mtds.invoke(null);

        //
        hw02();

    }
    public static void hw02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //get class obj of file
        Class filecls = Class.forName("java.io.File");
        //print constructors
        Constructor<?>[] csts = filecls.getConstructors();
        for (Constructor<?> cststmp : csts) {
            System.out.println(cststmp);
        }
        //create file obj
        Object objfile = filecls.getConstructor(String.class).newInstance("/home/zsm/CS/books/DSA/code/JAVA/LearnReflection/re.txt");
        Method filemtd = filecls.getMethod("createNewFile");
        filemtd.invoke(objfile);
    }
}
