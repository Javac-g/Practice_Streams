package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    static String processData(String str,String revers){

        for (int i = str.length()-1; i >= 0; i--){

            revers+=str.charAt(i);

        }
        return revers;
    }
    public static void main(String...args) throws IOException {

        String str;
        String revers = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("Enter string: \n");
            str = br.readLine();

            System.out.println(processData(str,revers));
        }while (!str.equals("stop"));
    }
}
