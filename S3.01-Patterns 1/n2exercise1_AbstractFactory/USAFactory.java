package n2exercise1_AbstractFactory;

public class USAFactory implements CountryFactory {

    String countryCode = "+1";
    @Override
    public String createAddress(String street, int number, int floor, String door, String city, String zipcode, String country) {
        return number + " " + street + ", " + floor + ", " + door  + ", " + city + ", " + zipcode + ", " + country;
    }

    @Override
    public String createPhoneNumber(String areaCode, String localNumber) {
        return countryCode + " " + areaCode + " " + localNumber;
    }
}
