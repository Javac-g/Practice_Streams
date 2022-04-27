package ByteArray_IO.V4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Two {

    public static void main(String...args){

        String s = "Hello its my test string";
        byte[] b = s.getBytes();
        int c;

        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b)){

            for(int i = 0; i < 2; i++){

                while ((c = byteArrayInputStream.read()) != -1){

                    if(i == 0){
                        System.out.print((char) c);
                    }else {
                        System.out.print(Character.toUpperCase((char)c));
                    }
                }
                System.out.println();
                byteArrayInputStream.reset();


            }

        }catch (IOException e){

            e.printStackTrace();

        }



    }
}
