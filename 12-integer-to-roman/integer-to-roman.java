class Solution {
    public String intToRoman(int num) {

        Stack<String> st = new Stack<>();
        int c = 0;

        while (num != 0) {

            int a = num % 10;
            num = num / 10;

            if (a == 0) {
                c++;
            } 
            else {
                if (c == 0) {
                    st.push(check(a));
                    c++;
                }

                else if (c == 1) {
                    int b = a * 10;
                    st.push(check(b));
                    c++;
                }

                else if (c == 2) {
                    int d = a * 100;
                    st.push(check(d));
                    c++;
                }

                else if (c == 3) {
                    int e = a * 1000;
                    st.push(check(e));
                    c++;
                }
            }
        }

        String s = "";

        while (!st.isEmpty()) {
            s = s + st.pop();
        }

        return s;
    }

    String check(int k) {

        if (k == 1) return "I";
        else if (k == 2) return "II";
        else if (k == 3) return "III";
        else if (k == 4) return "IV";
        else if (k == 5) return "V";
        else if (k == 6) return "VI";
        else if (k == 7) return "VII";
        else if (k == 8) return "VIII";
        else if (k == 9) return "IX";

        else if (k == 10) return "X";
        else if (k == 20) return "XX";
        else if (k == 30) return "XXX";
        else if (k == 40) return "XL";
        else if (k == 50) return "L";
        else if (k == 60) return "LX";
        else if (k == 70) return "LXX";
        else if (k == 80) return "LXXX";
        else if (k == 90) return "XC";

        else if (k == 100) return "C";
        else if (k == 200) return "CC";
        else if (k == 300) return "CCC";
        else if (k == 400) return "CD";
        else if (k == 500) return "D";
        else if (k == 600) return "DC";
        else if (k == 700) return "DCC";
        else if (k == 800) return "DCCC";
        else if (k == 900) return "CM";

        else if (k == 1000) return "M";
        else if (k == 2000) return "MM";
        else if (k == 3000) return "MMM";

        return "";
    }
}