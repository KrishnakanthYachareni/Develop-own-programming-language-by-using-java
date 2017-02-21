/*
 * Developed By Yachareni Krishnakanth 16/02/2017 @All copy rights are Reserved.
 */
import java.io.IOException;
import myAPI.io;
import java.util.*;

class dino {
    Tokenizer tok;
    String jFile = "";
    String File = "";
    String tstring = "";
    String oof = "";
    int initflag = 0;
    int ignoreflag = 0;
    int decflag = 0;
    int printflag = 0;
    int takeflag = 0;
    int setflag = 0;
    int loopflag = 0;
    int objsetflag = 0;
    int subflag = 0;
    int returnflag = 0;
    int ooflag = 0;
    int incflag = 0;
    int level = 0;
    int count = 0;

    dino(String file) throws IOException {
        this.File = file;
        this.jFile = file.substring(0, file.length() - 5) + "java";
        io.write((String)this.jFile, (boolean)false, (String)"");
        int c = 1;
        boolean wc = true;
        String temp = "";
        String temp2 = "";
        do {
            wc = false;
            if (temp.trim().equals("")) {
                this.println("");
            }
            this.tok = new Tokenizer(temp);
            while (!(temp2 = this.tok.next()).equals("")) {
                this.analyze(temp2);
            }
            this.check();
            this.count = 0;
            this.tstring = "";
        } while ((temp = io.read((String)file, (int)c++)) != null);
        io.writeln((String)this.jFile, (boolean)true, (String)"}");
    }

    public void check() throws IOException {
        if (this.decflag == 1) {
            this.decflag = 0;
        }
        if (this.printflag == 1) {
            io.write((String)this.jFile, (boolean)true, (String)")");
            this.printflag = 0;
        }
        if (this.ignoreflag == 1) {
            if (this.loopflag == 1) {
                ++this.loopflag;
            } else {
                io.writeln((String)this.jFile, (boolean)true, (String)";");
            }
            this.ignoreflag = 0;
        }
        if (this.ignoreflag == 2) {
            this.ignoreflag = 0;
        }
        if (this.setflag == 1) {
            this.println(this.tstring + ");");
            this.setflag = 0;
        }
        if (this.objsetflag == 1) {
            this.println(this.tstring + ";");
            this.objsetflag = 0;
        }
        if (this.incflag == 2) {
            this.println(this.tstring + " );");
        }
        if (this.incflag != 0) {
            this.incflag = 0;
        }
    }

    public void init_file() throws IOException {
        io.writeln((String)this.jFile, (boolean)true, (String)"import java.io.*;");
        io.writeln((String)this.jFile, (boolean)true, (String)"import myAPI.*;");
        io.writeln((String)this.jFile, (boolean)true, (String)("public class " + this.trim(this.File.substring(0, this.File.length() - 6)) + " " + this.oof));
        io.writeln((String)this.jFile, (boolean)true, (String)"{");
        io.writeln((String)this.jFile, (boolean)true, (String)"\tpublic static String tempStringForWaitCommand = \"\";");
        ++this.level;
        this.initflag = 1;
    }

