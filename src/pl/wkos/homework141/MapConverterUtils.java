package pl.wkos.homework141;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapConverterUtils {
    public static Map<Integer, Integer> listOfIntegersToSortedMap(List<Integer> l) {
        Map<Integer, Integer> mapOfNumbers = new TreeMap<>();
        for (Integer item : l) {
            if (mapOfNumbers.containsKey(item)) {
                mapOfNumbers.put(item, mapOfNumbers.get(item) + 1);
            } else {
                mapOfNumbers.put(item, 1);
            }
        }
        return mapOfNumbers;
    }

    public static String printMapOfIntegerInteger(Map<Integer, Integer> map) {
        String toScreen = "";
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            toScreen += item.getKey() + " - liczba wystąpień: " + item.getValue() + "\n";
        }
        return toScreen;
    }
}
