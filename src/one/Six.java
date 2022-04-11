package one;

import java.io.FileInputStream;
import java.io.IOException;

public class Six {


    public static void main(String...args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int i;
        if( args.length != 1){

            System.out.println("Enter file");

        }

        try {
            do{
               i = fileInputStream.read();

               if(i != -1){
                   System.out.print((char)i);
               }
            }while (i != -1);
        }catch (IOException e){
            System.out.println("read error");
        }finally {


            fileInputStream.close();


        }



    }
}
