package Input_Output_Stream.V3;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class four {
    public static void main(String...args){
        int size;

        try(FileInputStream F = new FileInputStream(new File("A.txt"))){
            size = F.available();

            System.out.println("At start: " + size);
            for (int i = 0;i < size / 10;i++){

                System.out.println((char)F.read());

            }
            size = F.available();
            System.out.println("Available: " + size);

            System.out.println(F.skip(F.available()/2));

            size = F.available();
            System.out.println("Available: " + size);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
