package ru.gotoqa;

/**
 * @author Muflikhunov Roman
 */

public class CodingbatString1 {

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public static String extraEnd(String str) {
        int last = str.length() - 2;
        String arg = str.substring(last);
        return arg + arg + arg;
    }

    public static String firstTwo(String str) {
        int first = str.length();

        if (first >= 2) {
            return str.substring(0, 2);
        } else return str;
    }

    public static String firstHalf(String str) {
        int lngt = str.length() / 2;
        return str.substring(0, lngt);
    }

    public static String withoutEnd(String str) {
        int last = str.length() - 1;
        String arg = str.substring(1, last);
        return arg;
    }

    public static String comboString(String a, String b) {

        if (a.length() < b.length()) {
            return a + b + a;
        } else
            return b + a + b;
    }


    public static String nonStart(String a, String b) {
        String arg1 = a.substring(1);
        String arg2 = b.substring(1);
        String arg3 = arg1 + arg2;

        if ((a + b).length() <= 1) {
            return a + b;
        } else
            return arg3;
    }

    public static String left2(String str) {
        int first = str.length();

        if (first >= 2) {
            return str.substring(2) + str.substring(0, 2);
        } else return str;
    }

    public static String right2(String str) {
        int last = str.length() - 2;
        String arg = str.substring(last);
        return arg + str.substring(0, last);
    }

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            int last = str.length() - 1;
            String arg = str.substring(last);
            return arg;
        }
    }

    public static String withouEnd2(String str) {
        int last = str.length() - 1;

        if (str.length() == 1 || str.length() == 0) {
            return "";
        } else
            return str.substring(1, last);
    }

    public static String middleTwo(String str) {
        int arg = str.length() / 2;
        return str.substring(arg - 1, arg + 1);
    }

    public static String conCat(String a, String b) {

        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }

        int last1 = a.length() - 1;
        String arg1 = a.substring(last1);
        String arg2 = b.substring(0, 1);

        if (arg1.equals(arg2)) {
            return a.substring(0, last1) + b;
        } else {
            return a + b;
        }

    }

    public static String withoutX(String str) {
        if (str.length() == 0) {
            return "";
        }

        int last = str.length() - 1;
        String arg1 = str.substring(last);
        String arg2 = str.substring(0, 1);

        if (arg1.equals("x") || arg2.equals("x")) {
            return str.replaceAll("x$|^x", "");
        } else return str;

    }

    public static boolean hasBad(String str) {
        if (str.length() <= 3 && !str.equals("bad")) {
            return false;
        }

        if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
            return true;
        } else return false;
    }

    public static boolean endsLy(String str) {

        if (str.length() < 2) {
            return false;
        }

        int last = str.length() - 2;
        String lastChar = str.substring(last);

        if (lastChar.equals("ly")) {
            return true;
        } else return false;

    }

    public static String nTwice(String str, int n) {
        int last = str.length() - n;
        String lastSomeChar = str.substring(last);

        String firstSomeChar = str.substring(0, n);
        return lastSomeChar + "   " + firstSomeChar;
    }


    public static String twoChar(String str, int index) {
        if (index < 0 || str.length() < index || str.substring(index).length() < 2) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }


    public String middleThree(String str) {
        int index = str.length() / 2;

        if (str.length() > 3) {
            return str.substring(index - 1, index + 2);
        } else return str;

    }


    public String atFirst(String str) {
        int first = str.length();
        if (first >= 2) {
            return str.substring(0, 2);
        } else {
            if (str.length() == 1) {
                return str + "@";
            } else return "@@";
        }

    }


    public static String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() != 0) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.length() == 0 && a.length() != 0) {
            return a.substring(0, 1) + "@";
        }
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);

    }


    public static String lastTwo(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2) + String.valueOf(str.charAt(str.length() - 1)) + String.valueOf(str.charAt(str.length() - 2));
        } else return str.substring(1, 1) + str.substring(0, 1);

    }


    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }

        if (str.startsWith("blue")) {
            return "blue";
        }

        return "";
    }


    public boolean frontAgain(String str) {
        if (str.length() != 1 && str != "" && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        } else return false;
    }


    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else {
            if (a.length() > b.length()) {
                return a.substring(a.length() - b.length()) + b;
            } else return a + b.substring(b.length() - a.length());
        }
    }


    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }


    public static String without2(String str) {
        if (str.length() == 1 || str.length() == 0 || !str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str;
        } else return str.substring(2);
    }


    public static String deFront(String str) {
        if (String.valueOf(str.charAt(0)).equals("a") && String.valueOf(str.charAt(1)).equals("b")) {
            return "ab" + str.substring(2);
        }

        if (String.valueOf(str.charAt(0)).equals("a")) {
            return "a" + str.substring(2);
        }

        if (String.valueOf(str.charAt(1)).equals("b")) {
            return "b" + str.substring(2);
        }
        return str.substring(2);
    }


    public String withoutX2(String str) {
        if (str.equals("x") || str.length() == 0) {
            return "";
        }

        if (String.valueOf(str.charAt(0)).equals("x") && String.valueOf(str.charAt(1)).equals("x")) {
            return str.substring(2);
        }

        if (String.valueOf(str.charAt(0)).equals("x")) {
            return str.substring(1);
        }

        if (str.length() == 0 || String.valueOf(str.charAt(1)).equals("x")) {
            return String.valueOf(str.charAt(0)) + str.substring(2);
        }

        return str;

    }


    public static String startWord(String str, String word) {

        return null;

    }


    //Recursion-1
    public static int factorial(int n) {
        int result;
        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        return result;
    }


    public int bunnyEars(int bunnies) {
        int result;
        if (bunnies == 0) return 0;
        result = bunnyEars(bunnies-1)+2;
        return result;
    }


    public int fibonacci(int n) {
        int result;
        if (n == 0) return 0;
        if (n == 1) return 1;//f(n)=f(n-1) + f(n-2)
        result = fibonacci(n-1)+fibonacci(n-2);
        return result;
    }




    public static void main(String[] args) {
        System.out.println(factorial(2));


/*        System.out.println(deFront("aDos"));
        System.out.println(without2("HelloHe"));
        System.out.println(lastTwo("Roma"));
        System.out.println(lastChars("hi", ""));
        System.out.println(twoChar("java", -1));
        System.out.println(squirrelPlay(95, false));
        System.out.println(dateFashion(8,2));
        System.out.println(cigarParty(30, false));
        System.out.println(nTwice("Viena", 1));
        System.out.println(hasBad("Comedy"));
        System.out.println(withoutX("Torx"));
        System.out.println(withoutX(""));
        System.out.println(extraEnd("Vika"));
        System.out.println(firstTwo("Roman"));
        System.out.println(firstHalf("GotoQA"));
        System.out.println(withoutEnd("QA"));
        System.out.println(comboString("Sex", "Rock"));
        System.out.println(nonStart("Kent", "Barby"));
        System.out.println(left2("Dindon"));
        System.out.println(right2("Moscow"));
        System.out.println(theEnd("PlayBoy", true));
        System.out.println(theEnd("PlayBoy", false));
        System.out.println(withouEnd2("Parallilogram"));
        System.out.println(middleTwo("Roma"));
        System.out.println(conCat("Roma", "aVika"));*/
    }
}
