/**
 * @autor Maksim Yunusov (mailto:cortezzz1987@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Gluer {
    /**
     * Получает массив который методом перебора ячеек склеиваеться в строку.
     * @param array - полученный массив.
     * @return - склееная из массива строка..git add .
     */
    public String addUp(String[] array) {
        // Используем класс StringBuilder для уменьшения нагрузки в работе со строковыми оперциями.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }
}
