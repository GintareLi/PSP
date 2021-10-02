package Validators;

import model.Country;

import java.util.ArrayList;
import java.util.List;

public class Phone {// phone validator

    List<Country> countryList = new ArrayList<Country>();
    String number;

    public Phone(String number) {
        this.number = number;
        countryList = List.of(
                new Country("LT", "+370", 12),
                new Country("LV", "+48", 12),
                new Country("PL", "+371", 12),
                new Country("RU", "+7", 10)
        );
    }


    public boolean checkIfOnlyNumbers() {



        char ch;
        int i;

        if (number.startsWith("+"))
            i = 1;
        else
            i = 0;
        while (i < number.length()) {
            ch = number.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public boolean changePrefix() {

        if (number.startsWith("8")) {
            number = number.replaceFirst("8", "+370");

        }
        return true;
    }

    public boolean checkForeignPrefix(String countryName) {

        Country currentCountry = countryList.stream()
                .filter(country -> countryName.equals(country.getName()))
                .findAny()
                .orElse(null);
        if (currentCountry == null)
            return false;
        else
            return checkForeignNumber(currentCountry);

    }

    public boolean checkForeignNumber(Country country) {

        if(number.length()==country.getLength())
        {
            return true;
        }
        return false;

    }

    public boolean CheckIfValid(){

        if(number==null)
            {
                return false;
            }
        return true;
    }


}
