package pushBackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class One {
    public static void main(String...args){

        String s = "one two three four five six setten";
        byte[] b = s.getBytes();
        int c;
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        try(PushbackInputStream pbis = new PushbackInputStream(bais)){
            while ((c = pbis.read()) != -1){
                switch (c){

                    case't' -> {
                        if((c = pbis.read()) == 't') {
                            System.out.print(' ');
                        }
                        else {
                            System.out.print('p');
                            pbis.unread(c);
                        }
                        break;
                    }
                    default -> {
                        System.out.print((char)c);
                    }

                }
            }

        }catch (IOException e ){

            e.printStackTrace();

        }






    }
}
