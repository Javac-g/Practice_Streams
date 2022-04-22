package ByteArray_IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class six {
     public static void main(String...args){

         String s = "abcdefghjiklmnopqrstuxywvz";
         byte[] b = s.getBytes();



         try( ByteArrayInputStream one = new ByteArrayInputStream(b);
              ByteArrayInputStream two = new ByteArrayInputStream(b,0,3);){

             for (int i = 0; i < 2; i++){
                 int c;
                 while ((c = two.read()) != -1){
                     if(i == 0){
                         System.out.print((char)c);
                     }else {
                         System.out.print(Character.toUpperCase((char)c));
                     }
                 }
                 System.out.println();
                 two.reset();
             }

         }catch (IOException e){
            e.printStackTrace();
         }


     }

}
