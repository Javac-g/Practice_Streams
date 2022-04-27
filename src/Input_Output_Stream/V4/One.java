package Input_Output_Stream.V4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class One {
    public static void main(String...args){

        String s = "King Euvoran of the Ustaim city Aramoam grows weary of overseeing justice for petty criminals. " ;
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Input_Output_Stream\\V4\\";
        int c;
        byte[] b = s.getBytes();





        try( FileOutputStream A = new FileOutputStream(path + "A.txt",true);
             FileInputStream AA = new FileInputStream(path+"A.txt")) {

            for (int i = 0; i < b.length; i ++){

                A.write(b);
            }
            while ((c = AA.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){

            e.printStackTrace();

        }finally {
            System.out.println("DONE");
        }






    }
}
