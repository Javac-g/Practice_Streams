package Symbols_IO.PushBackReader;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public class One {

    public static void main(String...args){
        String s = "One two threooe four five";
        char[] c = new char[s.length()];

        s.getChars(0,s.length(),c,0);
        CharArrayReader charArrayReader = new CharArrayReader(c);

        int o;

        try(PushbackReader pushbackReader = new PushbackReader(charArrayReader)){

            while ((o = pushbackReader.read()) != -1){

                switch (o){
                    case 'o' ->{
                        if((o = pushbackReader.read()) == 'o'){
                            System.out.print('q');
                        }else {
                            System.out.print('*');
                            pushbackReader.unread(o);
                        }
                        break;

                    }
                    default -> {
                        System.out.print((char) o);
                        break;
                    }
                }


            }


        }catch (IOException e){

            e.printStackTrace();

        }



    }

}
