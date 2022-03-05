package ru.adm123.colorSout;

/**
 * @author Dmitry Ushakov at 04.03.2022
 */
public enum Color {

    /**
     * Черный
     */
    BLACK("\u001B[30m"),
    /**
     * Красный
     */
    RED	("\u001B[31m"),
    /**
     * Зеленый
     */
    GREEN("\u001B[32m"),
    /**
     * Желтый
     */
    YELLOW("\u001B[33m"),
    /**
     * Синий
     */
    BLUE("\u001B[34m"),
    /**
     * Фиолетовый
     */
    PURPLE("\u001B[35m"),
    /**
     * Сине-зеленый
     */
    CYAN("\u001B[36m"),
    /**
     * Белый
     */
    WHITE("\u001B[37m");

    private final String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * Возвращает цвет в "понятном" для метода {@code System.out.print()} виде
     * @return строковое значение цвета
     */
    public String getColorCode() {
        return colorCode;
    }

}
