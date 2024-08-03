package patterns.factorymethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Car implements Transport {

    private List<String> acsessiries = new ArrayList<>();
    private String name;

    public Car(List<String> acsessiries, String name) {
        this.acsessiries = acsessiries;
        this.name = name;
    }
    public Car() {}

    public List<String> getAcsessiries() {
        return acsessiries;
    }
    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
        acsessiries.add("Тушитель пукана");
        acsessiries.add("Подзадница нормальная бля");
        acsessiries.add("Магнитола");
        acsessiries.add("Колесо 1 шт");
    }

    @Override
    public String toString() {
        return "Car = " + this.name +
                "\nacsessiries = "
                +  acsessiries +
                "\nname = "
                + " " + name
                + '\n';
    }

    public static void main(String[] args) {
        Car car = new Car("AssShore");
        System.out.println(car);

        Car careta = new Car("HellowMasafaka");
        System.out.println(careta);
    }
}


class Motorcycle implements Transport {

//    ...

}
