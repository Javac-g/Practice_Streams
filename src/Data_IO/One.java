package Data_IO;

import java.io.*;

public class One {
    public static void main(String... args) throws FileNotFoundException {

        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Data_IO\\test.dat"));){

            dataOutputStream.writeDouble(22.4);
            dataOutputStream.writeInt(120);
            dataOutputStream.writeBoolean(true);



        }catch (IOException e){

            e.printStackTrace();

        }
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Data_IO\\test.dat"))){

            double d = dataInputStream.readDouble();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();
            System.out.printf("%s %d %s%n", d, i, b);

        }catch (IOException e){

            e.printStackTrace();

        }










    }
}

