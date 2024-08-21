package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//РЕФЛЕКСИЯ - Исследование класса

public class Main {
    public static void main(String[] args) {
        //Вывод всех полей
        Field[] fields = Person.class.getDeclaredFields(); //команда на вывод прям всех полей
        List<Field> fieldList = List.of(fields);
        for (Field field : fieldList) {
            System.out.println(field);
        }
        System.out.println("-".repeat(100));

        System.out.println("РЕФЛЕКСИЯ ПО ПОЛЯМ");
    //ЛУЧШЕ ВЫВОДИТЬ ЧЕРЕЗ FOREACH
        fieldList.forEach(e -> System.out.println("Field type: " + e.getType() + "  |-> Number modifiers: " + e.getModifiers()));
        System.out.println();
        fieldList.forEach(e -> System.out.println("Annotation type: " + Arrays.stream(e.getDeclaredAnnotations()).toList()));
        System.out.println();
        fieldList.forEach(e -> System.out.println(e.getGenericType()));
        System.out.println();

        System.out.println("РЕФЛЕКСИЯ ПО МЕТОДАМ");
        Method[] declaredMethods = Person.class.getDeclaredMethods(); //DeclaredMetods не лезит в родителя в отличие от getMetods (не выводит методы Object)
        List<Method> methodList = List.of(declaredMethods);
        for (Method method : methodList) {
            System.out.println(method);
        }

        System.out.println();
        Method declaredMethod = declaredMethods[0];
        System.out.println(declaredMethod.getParameterCount()); //getname
        System.out.println(Arrays.toString(declaredMethod.getParameterTypes())); //getname

    }
}
