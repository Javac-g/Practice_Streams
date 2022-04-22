package File.V2;

import java.io.File;

public class One {
    public static void main(String...args){
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V2\\";
        String name = "A.jpg";

        File f = new File(path+name);
        System.out.println(f.exists());




    }
}
