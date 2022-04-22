package File.V2;

import java.io.File;
import java.io.FilenameFilter;

public class Two {

    public static void main(String...args){

        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V2\\";
        String name = "A.jpg";

        File f = new File(path);

        FilenameFilter only = new Filter("java");

        String[] s = f.list(only);
        for (String x : s){
            System.out.print(x + " ");
        }




    }
}
