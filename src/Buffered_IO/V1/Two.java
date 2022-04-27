package Buffered_IO.V1;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class Two {
    public static void main(String...args){

        String s = "Hello its my first string";
        byte[] b = s.getBytes();
        int c;

        ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(b);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);








    }
}
