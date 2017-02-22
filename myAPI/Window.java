/*
 * Decompiled with CFR 0_118.
 */
package myAPI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Window
extends JFrame
implements ActionListener {
    public MenuBar menuBar;
    public TextArea[] textArea;
    public Menu[] menu;
    public MenuItem[][] item;
    public JButton[] button;
    public JLabel[] label;
    public JLabel[] icon;
    public String name2;
    public String itemName = "";
    public String buttonName = "";
    public int screenHeight;
    public int screenWidth;
    public int[] buttonWidth;
    public int[] buttonHeight;
    public int[] iconWidth;
    public int[] iconHeight;
    public int[] textAreaWidth;
    public int[] textAreaHeight;
    public int[] labelWidth;
    public int[] labelHeight;
    public int[] buttonX;
    public int[] buttonY;
    public int[] iconX;
    public int[] iconY;
    public int[] textAreaX;
    public int[] textAreaY;
    public int[] labelX;
    public int[] labelY;
    public int buttons;
    public int icons;
    public int textAreas;
    public int labels;

    public Window(String string, int n, int n2, boolean bl, int n3) {
        this.name2 = string;
        this.setSize(n, n2);
        this.screenWidth = n;
        this.screenHeight = n2;
        this.setTitle(string);
        this.setResizable(bl);
        this.setDefaultCloseOperation(n3);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception var6_6) {
            // empty catch block
        }
    }

    public void usingTextAreas(int n) {
        this.textArea = new TextArea[n];
        this.textAreaWidth = new int[n];
        this.textAreaHeight = new int[n];
        this.textAreaX = new int[n];
        this.textAreaY = new int[n];
        this.buttons = n;
    }

    public void usingLabels(int n) {
        this.label = new JLabel[n];
        this.labelWidth = new int[n];
        this.labelHeight = new int[n];
        this.labelX = new int[n];
        this.labelY = new int[n];
        this.labels = n;
    }

    public void usingButtons(int n) {
        this.button = new JButton[n];
        this.buttonWidth = new int[n];
        this.buttonHeight = new int[n];
        this.buttonX = new int[n];
        this.buttonY = new int[n];
        this.buttons = n;
    }

    public void usingIcons(int n) {
        this.icon = new JLabel[n];
        this.iconWidth = new int[n];
        this.iconHeight = new int[n];
        this.iconX = new int[n];
        this.iconY = new int[n];
        this.icons = n;
    }

    public void addMenuBar(int n, int n2) {
        this.menuBar = new MenuBar();
        this.setMenuBar(this.menuBar);
        this.menu = new Menu[n];
        this.item = new MenuItem[n][n2];
    }

    public void addMenu(int n, String string) {
        this.menu[n] = new Menu();
        this.menu[n].setLabel(string);
        this.menuBar.add(this.menu[n]);
    }

    public void addMenuItem(int n, int n2, String string) {
        this.item[n][n2] = new MenuItem();
        this.item[n][n2].setLabel(string);
        this.menu[n].add(this.item[n][n2]);
        this.item[n][n2].addActionListener(this);
    }

    public void addTextArea(int n, String string, int n2) {
        this.textArea[n] = new TextArea(string, 0, 0, n2);
        this.textAreaWidth[n] = this.textArea[n].getPreferredSize().width;
        this.textAreaHeight[n] = this.textArea[n].getPreferredSize().height;
        this.getContentPane().add(this.textArea[n]);
        this.repaint();
    }

    public void addTextArea(int n, String string, int n2, int n3, int n4) {
        this.textArea[n] = new TextArea(string, 0, 0, n4);
        this.textAreaWidth[n] = n2;
        this.textAreaHeight[n] = n3;
        this.getContentPane().add(this.textArea[n]);
        this.repaint();
    }

    public void addLabel(int n, String string) {
        this.label[n] = new JLabel(string);
        this.labelWidth[n] = this.label[n].getPreferredSize().width;
        this.labelHeight[n] = this.label[n].getPreferredSize().height;
        this.getContentPane().add(this.label[n]);
        this.repaint();
    }

    public void addLabel(int n, String string, int n2, int n3) {
        this.label[n] = new JLabel(string);
        this.labelWidth[n] = n2;
        this.labelHeight[n] = n3;
        this.getContentPane().add(this.label[n]);
        this.repaint();
    }

    public void addButton(int n, String string) {
        this.button[n] = new JButton(string);
        this.buttonWidth[n] = this.button[n].getPreferredSize().width;
        this.buttonHeight[n] = this.button[n].getPreferredSize().height;
        this.button[n].addActionListener(this);
        this.getContentPane().add(this.button[n]);
        this.repaint();
    }

    public void addButton(int n, String string, int n2, int n3) {
        this.button[n] = new JButton(string);
        this.buttonWidth[n] = n2;
        this.buttonHeight[n] = n3;
        this.button[n].addActionListener(this);
        this.getContentPane().add(this.button[n]);
        this.repaint();
    }

    public void addIcon(int n, String string) {
        this.icon[n] = new JLabel(new ImageIcon(string));
        this.iconWidth[n] = this.icon[n].getPreferredSize().width;
        this.iconHeight[n] = this.icon[n].getPreferredSize().height;
        this.getContentPane().add(this.icon[n]);
        this.repaint();
    }

    public void addIcon(int n, String string, int n2, int n3) {
        this.icon[n] = new JLabel(new ImageIcon(string));
        this.iconWidth[n] = n2;
        this.iconHeight[n] = n3;
        this.getContentPane().add(this.icon[n]);
        this.repaint();
    }

    public void showTextArea(int n, int n2, int n3) {
        Insets insets = this.getContentPane().getInsets();
        this.textArea[n].setBounds(n2 + insets.left, n3 + insets.top, this.textAreaWidth[n] - 9, this.textAreaHeight[n] - 51);
        this.getContentPane().add(this.textArea[n]);
        this.repaint();
    }

    public void showButton(int n, int n2, int n3) {
        Insets insets = this.getContentPane().getInsets();
        this.button[n].setBounds(n2 + insets.left, n3 + insets.top, this.buttonWidth[n], this.buttonHeight[n]);
        this.getContentPane().add(this.button[n]);
        this.repaint();
    }

    public void showLabel(int n, int n2, int n3) {
        Insets insets = this.getContentPane().getInsets();
        this.label[n].setBounds(n2, n3, this.labelWidth[n], this.labelHeight[n]);
        this.getContentPane().add(this.label[n]);
        this.repaint();
    }

    public void showIcon(int n, int n2, int n3) {
        Insets insets = this.getContentPane().getInsets();
        this.icon[n].setBounds(n2 + insets.left, n3 + insets.top, this.iconWidth[n], this.iconHeight[n]);
        this.getContentPane().add(this.icon[n]);
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            MenuItem menuItem = new MenuItem();
            MenuItem menuItem2 = (MenuItem)actionEvent.getSource();
            this.itemName = menuItem2.getLabel();
        }
        catch (Exception var2_4) {
            // empty catch block
        }
        try {
            JButton jButton = new JButton();
            JButton jButton2 = (JButton)actionEvent.getSource();
            this.buttonName = jButton2.getLabel();
        }
        catch (Exception var2_8) {
            // empty catch block
        }
    }

    public boolean clicked(String string) {
        if (this.itemName.equals(string)) {
            this.itemName = "";
            return true;
        }
        return false;
    }

    public boolean pressed(String string) {
        if (this.buttonName.equals(string)) {
            this.buttonName = "";
            return true;
        }
        return false;
    }

    public void close() {
        this.dispose();
    }

    public void end() {
        System.exit(3);
    }
}
