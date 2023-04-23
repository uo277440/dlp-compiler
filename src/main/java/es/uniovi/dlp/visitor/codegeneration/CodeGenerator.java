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

    private int label;
    String filename;
    public CodeGenerator(boolean showDebug,OutputStreamWriter out,String filename){
        label = 0;
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
        out.flush();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public int getLabel(){
        return ++label;
    }
    public void pushBP(){
        write("\tpush\tbp");

    }

    public void pusha(int address){
        write("\tpusha\t" + address);

    }

    public void push(Type t, char valor){
        write("\tpush"+getSuffix(t) + "\t"+ (int)valor);

    }

    public void push(Type t, int valor){
        write("\tpush"+getSuffix(t) + "\t"+valor);

    }

    public void push(int offset){
        write("\tpushi"+ "\t"+offset);

    }

    public void push(Type t, Double valor){
        write("\tpush"+getSuffix(t) + "\t"+valor);

    }

    public void load(Type t){
        write("\tload"+getSuffix(t));

    }

    public void store(Type t){
        write("\tstore"+getSuffix(t));

    }

    public void pop(Type t){
        write("\tpop"+getSuffix(t));
    }

    public void call(String functionName){
        write("\tcall\t"+functionName);

    }

    public void halt(){
        write("\thalt");

    }

    public void jumpz(int num){
        write("\tjz\tLabel_"+num);

    }


}
