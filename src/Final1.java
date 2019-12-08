/** Итоговая задача №1
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 * для перевода числа из одной системы счисления в другую.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Final1 {
    public static void main (String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите бинароное число: ");
        char[] charArray = reader.readLine().toCharArray();
        int result = 0;
        int factor = 1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            int num = Character.getNumericValue(charArray[i]);
            if (num > 1 || num < 0) {
                System.out.println("Это не бинарное число!");
                return;
            } else if (num == 1) result += factor;
            factor *= 2;
        }
        System.out.println("Перевод в десятичный формат: " + result);
    }

    }