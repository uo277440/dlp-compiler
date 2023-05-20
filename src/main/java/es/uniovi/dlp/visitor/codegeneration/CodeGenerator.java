package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.type.Char;
import es.uniovi.dlp.ast.type.DoubleType;
import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.ast.type.Type;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class CodeGenerator {
  private OutputStreamWriter out;
  boolean showDebug;

  private int label;
  String filename;
  static Map<String, String> mapa =
      Map.of("+", "add", "*", "mul", "/", "div", "-", "sub", "%", "mod");

  public CodeGenerator(boolean showDebug, OutputStreamWriter out, String filename) {
    label = 0;
    this.showDebug = showDebug;
    this.out = out;
    this.filename = filename;
  }

  public void comment(String comment) {
    if (showDebug) {
      writeInstruction("' " + comment);
    }
  }

  public void main() {
    if (showDebug) {
      write("' Invocation to the main function");
    }
    write("call main");
    write("halt");
  }

  private String getSuffix(Type type) {
    if (type instanceof DoubleType) {
      return "f";
    }
    if (type instanceof Int) {
      return "i";
    }
    if (type instanceof Char) {
      return "b";
    }
    return null;
  }

  private void writeInstruction(String i) {}

  private void writePragma(String string) {
    write("#" + string);
  }

  private void write(String s) {
    try {
      out.write(s);
      out.write("\n");
      out.flush();
    } catch (IOException i) {
      i.printStackTrace();
    }
  }

  public int getLabel() {
    return ++label;
  }

  public void pushBP() {
    write("\tpush\tbp");
  }

  public void pusha(int address) {
    write("\tpusha\t" + address);
  }

  public void push(Type t, char valor) {
    write("\tpush" + getSuffix(t) + "\t" + (int) valor);
  }

  public void push(Type t, int valor) {
    write("\tpush" + getSuffix(t) + "\t" + valor);
  }

  public void push(int offset) {
    write("\tpushi" + "\t" + offset);
  }

  public void push(Type t, Double valor) {
    write("\tpush" + getSuffix(t) + "\t" + valor);
  }

  public void load(Type t) {
    write("\tload" + getSuffix(t));
  }

  public void store(Type t) {
    write("\tstore" + getSuffix(t));
  }

  public void pop(Type t) {
    write("\tpop" + getSuffix(t));
  }

  public void call(String functionName) {
    write("\tcall\t" + functionName);
  }

  public void halt() {
    write("\thalt");
  }

  public void not() {
    write("\tnot");
  }

  public void jumpz(int num) {
    write("\tjz\tLabel_" + num);
  }

  public void sub(Type type) {
    write("\tsub" + getSuffix(type));
  }

  public void gt(Type type) {
    write("\tgt" + getSuffix(type));
  }

  public void eq(Type type) {
    write("\teq" + getSuffix(type));
  }

  public void le(Type type) {
    write("\tle" + getSuffix(type));
  }

  public void ne(Type type) {
    write("\tne" + getSuffix(type));
  }

  public void ge(Type type) {
    write("\tge" + getSuffix(type));
  }

  public void lt(Type type) {
    write("\tlt" + getSuffix(type));
  }

  public void and() {
    write("\tand");
  }

  public void or() {
    write("\tor");
  }

  public void cast(Type from, Type to) {
    castIntermediate(from, to);
  }

  private void castIntermediate(Type from, Type to) {
    if (from.getClass().equals(to.getClass())) return;
    Type intermediate = from.getIntermediateType(to);
    write("\t"+getSuffix(from) + "2" + getSuffix(intermediate));
    castIntermediate(intermediate, to);
  }

  public void mul(Type t) {
    write("\tmul" + getSuffix(t));
  }

  public void add(Type t) {
    write("\tadd" + getSuffix(t));
  }

  public void div(Type t) {
    write("\tdiv" + getSuffix(t));
  }

  public void mod(Type t) {
    write("\tmod" + getSuffix(t));
  }

  public void in(Type t) {
    write("\tin" + getSuffix(t));
  }

  public void label(int label) {
    write("Label_" + label + ":");
  }

  public void jmp(int cond) {
    write("\tjmp\tLabel_" + cond);
  }

  public void jz(int cond) {
    write("\tjz\tLabel_" + cond);
  }

  public void out(Type t) {
    write("\tout" + getSuffix(t));
  }

  public void ret(int numberOfBytes, int i, int paramsSize) {
    write("\tret\t" + numberOfBytes + ", " + i + ", " + paramsSize);
  }

  public void enter(int i) {
    write("\tenter\t" + i);
  }

  public void nameFunc(String name) {
    write(name + ":");
  }
}
