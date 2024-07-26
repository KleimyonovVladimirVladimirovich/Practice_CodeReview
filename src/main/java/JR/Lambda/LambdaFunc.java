package JR.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaFunc {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        //forEach метод выводит построчно
        // list.forEach((x) -> System.out.println(x)); - 1 реализация синт. сахара
        //list.forEach(System.out::println); - 2 реализация синт. сахара
        System.out.println(list);

        StringComparator stringComparator = new StringComparator();
        int compare = stringComparator.compare(list.get(0), list.get(2));

        System.out.println(Math.abs(compare));


        Collections.sort(list, new StringComparator());
        System.out.println(list);

        //Компаратор со скрытым классом
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);

        //КОМПАРАТОР на лямбде
        Comparator<String> comparator1 = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(list, comparator);
        System.out.println(list);

    }
}
