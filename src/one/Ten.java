package one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ten {
    public static void main(String...args) throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream(args[0]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[1]))    {

            int i;

            do{
                i = fileInputStream.read();
                if(i != -1){
                    fileOutputStream.write(i);
                }
            }while (i != -1);

        }



    }
}
