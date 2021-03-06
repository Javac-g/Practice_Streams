package Buffered_IO.V1;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class One {
    public static void main(String...args) throws IOException {

        String s = "hello its my symbol of &copy; " + " a &copy - no \n";

        byte[] b = s.getBytes();

        int c;

        boolean marked = false;

        ByteArrayInputStream in = new ByteArrayInputStream(b);
        try(BufferedInputStream f = new BufferedInputStream(in)){

            while((c = f.read()) != -1){

                switch (c){

                    default -> {

                        if(!marked){

                            System.out.print((char) c);

                            break;

                        }

                    }

                    case '&' -> {

                        if (!marked) {

                            f.mark(24);

                            marked = true;

                        }else{

                            marked = false;

                        }

                    }

                    case ';' ->{

                        if(marked){

                            marked = false;

                            System.out.print("(c)");

                            break;

                        }else {

                            System.out.print((char) c);

                            break;

                        }

                    }

                    case' ' ->{

                        if(marked){

                            marked = false;

                            f.reset();

                            System.out.print("&");

                        }else {

                            System.out.print((char)c);

                            break;

                        }

                    }

                }

            }

        }catch (IOException e ){

            e.printStackTrace();

        }





    }
}
