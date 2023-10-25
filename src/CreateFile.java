import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
    private StringBuilder sb = new StringBuilder();
    private String packPath;

    public void createPack(String packPath) {
        this.packPath = packPath;
        try {
            File file = new File(packPath);
            if(file.mkdir()){
                sb.append("Папка" + " " + packPath + " " + "создана");
            } else {
                sb.append("Папка " + packPath + " не создана\n");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                sb.append("Фаил" + " " + filePath + " " + "создан");
            } else {
                sb.append("Файл " + file + " не создан\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void saveInfo(String filePath) {
        try (FileWriter wr = new FileWriter(filePath, true)) {
            wr.write(sb.toString());
            wr.append('\n');
            wr.append('!');
            wr.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}