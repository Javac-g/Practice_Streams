package Symbols_IO.CharArrayWriter;

import java.io.CharArrayWriter;
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




    }
}
