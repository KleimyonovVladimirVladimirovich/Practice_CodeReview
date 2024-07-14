package Method;

public class DeveloperRunTime {

    public static void main(String[] args) {

        Developer dev = new Developer();
        Developer filldev = new Developer(1, "Vova", "C++", 3);
        Developer doctorMasha = new Developer(777, "Maria Andreeva", "Doctor", 39);
        Run(dev,filldev);
        System.out.println(doctorMasha);

        Engineer engineer = new Engineer();


        System.out.println("-".repeat(100));
        Engineer FillEngineer = new Engineer(0, "Maria Andreeva", "Biology-Engineer\sP", 1);
        System.out.println("Данные загружаются ... " + FillEngineer);
    }


    //выдумал чушь ниже
    public static void Run(Developer dev, Developer filldev) {
        System.out.println(dev);
        System.out.println(filldev);
    }
}
