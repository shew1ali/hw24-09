import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class CreateFile {
    StringBuilder sb = new StringBuilder();
    private String packPath;

    public void createPack(String packPath) {
        this.packPath = packPath;
        try {
            File file = new File(packPath);
            file.mkdir();
            sb.append("Папка" + " " + packPath + " " + "создана");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile())
                sb.append("Фаил" + " " + filePath + " " + "создан");
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void SaveInfo() {
        try (FileWriter wr = new FileWriter("D://Games/temp/temp.txt", true)) {
            wr.write(sb.toString());
            wr.append('\n');
            wr.append('!');
            wr.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}