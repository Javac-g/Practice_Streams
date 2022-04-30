package Serialization;

import java.io.*;

public class Main {

    public static void main(String...args){




        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))){
            One objectOne = new One("hello",22,2.7e10);

            System.out.println("Object in: " + objectOne);

            objectOutputStream.writeObject(objectOne);

        }catch (IOException e){

            e.printStackTrace();

        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))){

            One objectTwo = (One)objectInputStream.readObject();

            System.out.println("Object out: " + objectTwo);

        }catch (IOException | ClassNotFoundException o){

            o.printStackTrace();

        }



    }

}
