package P_04_11_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

    public static void main (String...args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s;


        do{

            s = (char)br.read();
            System.out.println(s);

        }while (s != 'q');


    }
}
