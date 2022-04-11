package P_04_11_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String...args) throws IOException {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("Enter string: \n");
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
