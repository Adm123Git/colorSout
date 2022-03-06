<h2>ColorSout</h2>
Утилита для вывода в консоль цветного текста.
<hr>
Библиотека размещена в репозитории MavenCentral.

Подключение зависимости Gradle:

    implementation 'ru.adm123:color-sout:0.0.1'

Подключение зависимости Maven:

    <dependency>
        <groupId>ru.adm123</groupId>
        <artifactId>color-sout</artifactId>
        <version>0.0.1</version>
    </dependency>


Пример использования:

    ColorSout.println(GREEN, "this is a green string");
    
    ColorSout.print(YELLOW, "yellow words");
    System.out.print(" ");
    ColorSout.print(RED, "red words");