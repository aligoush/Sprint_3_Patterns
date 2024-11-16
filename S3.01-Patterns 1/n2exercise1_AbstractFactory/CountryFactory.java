package n2exercise1_AbstractFactory;

public interface CountryFactory {
    String createAddress(String street, int number, int floor, String door, String city, String zipcode, String country);
    String createPhoneNumber(String areaCode, String localNumber);
}
