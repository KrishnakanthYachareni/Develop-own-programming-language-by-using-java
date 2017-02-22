/*
 * Decompiled with CFR 0_118.
 */
package myAPI;

public class var {
    public double num = 0.0;
    public String txt = "";
    public boolean bool = false;

    public var() {
    }

    public var(double d) {
        this.num = d;
        this.txt = "" + d + "";
        if (d != 0.0) {
            this.bool = true;
        }
    }

    public var(String string) {
        this.txt = string;
        try {
            this.num = Double.parseDouble(string);
        }
        catch (Exception var2_2) {
            // empty catch block
        }
        if (!string.equals("")) {
            this.bool = true;
        }
    }

    public void set(double d) {
        this.num = d;
        this.txt = "" + d + "";
        this.bool = d != 0.0;
    }

    public void set(String string) {
        this.txt = string;
        try {
            this.num = Double.parseDouble(string);
        }
        catch (Exception var2_2) {
            // empty catch block
        }
        this.bool = !string.equals("");
    }

    public void set(boolean bl) {
        this.bool = bl;
        this.txt = "" + bl;
        this.num = bl ? 1.0 : 0.0;
    }
}
