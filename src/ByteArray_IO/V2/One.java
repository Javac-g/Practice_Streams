package ByteArray_IO.V2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class One {
    public static void main(String... args) throws IOException {

        String s = "abcdefghkijlmnopqrstuxvwyz";
        byte[] b = s.getBytes();

        try(ByteArrayInputStream I = new ByteArrayInputStream(b)){
            int c;
            do{
                c = I.read();
                if(c != -1){
                    System.out.println((c) + ": " + Integer.toBinaryString(c));
                }
            }while (c != -1);



        }catch (IOException e){
            e.printStackTrace();
        }







    }
}
