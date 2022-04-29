package Symbols_IO.CharArrayWriter;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class One {
    public static void main(String...args){


        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String s = "this data must be in array";
        char[] c = new char[s.length()];
        s.getChars(0,s.length(),c,0);

        try{

            charArrayWriter.write(c);

        }catch (IOException e){

            e.printStackTrace();

        }
        System.out.println(charArrayWriter.toString());

        char[] temp = charArrayWriter.toCharArray();

        for (int i = 0 ; i < temp.length; i++){
            System.out.print(temp[i] + " ");
        }


        try(FileWriter fileWriter = new FileWriter("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Symbols_IO\\CharArrayWriter\\a.txt")){

            charArrayWriter.writeTo(fileWriter);


        }catch (IOException e){

            e.printStackTrace();

        }
        charArrayWriter.reset();

        System.out.println("\n");

        for (int i = 0; i < 3; i++ ){

            charArrayWriter.write('X');
        }
        System.out.println(charArrayWriter.toString());



    }
}
