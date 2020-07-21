package pl.wkos.homework142;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "Countries.csv";
        Map<String, Country> countries = ReadData.readDataFromFile(fileName);
        if (countries.size() != 0) {
            System.out.println(WriteData.writeToString(countries));

            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje");
            String countryCode = ReadData.readCountryCodeFromConsole();
            System.out.println(WriteData.writeCountryToString(countries, countryCode));
        }
    }
}
