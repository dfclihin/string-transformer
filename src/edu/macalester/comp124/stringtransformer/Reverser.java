package edu.macalester.comp124.stringtransformer;

import acm.program.ConsoleProgram;

/**
 * Created by hli on 2/27/14.
 */
public class Reverser extends StringTransformer{
    public String transform(String s) {
        String x=("");

        for(int i=0;i<s.length();i++){
            x+=s.charAt(s.length()-1-i);

        }
        return x;

    }


    @Override
    public String toString() {
        return "Reverser";
    }
}
