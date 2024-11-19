package n2exercise1_AbstractFactory;

public interface CountryFactory {
    Address createAddress(String street, int number, int floor, String door, String city, String zipcode, String country);
    PhoneNumber createPhoneNumber(String areaCode, String localNumber);
}
