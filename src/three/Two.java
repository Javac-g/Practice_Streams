package three;

import java.io.File;

public class Two {
    public static void main(String...args){
        String dir = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three";
        File f = new File(dir);
        if (f.isDirectory()){
            System.out.println("Catalog: " + dir);
            String[] s = f.list();
            for (int i = 0 ; i < s.length; i++){
                File f1 = new File(dir+ "/" + s[i]);
                if(f1.isDirectory()){
                    System.out.println(s[i] + " :catalog");
                }
                else{
                    System.out.println(s[i] + " :File");
                }
            }

        }else{
            System.out.println(dir + ": not catalog");
        }


    }
}
