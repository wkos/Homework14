package pl.wkos.homework142;

import java.util.Map;

public class WriteData {
    public static String writeToString(Map<String, Country> countries) {
        String listOfCountries = "";
        for (Map.Entry<String, Country> item : countries.entrySet()) {
            listOfCountries += item.getValue().toString() + "\n";
        }
        return listOfCountries;
    }

    public static String writeCountryToString(Map<String, Country> countries, String code) {
        String noSuchCountry = "Nie ma takiego państwa";
        for (Map.Entry<String, Country> item : countries.entrySet())
            if (item.getKey().equals(code)) {
                return item.getValue().toString();
            }
        return noSuchCountry;
    }
}
