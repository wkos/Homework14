package pl.wkos.homework141;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "Data.txt";
        List<Integer> numbers = ReadData.readDataFromFile(fileName);
        if (numbers.size() != 0) {
            System.out.println(numbers.toString());
            Map<Integer, Integer> mapOfNumbers = MapConverterUtils.listOfIntegersToSortedMap(numbers);
            System.out.println(MapConverterUtils.printMapOfIntegerInteger(mapOfNumbers));
        }
    }
}
