package two;

import java.io.File;

public class three {
    public static void main(String...args){
        String dirname = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\two";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("catalog: " + dirname);
            String[] s = f1.list();

            for(int i = 0; i < s.length; i++){
                File f = new File((dirname + "/" + s[i]));
                if(f.isDirectory()){
                    System.out.println(s[i] + "  is catalog");

                }else{
                    System.out.println(s[i] + " is File");
                }
            }
        }else{
            System.out.println(dirname + " not catalog");
        }





    }
}
