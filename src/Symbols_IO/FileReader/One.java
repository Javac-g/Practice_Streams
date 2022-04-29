package Symbols_IO.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class One {

        public static void main(String...args) throws FileNotFoundException {

            try(FileReader fileReader = new FileReader("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Symbols_IO\\FileReader\\A.txt")){

                int c;

                while ((c = fileReader.read()) != -1){

                    System.out.print((char) c);

                }





            } catch (IOException e) {
                throw new RuntimeException(e);
            }













        }
}


