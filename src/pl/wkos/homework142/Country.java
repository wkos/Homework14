package pl.wkos.homework142;

import java.util.Objects;

public class Country {
    private String countryCode;
    private String name;
    private int numberOfCitizens;

    public Country(String countryCode, String name, int numberOfCitizens) {
        this.name = name;
        this.numberOfCitizens = numberOfCitizens;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public void setNumberOfCitizens(int numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        String ma = "ma";
        if (name.contains(" ")) {
            if (name.charAt(name.indexOf(" ") - 1) == 'y' || name.charAt(name.indexOf(" ") - 1) == 'e') ma = "mają";
        } else if (name.charAt(name.length() - 1) == 'y' || name.charAt(name.length() - 1) == 'e') ma = "mają";
        return name + " (" + countryCode + ") " + ma + " " + numberOfCitizens + " ludności";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryCode.equals(country.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode);
    }
}
