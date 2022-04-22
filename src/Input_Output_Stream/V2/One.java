package Input_Output_Stream.V2;

import java.io.*;

public class One {
    public static void main(String...args) throws IOException {

        String s = "King Euvoran of the Ustaim city Aramoam grows weary of overseeing justice for petty criminals. When one proves worthy of torture or execution, they animate the stuffed bird on the king's crown which flies far from Euvoran. Euvoran implores the god Geol in a temple about his predicament. The voice of Geol tells him he will slay the bird far from home. Euvoran then assembles a fleet of ships to find the bird as the kingdom's peoples would not respect a king without the crown. They sail east. They stop a moment in Sotar but find the so-called Gazolba is rather a local bird. They travel to Tosk where the humans were closer to apes but received no clues. They stop by an isle but are attacked by vampires. The vampires devastate much of king Euvoran's fleet. They proceed to Ornava which is full of birds. Hoping to take one as a hunting prize, the king shoots an owl but is attacked by all the birds. A giant bird takes him away to a tower where he is judged by a king bird. The king bird tells Euvoran what he is guilty of but remarks he may defend himself. However, Euvoran makes matters worse as he tells the bird his quest which involves killing a bird a second time. The king bird imprisons Euvoran so they may stuff him for their collection. Fooling a guard, Euvoran uses the guard's feathers as a disguise and leaves the tower. Returning to his fleet, Euvoran has the ships continue their quest. They are soon overtaken by a storm that leaves the king as the only survivor. Shipwrecked somewhere the Gazolba is common, Euvoran runs into someone hunting Gazolba who wears one on his head. Euvoran tells him this is a royal bird which the hunter laughs about. The hunter says he is a captain from Ullotroi and that he eats these birds for sustenance. Naz Obbamar says he will teach Euvoran how to cook Gazolba which they do as they spend the rest of their days eating the bird.";
        String path = "C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\Input_Output_Stream\\V2\\";
        String name = ".txt";
        byte[] b = s.getBytes();

        FileOutputStream A = null;
        FileOutputStream B = null;
        FileOutputStream C = null;

        try {

            A = new  FileOutputStream(path + "A" + name);
            B = new  FileOutputStream(path + "B" + name);
            C = new  FileOutputStream(path + "C" + name);

            for(int i =0 ; i < b.length;i++){
                A.write(b,0,10);
                B.write(b,10,10);
                C.write(b[i]);

            }






        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            A.close();
            B.close();
            C.close();
        }


    }
}
