package File.V3;

import java.io.File;
import java.io.FilenameFilter;

public class Two {

    public static void main(String...args){


        String dir = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V3";

        File f = new File(dir);

        FilenameFilter only = new Filtr("java");
        String[] s = f.list(only);

        for(int i = 0; i < s.length;i++){

            System.out.println(s[i]);
            
        }





    }

}
