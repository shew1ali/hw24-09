import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Stream;

import static javax.print.attribute.standard.MediaSizeName.D;

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
        paths.add("D://Games/temp/temp.txt");
        for (int i =0; i < paths.size(); i++){
            CreateFile file = new CreateFile().createFile(paths.get(i));
            i++;
        }
    }
}