    public void analyze(String str) throws IOException {
        if (this.ignoreflag == 1 && this.printflag == 0 && this.count == 0) {
            this.print(str);
            ++this.count;
        } else if (this.ignoreflag == 1) {
            io.write((String)this.jFile, (boolean)true, (String)str);
            ++this.count;
        } else if (this.ignoreflag == 2) {
            this.oof = this.oof + str;
        } else if (this.setflag == 1 && !str.equals("as")) {
            this.tstring = this.tstring + str;
        } else if (this.setflag == 1 && str.equals("as")) {
            this.tstring = this.tstring + ".set(";
        } else if (this.loopflag == 2) {
            this.println("{");
            this.loopflag = 0;
            ++this.level;
        } else if (this.objsetflag == 1 && !str.equals("as")) {
            this.tstring = this.tstring + str;
        } else if (this.objsetflag == 1 && str.equals("as")) {
            this.tstring = this.tstring + " = ";
        } else if (!(this.incflag != 1 && this.incflag != 3 || str.equals("by") || str.equals(" "))) {
            this.tstring = this.tstring + str;
        } else if (this.incflag == 1 && str.equals("by")) {
            this.print(this.tstring + ".set( " + this.tstring + ".num + ");
            this.incflag = 2;
            this.tstring = "";
        } else if (this.incflag == 3 && str.equals("by")) {
            this.print(this.tstring + ".set( " + this.tstring + ".num - ");
            this.incflag = 2;
            this.tstring = "";
        } else if (this.incflag == 2 && !str.equals(" ")) {
            this.tstring = this.tstring + str;
        } else if (this.subflag == 1 && this.count == 0 && !str.equals(" ")) {
            io.write((String)this.jFile, (boolean)true, (String)(str + " "));
            ++this.count;
        } else if (this.subflag == 1 && this.count == 1 && !str.equals(" ")) {
            io.write((String)this.jFile, (boolean)true, (String)str);
            ++this.count;
        } else if (this.subflag == 1 && !str.equals(")")) {
            io.write((String)this.jFile, (boolean)true, (String)str);
        } else if (this.subflag == 1 && str.equals(")")) {
            io.writeln((String)this.jFile, (boolean)true, (String)")throws IOException");
            this.println("{");
            ++this.level;
            this.subflag = 0;
        } else if (!(this.decflag != 1 || str.equals(" ") || str.equals("\t") || str.equals(","))) {
            String temp = "var " + str + " = new var(0);";
            if (this.level == 1) {
                temp = "static " + temp;
                temp = "public " + temp;
            }
            this.println(temp);
        } else if (this.takeflag == 1 && !str.equals(" ") && !str.equals("\t")) {
            this.println(str + ".set(io.give());");
            this.takeflag = 0;
        } else if (str.equals("import")) {
            this.print("import ");
            this.ignoreflag = 1;
        } else if (str.equals("package")) {
            this.print("package ");
            this.ignoreflag = 1;
        } else if (str.equals("extend")) {
            this.oof = this.oof + " extends ";
            this.ignoreflag = 2;
        } else if (str.equals("implement")) {
            this.oof = this.oof + " implements ";
            this.ignoreflag = 2;
        } else if (str.equals("see")) {
            this.print("System.out.print(");
            this.ignoreflag = 1;
            this.printflag = 1;
        } else if (str.equals("decvar")) {
            this.decflag = 1;
            if (this.initflag == 0) {
                this.init_file();
            }
        } else if (str.equals("decobj")) {
            if (this.initflag == 0) {
                this.init_file();
            }
            this.ignoreflag = 1;
            ++this.count;
            if (this.level == 1) {
                this.print("public static ");
            }
        } else if (str.equals("start")) {
            if (this.initflag == 0) {
                this.init_file();
            }
            this.println("public static void main(String args[])throws IOException");
            this.println("{");
            ++this.initflag;
            ++this.level;
        } else if (str.equals("loop")) {
            this.print("while( ");
            this.ignoreflag = 1;
            this.loopflag = 1;
            this.printflag = 1;
        } else if (str.equals("if")) {
            this.print("if( ");
            this.ignoreflag = 1;
            this.loopflag = 1;
            this.printflag = 1;
        } else if (str.equals("else")) {
            this.print("else ");
        } else if (str.equals("end") || str.equals("}")) {
            --this.level;
            this.println("}");
        } else if (str.equals("give")) {
            this.takeflag = 1;
        } else if (str.equals("do")) {
            this.tstring = str;
            this.ignoreflag = 1;
        } else if (str.equals("set")) {
            this.setflag = 1;
            this.tstring = "";
        } else if (str.equals("setobj")) {
            this.objsetflag = 1;
            this.tstring = "";
        } else if (str.equals("sub")) {
            if (this.initflag == 0) {
                this.init_file();
            }
            this.print("public static ");
            this.subflag = 1;
            ++this.initflag;
        } else if (str.equals("construct")) {
            if (this.initflag == 0) {
                this.init_file();
            }
            this.print("public ");
            this.subflag = 1;
            ++this.initflag;
        } else if (str.equals("return")) {
            this.print("return ");
            this.ignoreflag = 1;
            ++this.count;
        } else if (str.equals("break")) {
            this.println("break;");
        } else if (str.equals("inc")) {
            this.incflag = 1;
        } else if (str.equals("dec")) {
            this.incflag = 3;
        } else if (str.equals("wait")) {
            this.println("tempStringForWaitCommand = io.give(\"\");");
        }
    }

    public void print(String str) throws IOException {
        int c = 0;
        while (c++ < this.level) {
            io.write((String)this.jFile, (boolean)true, (String)"\t");
        }
        io.write((String)this.jFile, (boolean)true, (String)str);
    }

    public void println(String str) throws IOException {
        int c = 0;
        while (c++ < this.level) {
            io.write((String)this.jFile, (boolean)true, (String)"\t");
        }
        io.writeln((String)this.jFile, (boolean)true, (String)str);
    }

    public String trim(String a) {
        int pos = 0;
        String temp = "";
        for (int c = 0; c < a.length(); ++c) {
            if (a.charAt(c) != '\\') continue;
            pos = c;
        }
        if (pos != 0) {
            return a.substring(pos + 1, a.length());
        }
        return a.substring(0, a.length());
    }

    public static void main(String[] args) throws IOException {
		System.out.println("Enter Program");
		String x= new Scanner(System.in).nextLine();
        dino d = new dino(x + ".anelo");
    }
}
