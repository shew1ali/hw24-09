import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public CreateFile createFile(String filePath) {
        try {
            File file = new File(filePath);
            file.mkdirs();
            if (file.createNewFile())
                System.out.println("Файл создан");
        } catch (Exception e) {
            System.err.println(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Файл" + " " + filePath +" "+ "создан");
        try (FileWriter wr = new FileWriter("D://Games/temp/temp.txt", true)) {
            wr.write(sb.toString());
            wr.append('\n');
            wr.append('!');
            wr.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
