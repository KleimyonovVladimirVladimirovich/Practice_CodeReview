import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
//        try {
//            File file = new File("C:/Users/kitka/OneDrive/Рабочий стол/nums.txt");
//            Scanner myReader = new Scanner(file);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error");
//            e.getStackTrace();
//        }
        try {
            File myObj = new File("C:/Users/kitka/OneDrive/Рабочий стол/JavBest.txt");
            if (myObj.createNewFile()) {
                System.out.println("Created Successfully: " + myObj.getName());
            } else {
                System.out.println("Sorry, File Exists.");
            }
        } catch (IOException e) {
            System.out.println("Error.....");
            e.getStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("C:/Users/kitka/OneDrive/Рабочий стол/JavBest.txt");
            fileWriter.write("Hellow ");
            fileWriter.write("Me ");
            fileWriter.write("Love ");
            fileWriter.write("Java");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
