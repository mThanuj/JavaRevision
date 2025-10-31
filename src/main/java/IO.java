import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IO {

    static void main() {

        Scanner sc = new Scanner(System.in);

        File f = new File("some.txt");
        Scanner sc1 = null;

        try {
            sc1 = new Scanner(f);
        } catch (FileNotFoundException exception) {
            System.out.println("File led ra");

            try {
                f.createNewFile();

                sc1 = new Scanner(f);
            } catch (IOException exception1) {
                System.out.println("Cant do anything");
                return;
            }
        }


        String data = sc1.nextLine();

        System.out.println(data);

    }

}
