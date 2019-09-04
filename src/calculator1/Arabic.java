
package calculator1;

import java.io.IOException;

public class Arabic {
    public static int calcul(int a, String operation, int b) {
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a - b;
                break;
            default:
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Арифметически неправильная операция");
                    System.exit(0);
                }
        }
        return result;
    }
    
}
