package JR.Lambda;

public class Car {
     Color color;
     String name;
     int power;
     int year;

    @Override
    public String toString() {
        return "Car = {" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", year=" + year +
                '}';
    }

    public Car(Color color, String name, int power, int year) {
        this.color = color;
        this.name = name;
        this.power = power;
        this.year = year;
    }
}
