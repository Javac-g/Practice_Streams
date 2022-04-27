package File.V4;

import java.io.File;

public class One {
    public static void main(String...args){
        String s ="C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\";

        File fold = new File(s);

        if(fold.isDirectory()){

            System.out.println("Catalog: " + s);

            String[] files = fold.list();

            for (int i = 0; i < files.length; i++){

                File next = new File(s + "/" + files[i]);

                if(next.isDirectory()){

                    System.out.println("Catalog: " + files[i]);

                }else{

                    System.out.println("File: " + files[i]);

                }

            }


        }else {
            System.out.println("Not catalog: " + s);
        }







    }
}
