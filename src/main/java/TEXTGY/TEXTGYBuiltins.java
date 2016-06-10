package TEXTGY;

import java.util.Scanner;

/**
 * Created by rainvagel on 10.06.16.
 */
public class TEXTGYBuiltins {

    private static Scanner systemInScanner = null;

    public static boolean fnNot(boolean x) {return !x;}

    public static boolean fnAnd(boolean a, boolean b) { return a && b;}

    public static boolean fnOr(boolean a, boolean b) {return a || b;}

    public static void fnPrint(Object value) { System.out.println(value);}

    public static String fnInput(String prompt) {
        System.out.println(prompt);

        if (systemInScanner == null) {
            systemInScanner = new Scanner(System.in);
        }
        return systemInScanner.nextLine().replaceAll("\\r", "").replaceAll("\\n", "");
    }

    public static String fnInput() { return fnInput("");}

    public static String fnUpper(String s) { return s.toUpperCase();}

    public static String fnLower(String s) {return s.toLowerCase();}

    public static int fnPwr(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only nonnegative exponent is allowed");
        }

        int result = 1;
        while (n>0) {
            result *= x;
            n--;
        }
        return result;
    }

    public static int fnStrToInt(String input) {
        return Integer.parseInt(input);
    }

    public static double fnStrToDbl(String input) {
        return Double.parseDouble(input);
    }

    //TODO
//    public static boolean fnHasItem(Object object) {}

//    public static boolean fnHasSkill(String input) {}

//    public static boolean fnHasBody(Object object) {}
}
