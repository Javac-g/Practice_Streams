package one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class seven {
    public static void main(String...args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        int i;

        if (args.length != 2){
            System.out.println("files must be two");
        }

        try{
            do{

                i = fileInputStream.read();
                if(i != -1){
                    fileOutputStream.write(i);
                }

            }while (i != -1);
        }catch (IOException e){

            System.out.println("Error: " + e);

        }finally {
            fileInputStream.close();
            fileOutputStream.close();
        }



    }
}
