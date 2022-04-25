package Input_Output_Stream.V3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Five {



     public static void main(String...args){
         FileOutputStream A = null;
         FileOutputStream B = null;
         FileOutputStream C = null;

         String sourse = "Hello my friends, its my test string";
         byte[] b = sourse.getBytes();

         try{

             A = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Input_Output_Stream\\V3\\A.txt");
             B = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Input_Output_Stream\\V3\\B.txt");
             C = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Input_Output_Stream\\V3\\C.txt");

             for (int i = 0 ; i <b.length;i++){
                 A.write(b);
                 B.write(b[i]);
                 C.write(b.length-2);


             }



         } catch (IOException e) {
             throw new RuntimeException(e);
         }finally {
             try {
                 A.close();
             }catch (IOException e1){
                 System.out.println("f1 close error");
             }
             try {
                 B.close();
             }catch (IOException e2){
                 System.out.println("f2 close error");
             }
             try {
                 C.close();
             }catch (IOException e3){
                 System.out.println("f3 close error");
             }


         }


     }



}
