package Symbols_IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class One {
     public static void main(String...args) throws IOException{
         String s = "now its time for all good man to come to the aid of their contry and pay their due taxes";
         char[] b = new char[s.length()];
         s.getChars(0,s.length(),b,0);
         String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Symbols_IO\\FileWriter\\";

         try(FileWriter fileWriter1 = new FileWriter(path+"a.txt") ;
            FileWriter fileWriter2 = new FileWriter(path+"b.txt") ;
            FileWriter fileWriter3 = new FileWriter(path + "c.txt")){


            for (int i = 0; i < b.length; i+=2){

                fileWriter1.write(b[i]);

            }

            fileWriter2.write(b);
            fileWriter3.write(b,b.length-b.length/4,b.length/4);


         }catch (IOException e){
             e.printStackTrace();
         }



     }
}
