package Input_Output_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIve {


    public static void main(String...args){
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        FileOutputStream f3 = null;
        String source = " hello its my default bytes test String";
        byte[] b = source.getBytes();
        System.out.println(b.length);
        try{
             f1 = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three\\one.txt");
             f2 = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three\\two.txt");
             f3 = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three\\three.txt");

            for (int i = 0 ; i < b.length; i+=2){
                f1.write(b);
                f2.write(b[i]);
                f3.write(b,b.length- b.length/4,b.length/4);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                f1.close();
            }catch (IOException e1){
                System.out.println("f1 close error");
            }
            try {
                f2.close();
            }catch (IOException e2){
                System.out.println("f2 close error");
            }
            try {
                f3.close();
            }catch (IOException e3){
                System.out.println("f3 close error");
            }


        }

    }








}
