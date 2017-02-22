/*
 * Decompiled with CFR 0_118.
 */
package myAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class io {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    io() {
    }

    public static String give() throws IOException {
        String string = br.readLine();
        return string;
    }

    public static String give(String string) throws IOException {
        System.out.print(string);
        String string2 = br.readLine();
        return string2;
    }

    public static void see(String string) throws IOException {
        System.out.print(string);
    }

    public static void println(String string) throws IOException {
        System.out.println(string);
    }

    public static void see(Double d) throws IOException {
        System.out.print(d);
    }

    public static void println(Double d) throws IOException {
        System.out.println(d);
    }

    public static void write(String string, boolean bl, String string2) throws IOException {
        FileWriter fileWriter = new FileWriter(string, bl);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.print(string2);
        printWriter.close();
    }

    public static void writeln(String string, boolean bl, String string2) throws IOException {
        FileWriter fileWriter = new FileWriter(string, bl);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(string2);
        printWriter.close();
    }

    public static String read(String string, int n) throws IOException {
        String string2 = "";
        FileReader fileReader = new FileReader(string);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (int i = 0; i < n; ++i) {
            string2 = bufferedReader.readLine();
        }
        return string2;
    }
}
