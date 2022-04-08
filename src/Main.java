import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:

| Строка заголовок с набором столбцов |
| Набор строк с целочисленными значениями |
| * Разделитель между столбцами - символ точка с запятой (;) |
Пример:

Value 1;Value 2;Value 3
100;200;123
300;400;500

Для хранения данных использовать класс вида:

public class AppData {
  private String[] header;
  private int[][] data;

 // ...
}

Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.

         */

        //Тестовые данные
        File file = new File("file.csv");
        String[] headers = {"value1","value2","value3"};
        int[][] data = {{1, 1, 1},{2, 2, 2},{3, 3, 3},{4, 4, 4}};
        AppData appData = new AppData(headers, data);

        System.out.println("Результат работы метода save: " + CSVTools.save(appData, file));

        System.out.println(CSVTools.load(file));
        System.out.println(CSVTools.read(file));

    }
}
