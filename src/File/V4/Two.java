package File.V4;

import java.io.*;

public class Two {

    public static void main(String...args){

        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\File\\V1";

        FilenameFilter only = new Fill("java");

        File A = new File(path);

        String[] B = A.list(only);

        for (int i = 0; i < B.length; i++){

            System.out.println(B[i]);

        }






    }


}
