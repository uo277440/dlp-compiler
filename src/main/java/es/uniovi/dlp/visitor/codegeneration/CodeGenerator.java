package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.type.Char;
import es.uniovi.dlp.ast.type.DoubleType;
import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.ast.type.Type;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
    private OutputStreamWriter out;
    boolean showDebug;
    String filename;
    public CodeGenerator(boolean showDebug,OutputStreamWriter out,String filename){
        this.showDebug=showDebug;
        this.out=out;
        this.filename=filename;
    }
    public void comment(String comment){
        if(showDebug){
            writeInstruction("' "+comment);
        }
    }

    public void main(){
        if(showDebug){
            write("' Invocation to the main function");
        }
        write("call main");
        write("halt");
    }
    private String getSuffix(Type type){
        if(type instanceof DoubleType){
            return "f";
        }
        if(type instanceof Int){
            return "i";
        }
        if(type instanceof Char){
            return "b";
        }
        return null;
    }
    private void writeInstruction(String i) {
    }
    private void writePragma(String string){ write("#"+string);}

    private void write(String s) {
        try{
        out.write(s);
        }catch(IOException i){
            i.printStackTrace();
        }
    }

}
