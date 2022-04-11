package one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class eight {
    public static void main(String...args){

        FileInputStream fileInputStream  = null;
        FileOutputStream fileOutputStream = null;

        int i;

        if(args.length != 2){
            System.out.println("Must be two files");
        }

        try{

            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);

            do{
                i = fileInputStream.read();
                if(i != -1){
                    fileOutputStream.write(i);
                }
            }while (i != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try{
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Close file input err: " + e);
            }


            try{

                if(fileOutputStream != null){
                    fileOutputStream.close();
                }

            }catch (IOException e1){
                System.out.println();
            }

        }


    }
}
