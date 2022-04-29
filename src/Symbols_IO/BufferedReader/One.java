package Symbols_IO.BufferedReader;

import java.io.BufferedReader;
import java.io.CharArrayReader;

public class One {

    public static void main(String...args){

        String s = " One two three four five six seven nine ten neen meeem ";
        char[] c = new char[s.length()];
        s.getChars(0,s.length(),c,0);

        CharArrayReader charArrayReader = new CharArrayReader(c);
        int c;
        boolean marked = false;

        try(BufferedReader bufferedReader = new BufferedReader(charArrayReader)){

            while ((c = bufferedReader.read()) != -1){

                switch (c){
                    case 'e' -> {

                        if(!marked){
                            bufferedReader.mark(3);
                            marked = true;
                        }else {
                            marked = false;
                        }
                        break;

                    }
                    case 'a' -> {

                        if(marked){
                            marked = false;
                            System.out.print(" (c) ");
                        }else {
                            System.out.print((char) c);
                        }
                        break;


                    }

                }


            }



        }







    }

}
