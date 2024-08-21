package ReflectionAPI;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MainEmployee {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Employee employee1 = Employee.class.newInstance();
//        System.out.println(employee1.getAge() + " :Age");
        try {
            Class<?> aClass = Class.forName("src.main.java.ReflectionAPI.Employee");
            System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        try {
//            Class<?> aClass = Class.forName("src.main.java.ReflectionAPI.Employee");
//            System.out.println(Arrays.toString(aClass.getDeclaredFields()));
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
