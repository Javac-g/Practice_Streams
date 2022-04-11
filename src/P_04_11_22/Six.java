package P_04_11_22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
