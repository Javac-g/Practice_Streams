package File.V1;

import java.io.File;
import java.io.FilenameFilter;

public class three {
    public static void main(String...args){
        String dir = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three";

        File f = new File(dir);

        FilenameFilter only = new Test("txt");

        String[] s = f.list(only);

        for (int x = 0 ; x <= s.length-1;x++){

            System.out.println(s[x]);

        }




    }
}
