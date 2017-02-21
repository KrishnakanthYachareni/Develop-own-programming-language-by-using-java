/*
 * Developed By Yachareni Krishnakanth 16/02/2017 @All copy rights Reserved.
 */
class Tokenizer {
    String t = "";
    int pos;

    Tokenizer(String s) {
        this.t = s;
        this.pos = 0;
    }

    String next() {
        int i = this.pos;
        int c = 0;
        String a = "";
        while (i < this.t.length()) {
            if (!this.check(this.t.charAt(i))) {
                a = a + this.t.charAt(i);
                ++i;
                ++c;
                continue;
            }
            if (c != 0) break;
            a = "" + this.t.charAt(i);
            ++i;
            break;
        }
        this.pos = i;
        return a;
    }

    boolean check(char a) {
        if (a != ' ' && a != ',' && a != '.' && a != '=' && a != '!' && a != '<' && a != '>' && a != '+' && a != '-' && a != '/' && a != '%' && a != '*' && a != '?' && a != '\'' && a != '\"' && a != '\\' && a != '{' && a != '}' && a != '[' && a != ']' && a != '|' && a != ')' && a != '(' && a != '&' && a != '^' && a != '#' && a != '\t') {
            return false;
        }
        return true;
    }

    String reverse(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            temp = temp + s.charAt(i);
        }
        return temp;
    }
}
