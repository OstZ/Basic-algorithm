package JAVA.LearnReflection;

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
        Field[] fields = cls.getDeclaredFields();
        System.out.println(fields);

        //change name
        Field field = cls.getField("name");
//        System.out.println(field.getName());
        field.set(obj, "mike");
        System.out.println(field.get(obj));

        //use method
        Class<?> clstmp = int.class;
        Method mtd = cls.getMethod("run", clstmp);
        mtd.invoke(obj, 23);



    }
}
