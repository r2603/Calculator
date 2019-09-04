
package calculator1;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator1 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String [] primer = read.readLine().split(" ");
        String a = primer[0];
        String b = primer[2];
        String operation = primer[1];
        
        Pattern pat = Pattern.compile("[0-9]");
        Matcher mat1 = pat.matcher(a);
        Matcher mat2 = pat.matcher(b);
        
        Pattern pat1 = Pattern.compile("[a-zA-Z]");
        Matcher mat3 = pat1.matcher(a);
        Matcher mat4 = pat1.matcher(b);
        
        Pattern pat2 = Pattern.compile("[0-9]+\\.[0-9]+");
        Matcher mat5 = pat2.matcher(a);
        Matcher mat6 = pat2.matcher(b);
        
        boolean isfound1 = mat1.find();
        boolean isfound2 = mat2.find();
        boolean isfound3 = mat3.find();
        boolean isfound4 = mat4.find();
        boolean isfound5 = mat5.find();
        boolean isfound6 = mat6.find();
        
        if (isfound1 && isfound2) {
            
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            
            if (((c < -32768 || c > 32768) || (d < -32768 || d > 32767)) || ((c < -32768 || c > 32767) && (d < -32768 || d > 32767)))
            {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректное число");
                }
            }
            
            else
                System.out.println(Arabic.calcul(c, operation, d));
        }
        
        if (isfound3 && isfound4) {
            int c = RomanToArabic.romanToArabic(a);
            int d = RomanToArabic.romanToArabic(b);
            
          
        if (((c < 0 || c > 32767) || (d < 0 || d > 32767)) || ((c < 0 || c > 32767) && (d < 0 || d > 32767)))
        {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректное число");
            }
        }
        else
                System.out.println(Roman.calcul(a, operation, b));
        }
        
        if ((isfound1 && isfound4) || (isfound3 && isfound2)) {
            try {
            throw new IOException();
        } catch (IOException e) {
                System.out.println("Введены арабские и римские цифры");
        }
        }
        if ((isfound5 && isfound2) || (isfound1 && isfound6) || (isfound5 && isfound6)) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Дробное число");
            }
            
        }
    }
    
}
