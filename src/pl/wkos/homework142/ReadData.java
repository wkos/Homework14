package pl.wkos.homework142;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadData {
    public static Map<String, Country> readDataFromFile(String fileName) {
        Map<String, Country> countries = new HashMap<>();
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(";");
                countries.put(data[0], new Country(data[0], data[1], Integer.parseInt(data[2])));
            }
            return countries;
        } catch (IOException e) {
            System.out.println("Błąd wejścia");
        }
        return countries;
    }

    public static String readCountryCodeFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
