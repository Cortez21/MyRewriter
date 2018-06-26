
/**
 * @autor Maksim Yunusov (mailto:cortezzz1987@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Splitter {

    /**
     * Разбивает входящую строку на предложения по ключевым знакам(".", "?", "!", "...")
     * и возвращает разбитый текст в виде массива строк.
     * @param original - Оригинальный входящий текст.
     * @return - результат разбития в виде массива строк..
     */
    public String[] split(String original) {
        String pattern = "[\\.\\?\\!\\...]";
        String[] result = original.split(pattern);
        return result;
    }
}
