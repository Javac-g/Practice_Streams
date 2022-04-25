package File.V3;

import java.io.File;
import java.io.FilenameFilter;

public class Filtr implements FilenameFilter {
    String ex;

    Filtr(String ex){

        this.ex = ex;

    }
    public boolean accept(File dir,String name){

        return name.endsWith(ex);

    }




}
