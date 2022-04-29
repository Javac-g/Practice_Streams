package Symbols_IO.CharArrayReader;

import java.io.CharArrayReader;
import java.io.IOException;

public class One {
    public static void main(String...args){

        String s = "abcdefghjklmnopqurstvwxyz";
        int l = s.length();
        char[] c = new char[l];

        s.getChars(0,l,c,0);
        int i;
        try(CharArrayReader charArrayReader = new CharArrayReader(c)){


            System.out.println("Val: ");
            while (( i = charArrayReader.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(CharArrayReader charArrayReader2 = new CharArrayReader(c,0,5)){


            System.out.println("Val: ");
            while (( i = charArrayReader2.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
