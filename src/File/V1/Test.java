package File.V1;

import java.io.File;
import java.io.FilenameFilter;

public class Test implements FilenameFilter {

    String extention;

    public Test(String extention){

        this.extention = extention;

    }

    public boolean accept(File location,String name){

        return name.endsWith(extention);

    }

}
