package pl.wkos.homework141;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static List<Integer> readDataFromFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Integer number = Integer.parseInt(line);
                numbers.add(number);
            }
            return numbers;
        } catch (IOException e) {
            System.out.println("Błąd wejścia");
        }
        return numbers;
    }
}
