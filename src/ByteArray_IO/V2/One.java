package ByteArray_IO.V2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class One {
    public static void main(String... args) throws IOException {
        String s = "abcdefghijklmnopqrstuxvwyz";
        byte[] b = s.getBytes();

        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b,0,3)) {

            for (int i = 0; i < 2; i++){
                int c;
                while ((c = byteArrayInputStream.read()) != -1){

                    if(i == 0){
                        System.out.print((char)c);
                    }else {
                        System.out.print(Character.toUpperCase((char)c));
                    }

                }
                System.out.println();
                byteArrayInputStream.reset();

            }

        }






    }
}
