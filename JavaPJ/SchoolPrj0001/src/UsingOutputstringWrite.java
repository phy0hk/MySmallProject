import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UsingOutputstringWrite {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("d:\\P0REZ\\data.txt");
            OutputStream out = Files.newOutputStream(p, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            PrintWriter pw = new PrintWriter(out,true);
            pw.printf("Testing: %s%n1234%n", "outputstream");
            pw.println("New data appeded");
            pw.close();
            out.close();
            System.out.println("Writing Success............"); 
            int gg = 1/0; 
        } catch (Exception e) { 
            e.getStackTrace();
            System.out.println("Ther is an error you idiot!!!");
        }
    }
}
