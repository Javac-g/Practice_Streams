package File.V2;

import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter {
    private String extention;

    Filter(String extention){

        this.extention = extention;

    }

    public boolean accept(File dir,String name){
        return name.endsWith(extention);
    }

}
