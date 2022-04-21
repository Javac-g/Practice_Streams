package three;

import java.io.ByteArrayInputStream;

public class six {
     public static void main(String...args){

         String s = "abcdefghjiklmnopqrstuxywvz";
         byte[] b = s.getBytes();

         ByteArrayInputStream one = new ByteArrayInputStream(b);
         ByteArrayInputStream two = new ByteArrayInputStream(b,0,3);
         System.out.println(b.length);

     }

}
