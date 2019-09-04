
package calculator1;

import java.io.IOException;

public class Roman {
    public static String calcul(String a, String operation, String b) throws IOException {
        int c = RomanToArabic.romanToArabic(a);
        int d = RomanToArabic.romanToArabic(b);
        int result = 0;

        switch (operation) {
            case "+":
                result = c + d;
                break;
            case "-":
                result = c - d;
                break;
            case "*":
                result = c * d;
                break;
            case "/":
                result = c / d;
                break;
            default:
                try {
                    throw new IOException();
                }
                catch(IOException exc) {
                    System.out.println("Арифметически неправильная операция");
                    System.exit(0);
                }
        }

        return ArabicToRoman.arabicToRoman(result);

    }

}
