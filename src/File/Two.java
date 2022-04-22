package File;

import java.io.File;

public class Two {

    public static void main(String...args){

        String dir = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three";

        File f = new File(dir);

        if (f.isDirectory()){

            System.out.println("Catalog: " + dir);

            String[] s = f.list();

            for (int i = 0; i <= s.length-1; i ++){

                File f1 = new File(dir + "/" + s[i]);

                if(f1.isDirectory()) {

                    System.out.println("Catalog: " + s[i]);
                }
                else {
                    System.out.println("File: " + s[i] );
                }
            }
        }else {
            System.out.println("Not Catalog: " + dir);
        }


    }
}
