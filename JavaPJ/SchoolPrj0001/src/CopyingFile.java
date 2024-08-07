import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyingFile {
    public static void main(String[] args) {
        Path source = Paths.get("d://P0REZ/E-CommerceProject0.rar");
        Path target = Paths.get("d://gg.rar");
        try {
            // Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            // System.out.println("Copy Success.....");
            // Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            //System.out.println("Move Success.....");
            Files.deleteIfExists(target);
            System.out.println("Delete Success");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}