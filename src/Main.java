import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> paths = new ArrayList<>();
        paths.add("D://Games/src");
        paths.add("D://Games/res");
        paths.add("D://Games/savegames");
        paths.add("D://Games/temp");
        paths.add("D://Games/src/main");
        paths.add("D://Games/src/test");
        paths.add("D://Games/res/drawables");
        paths.add("D://Games/res/vectors");
        paths.add("D://Games/res/icons");
        CreateFile a = new CreateFile();
        for (int i = 0; i < paths.size(); i++) {
            a.createPack(paths.get(i));
        }
        a.saveInfo("D://Games/temp/temp.txt");


        ArrayList <String> files = new ArrayList<>();
        files.add("D://Games/src/main/Main.java");
        files.add("D://Games/src/main/Utils.java");
        files.add("D://Games/temp/temp.txt");
        CreateFile b = new CreateFile();
        for (int i =0; i < files.size(); i++) {
            b.createFile(files.get(i));
        }
        b.saveInfo("D://Games/temp/temp.txt");
    }
}