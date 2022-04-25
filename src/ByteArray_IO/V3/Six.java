package ByteArray_IO.V3;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Six {

    public static void main(String...args) throws IOException {
        String s = "one two three four five six seven eight nine ten";
        byte[] b = s.getBytes();

        try(ByteArrayInputStream inputStream = new ByteArrayInputStream(b ,0 ,3)){
            int c;
            for (int i = 0; i < 2 ; i++){
                while ((c = inputStream.read()) != -1){

                    if(i == 0){
                        System.out.print((char)c);
                    }else{
                        System.out.print(Character.toUpperCase((char)c));
                    }
                }
                System.out.println();
                inputStream.reset();



            }



        }




    }

}
