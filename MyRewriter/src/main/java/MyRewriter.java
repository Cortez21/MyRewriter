

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @autor Maksim Yunusov (mailto:cortezzz1987@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MyRewriter {
    public static void main(String[] args) throws IOException {
        System.out.println("[Вставьте исходный текст:]");

        // Считываем исходный текст с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String original = reader.readLine();

        // Отправляем введенную строку методу Splitter.split().
        // Полученный таким образом массив строк заносим в переменную example.
        Splitter split = new Splitter();
        String[] example = split.split(original);

        // Поочередно выводим на экран все элементы полученного массива.
        // После каждого вывода считываем текст с клавиатуры. Полученные таким образом
        // новые фрагменты текста записываем в новый массив result..
        System.out.println("[Вводите своими словами:]");
        String[] result = new String[example.length];
        for (int i = 0; i < example.length; i++) {
            System.out.println(example[i]);
            result[i] = reader.readLine() + " ";
        }

        // Оправляем новый массив классу-склейщику.
        Gluer glue = new Gluer();
        String finality = glue.addUp(result);

        // Выводим полученную строку на экран.
        System.out.println("Исходная версия:" + "\r\n" + original);
        System.out.println("Окончательная версия:" + "\r\n" + finality);

    }
}
