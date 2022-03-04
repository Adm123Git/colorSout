package ru.adm123.colorSout;

/**
 * @author Dmitry Ushakov at 04.03.2022
 */
public final class ColorSout {

    private static final String COLOR_RESET = "\u001B[0m";

    public static void print(Color color,
                             String text) {
        text = text == null ? "" : text;
        System.out.print(color.getColorCode() + text + COLOR_RESET);
    }

    public static void println(Color color,
                               String text) {
        text = text == null ? "" : text;
        System.out.println(color.getColorCode() + text + COLOR_RESET);
    }

}
