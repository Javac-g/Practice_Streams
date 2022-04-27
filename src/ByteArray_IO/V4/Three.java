package ByteArray_IO.V4;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Three {

    public static void main(String...args){

        String s = "Hello its my string for outputstream";
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\ByteArray_IO\\V4\\";
        byte[] b = s.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try{

            byteArrayOutputStream.write(b);

        }catch (IOException e){

            e.printStackTrace();

        }

        String test = byteArrayOutputStream.toString();
        byte[] testOne = byteArrayOutputStream.toByteArray();

        System.out.println(test);

        for (int i = 0; i  < testOne.length; i++){

            System.out.print(Character.toUpperCase((char)testOne[i]));

        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(path + "c.txt")){

            byteArrayOutputStream.writeTo(fileOutputStream);

        }catch (IOException e){

            e.printStackTrace();

        }






    }

}
