package Symbols_IO.Console;

import java.io.Console;

public class One {

    public static void main(String...args){

        String str;
        Console console;

        console = System.console();

        if(console == null)return;

        str = console.readLine("Enter text: ");

        console.printf("Your text: %s\n", str);
    }


}
