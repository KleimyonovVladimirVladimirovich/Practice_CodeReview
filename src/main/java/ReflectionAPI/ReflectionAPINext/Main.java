package ReflectionAPI.ReflectionAPINext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final AtomicInteger integer = new AtomicInteger(0);
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, InterruptedException {
//        Employee employee1 = Employee.class.newInstance();
//        System.out.println(employee1.getAge() + " :Age");

        //ЧЕРЕЗ forName
        try {
            Class<?> aClass = Class.forName("ReflectionAPINext.Employee"); //Указывать таким способом
            System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        //Если доступен тип, но нет экземпляра
        Class<Employee> employee = Employee.class;
        System.out.println(Arrays.toString(employee.getDeclaredFields()));

        System.out.println();

        //Можно через getClass
        Employee employee1 = new Employee("V", "0", 19);
        Class<? extends Employee> aClass = employee1.getClass();

        Constructor<?>[] declaredConstructors = Employee.class.getConstructors(); //Declared - вывод всего
        System.out.println(Arrays.toString(declaredConstructors)); //все конструкторы
        Employee o = (Employee) declaredConstructors[0].newInstance("A", "B", 9); //первый конструктор и  создание и инициализация нового экземпляра этого конструктора
        //System.out.println(o.getAge());
        //System.out.println(o.getId());
        Method[] declaredMethods = Employee.class.getDeclaredMethods();
        List<Method> methodList = List.of(declaredMethods);
        for (Method method : methodList) {
            System.out.println(method.getModifiers());
        }

    }
}