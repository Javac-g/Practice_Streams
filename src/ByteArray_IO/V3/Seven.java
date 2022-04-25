package ByteArray_IO.V3;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Seven {
    public static void main(String...args){
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\ByteArray_IO\\V3\\";
        String name = "Output.txt";
        String s = "One two three four five six seven";
        byte[] b = s.getBytes();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try{
            outputStream.write(b);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] arr = outputStream.toByteArray();

        for (int i = 0; i < arr.length; i++){

            System.out.print((char)arr[i]);

        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(path+name)) {

            outputStream.writeTo(fileOutputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
