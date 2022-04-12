package two;

import java.io.File;
import java.io.FilenameFilter;

public class four  implements FilenameFilter {
    String ext;

    public four(String ext){

        this.ext = ext;

    }

    public boolean accept (File dir, String name){

        return name.endsWith(ext);

    }
}
