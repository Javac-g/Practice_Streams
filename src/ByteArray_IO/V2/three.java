package ByteArray_IO.V2;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class three {

    public static void main(String...args){
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\ByteArray_IO\\V2\\";
        String name = "A.txt";
        String s = "hello its my test string";
        ByteArrayOutputStream F = new ByteArrayOutputStream();
        byte[] b = s.getBytes();

        try {
            F.write(b);
        }catch (IOException e){
            e.printStackTrace();
        }

        byte[] c = F.toByteArray();
        try(FileOutputStream out = new FileOutputStream(path+name,true)) {

            F.writeTo(out);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
