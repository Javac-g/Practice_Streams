package File.V3;

import java.io.File;

public class One {
    public static void main(String...args){
        String dir = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V3";
        File file = new File(dir);
        System.out.println(file.exists());

        if(file.isDirectory()){
            System.out.println("Catalog: " + file);
            String[] s = file.list();

            for(int i = 0 ; i < s.length; i++){

                File f = new File(s[i]);
                if(f.isDirectory()){
                    System.out.println("Catalog: " + s[i]);
                }else{
                    System.out.println("File: " + s[i]);
                }


            }



        }else {
            System.out.println("Not catalog: " + file);
        }




    }
}
