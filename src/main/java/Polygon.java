import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Polygon {

    public static void main (String[] args) {

        try
        {
            FileWriter myWriter = new FileWriter("C:/Users/kitka/OneDrive/Рабочий стол/nums.txt");
            myWriter.write("id: 1230");
            myWriter.write("\nnested: false");
            myWriter.write("\nname: Vladimir");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.getStackTrace();
        } finally {
            System.out.println("Yep Yep");
        }



    }
//        // Get the file
//        try {
//            File f = new File("C:/Users/kitka/OneDrive/Рабочий стол/nums.txt");
//            String name = f.getName();
//            System.out.println(name);
//            String[] files = f.list();
//            for (int i = 0; i < files.length; i++) {
//                System.out.println(files[i]);
//
//            }
//            if (f.canWrite())
//                System.out.println("Can be Read");
//            else
//                System.out.println("Cannot be Read");
//        } catch (NullPointerException e) {
//            e.getStackTrace();
//        }
//    }



}
