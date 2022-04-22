package Input_Output_Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class four {
    public static void main(String...args) throws FileNotFoundException {
        int size;

        try(FileInputStream F = new FileInputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\three\\four.java")){
            size =  F.available();

            int n = size/40;
            byte[] b = new byte[n];
            System.out.println("Bytes available: " + F.available());

            for (int i = 0; i < n; i++){
                System.out.println((char)F.read());
            }
            System.out.println("\nStill available: "  + F.available());

            if(F.read(b) != n){
                System.err.println("Cant read: " + n + " bytes");
            }
            System.out.println(new String(b,0,n));
            System.out.println("\nStill available: "  + F.available());
            System.out.println("Skip last half bytes: " + F.skip(F.available()/2));
            System.out.println("\nStill available: "  + F.available());

            System.out.println("Read last bytes in arr ");
            if(F.read(b,n/2,n/2) != n/2){
                System.err.println("Cant read: " + n/2 + " bytes");
            }
            System.out.println("\nStill available: "  + F.available());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
