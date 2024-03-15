import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class ViDu_Files {
    public static void main(String[] args) {
        Path source = Paths.get("E:\\temp\\Test\\Test.txt");
        Path newdir = Paths.get("E:\\temp\\Test\\New folder");
        try{
            Files.copy(source, newdir.resolve(source.getFileName()));
        }catch ( Exception e){
            e.printStackTrace();
        }

    }
}
