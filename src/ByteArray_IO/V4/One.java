package ByteArray_IO.V4;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class One {

    public static void main(String...args) {


        String s = "Hello its my first string in byte array input stream";
        byte[] byteArray = s.getBytes();
        int c;

        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray)){

            for (int i = 0; i < 2; i++){

                while ((c = byteArrayInputStream.read()) != -1){
                    if(i == 0){
                        System.out.print((char)c);
                    }else{
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
