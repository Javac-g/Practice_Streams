package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {
    public static void main(String...args) throws IOException {

        String[] data = new String[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int j = 0;

        do{
            System.out.println("Enter: \n");

            data[i] = br.readLine();

        }while (i++ < 4 );

        System.out.println("Result");


        do{

            System.out.println(data[j]);

        }while (j++ < 4);

    }
}
