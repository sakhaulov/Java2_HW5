import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

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
