package Symbols_IO.Console;

public class One {

    static void Andrew (String message, int age){


        System.out.println("My name is: " + message);
        System.out.println("My age is: " + age);
    }

    static String revers(String msg){

        String result = "";

        for (int i = msg.length()-1; i >= 0; i--){
            result = result + msg.charAt(i);
        }
        return result;

    }

    public static void main(String...args){

        System.out.println(revers("ANDREY"));

    }

}
