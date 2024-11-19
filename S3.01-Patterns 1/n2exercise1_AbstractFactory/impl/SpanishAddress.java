package n2exercise1_AbstractFactory.impl;

import n2exercise1_AbstractFactory.Address;

public class SpanishAddress implements Address {
    private String address;

    public SpanishAddress(String street, int number, int floor, String door, String city, String zipcode, String country) {
        this.address = street + " " + number + ", " + floor + ", " + door  + ", " + city + ", " + zipcode + ", " + country;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
