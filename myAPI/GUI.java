/*
 * Decompiled with CFR 0_118.
 */
package myAPI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI
extends JFrame {
    public TextArea textArea;
    public int num;
    public String name2;

    public GUI(String string) {
        this.name2 = string;
        this.num = 0;
        this.textArea = new TextArea("", 0, 0, 0);
        this.textArea.setForeground(Color.black);
        this.setSize(640, 480);
        this.setTitle(string);
        this.setDefaultCloseOperation(3);
        this.textArea.setFont(new Font("Times New Roman", 1, 12));
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(this.textArea);
        this.setVisible(true);
    }

    public void print(String string) throws IOException {
        this.textArea.append(string);
    }

    public void print(double d) throws IOException {
        this.textArea.append("" + d);
    }

    public String take(String string) throws IOException {
        this.print(string);
        String string2 = JOptionPane.showInputDialog(null, string, this.name2, 1);
        this.print(string2 + "\n");
        return string2;
    }
}
