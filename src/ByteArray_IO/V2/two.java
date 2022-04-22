package ByteArray_IO.V2;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class two {
    public static void main(String...args){
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\ByteArray_IO\\V2\\";
        String name = "A.txt";
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "this will be copied";
        byte[] b = s.getBytes();

        try {
            f.write(b);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(f.toString());
        byte[] c = f.toByteArray();

        for (int i = 0; i < c.length; i++){

            System.out.print((char)c[i]);

        }

        try(FileOutputStream out = new FileOutputStream(path+name)) {
            f.writeTo(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
