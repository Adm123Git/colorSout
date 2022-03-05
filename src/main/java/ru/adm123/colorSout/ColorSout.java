package ru.adm123.colorSout;

/**
 * @author Dmitry Ushakov at 04.03.2022
 */
public final class ColorSout {

    private static final String COLOR_RESET = "\u001B[0m";

    /**
     * Класс - утилитный, публичный конструктор ему не нужен
     */
    private ColorSout() {
    }

    /**
     * Аналог метода {@code System.out.print(String)} с той разницей, что
     * текст выводится в заданном цвете
     *
     * @param color цвет текста, заданный константой {@link Color}
     * @param text  текст для вывода
     */
    public static void print(Color color,
                             String text) {
        textOut(color, text, false);
    }

    /**
     * Аналог метода {@code System.out.println(String)} с той разницей, что
     * текст выводится в заданном цвете
     *
     * @param color цвет текста, заданный константой {@link Color}
     * @param text  текст для вывода
     */
    public static void println(Color color,
                               String text) {
        textOut(color, text, true);
    }

    private static void textOut(Color color,
                                String text,
                                boolean goNextString) {
        text = text == null ? "" : text;
        System.out.print(color.getColorCode());
        System.out.print(text);
        System.out.print(COLOR_RESET);
        if (goNextString) {
            System.out.println();
        }
    }

}
