package two;

import java.io.File;

public class Two {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String...args){

        File f1 = new File("C:\\Users\\Max.000\\IdeaProjects\\Practice_Streams\\src\\two\\COPYRIGHT.txt");
        p(f1.getName());
        p(f1.getPath());
        p(f1.getAbsolutePath());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "Can write" : "Cant write");
        p(f1.canRead() ? "can read" : "cant read");
        p(f1.isDirectory() ? "is catalog" : "not catalog");
        p(f1.isFile()? "is File" : "named chanel");
        p(f1.isAbsolute() ? "is absolute" : "not absolute");
        p("Last changes: "+ f1.lastModified());
        p("Size: " + f1.length() + " Byte");




    }
}
