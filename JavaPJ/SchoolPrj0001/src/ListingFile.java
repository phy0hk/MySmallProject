import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ListingFile {

    public static void main(String[] args){
        Path FilePath = Paths.get("d:\\P0REZ");
        try {
            if (Files.isDirectory(FilePath)) {
                Files.walk(FilePath,1).forEach((t)->
                System.out.println(t)
                );
            }else{
                System.out.println("Not a folder");
            }
        File file = new File("d:\\P0REZ");
        System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}