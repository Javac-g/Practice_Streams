package sequenceInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class App {
    public static void main(String...args){
        int c;

        Vector<String> files = new Vector<>();

        files.add("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\sequenceInputStream\\a.txt");
        files.add("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\sequenceInputStream\\b.txt");
        files.add("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\sequenceInputStream\\c.txt");

        Enumerator enumerator = new Enumerator(files);
        InputStream inputStream = new SequenceInputStream(enumerator);

        try{
            while ((c = inputStream.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
