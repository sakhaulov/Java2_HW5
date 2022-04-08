import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CSVTools {

    public static Boolean save(AppData data, File file) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            //Записываем заголовки
            for (int i = 0; i < data.getHeaders().length; i++) {
                writer.write(data.getHeaders()[i]);
                if (i+1 == data.getHeaders().length) {
                    writer.write("\n");
                }
                else {
                    writer.write(";");
                }
            }

            //Записываем значения
            for (int i = 0; i < data.getData().length; i++) {
                for (int j = 0; j < data.getData()[i].length; j++) {
                    writer.write(String.valueOf(data.getData()[i][j]));
                    if (j+1 == data.getData()[i].length) {
                        writer.write("\n");
                    }
                    else {
                        writer.write(";");
                    }
                }
            }

            return true;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }


    public static String load(File file) {
        StringBuilder data = new StringBuilder();

        try (Scanner sc = new Scanner(file)) {
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                data.append(sc.next()).append(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return data.toString().trim();
    }

    //alt load
    public static String read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            StringBuilder data = new StringBuilder();

            while ((str = reader.readLine()) != null) {
                data.append(str).append("\n");
            }

            return data.toString().replaceAll(";", " ");
        }
        
        catch(IOException e) {
            return e.getMessage();
        }
    }

}
