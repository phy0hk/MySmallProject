import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UsingInputString {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:\\P0REZ\\data.txt");
            InputStream IS = Files.newInputStream(path);
            InputStreamReader ISR = new InputStreamReader(IS);
            BufferedReader BR = new BufferedReader(ISR);
            String line = BR.readLine();
            while (line!=null){
                System.out.println(line);
                line = BR.readLine();
            }
            BR.close();
            ISR.close();
            IS.close();
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Using scaner.....");
            Scanner sc = new Scanner(Files.newInputStream(Paths.get("d:\\P0REZ\\data.txt")));
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
