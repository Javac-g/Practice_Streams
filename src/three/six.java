package three;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class six {
     public static void main(String...args){

         String s = "abcdefghjiklmnopqrstuxywvz";
         byte[] b = s.getBytes();
         int c = 0;


         try( ByteArrayInputStream one = new ByteArrayInputStream(b);
              ByteArrayInputStream two = new ByteArrayInputStream(b,3,3);){

             do{
                 for (int i = 0; i < b.length; i++){
                     c = two.read();
                     if(c != -1){
                         System.out.print((char)c + " ");
                     }
                 }
             }while (c != -1);

         }catch (IOException e){
            e.printStackTrace();
         }


     }

}
