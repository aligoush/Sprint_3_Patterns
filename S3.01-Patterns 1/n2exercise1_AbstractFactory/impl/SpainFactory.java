package n2exercise1_AbstractFactory.impl;

import n2exercise1_AbstractFactory.CountryFactory;

public class SpainFactory implements CountryFactory {
    private final String countryCode = "+34";
    @Override
    public SpanishAddress createAddress(String street, int number, int floor, String door, String city, String zipcode, String country) {
        return new SpanishAddress(street, number, floor, door, city, zipcode, country);
    }

    @Override
    public SpanishPhoneNumber createPhoneNumber(String areaCode, String localNumber) {
        return new SpanishPhoneNumber(countryCode, areaCode, localNumber);
    }
}
