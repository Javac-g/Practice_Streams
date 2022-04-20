package two;

import java.io.File;
import java.io.FilenameFilter;

public class fourF {

    public static void main(String...args){

        String dirname = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\two";

        File f1 = new File(dirname);

        FilenameFilter only = new four("java");

        String[] s = f1.list(only);

        for(int i = 0; i < s.length; i++){

            System.out.println(s[i]);

        }


    }

}
