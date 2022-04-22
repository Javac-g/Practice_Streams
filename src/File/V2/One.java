package File.V2;

import java.io.File;

public class One {
    public static void main(String...args){
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V2\\";
        String name = "A.jpg";

        File f = new File(path+name);
        System.out.println(f.exists());

        File dir = new File(path);
        if(dir.isDirectory()){
            System.out.println("Catalog: " + dir);
            String[] s = dir.list();

            for (int i = 0; i < s.length; i++){
                File file = new File(s[i]);
                if(file.isDirectory()){
                    System.out.println("Catalog: " + s[i] );
                }else {
                    System.out.println("File: + " +  s[i]);
                }
            }




        }else {
            System.out.println("Not  catalog: " + dir);
        }



    }
}
