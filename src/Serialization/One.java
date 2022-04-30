package Serialization;

import java.io.Serializable;

public class One implements Serializable {
    String s;
    int i;
    double d;

    public One(String s, int i, double d){

        this.s = s;
        this.i = i;
        this.d = d;

    }

    public String toString(){

        return "S: " + s + "\ni: " + i + "\nd: " + d;

    }
}
