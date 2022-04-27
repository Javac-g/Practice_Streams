package File.V4;

import java.io.File;
import java.io.FilenameFilter;

public class Fill implements FilenameFilter {

    String ex;

    Fill(String ex){

        this.ex = ex;

    }

    public boolean accept(File dir, String name){

        return name.endsWith(ex);


    }


}
