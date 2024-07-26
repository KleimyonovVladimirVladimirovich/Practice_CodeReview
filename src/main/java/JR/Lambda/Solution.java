package JR.Lambda;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
       /* Calculable summa = ((x, y) -> x + y);
        int calculate = summa.calculate(1, 2);
        System.out.println(calculate);

        Calculable substr = (((x, y) -> x - y));
        int calculate1 = substr.calculate(4, 2);
        System.out.println(calculate1);
        //Лямбда выражение - анонимный метод */

        List<Car> garage = new ArrayList<>();
        garage.add(new Car(Color.RED, "BWM", 999, 2004));
        garage.add(new Car(Color.GREEN, "LX", 777, 2014));
        garage.add(new Car(Color.YELLOW, "MATIS", 222, 2001));
        garage.add(new Car(Color.BLACK, "MASERATI", 888, 2020));
        garage.add(new Car(Color.WHITE, "McLaren", 1099, 2023));
        garage.add(new Car(Color.RED, "Lamb", 600, 1999));

        //System.out.println(selectedByColor(garage, Color.RED));
        List<Car> selected = garage.stream().filter(car -> car.color.equals(Color.RED)).filter(car -> car.year == 2004).collect(Collectors.toList());
        System.out.println(selected); //Одна строчка против целого метода.

        Stream<Car> carStream = garage.stream(); // boolean значения имеется или нет
        System.out.println(carStream.anyMatch(car -> car.color.equals(Color.RED)));


    }

    private static List<Car> selectedByColor(List<Car> list, Color c) {
        List<Car> selected = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).color == c) {
                selected.add(list.get(i));
            }
        }
        return selected;
    }

}

