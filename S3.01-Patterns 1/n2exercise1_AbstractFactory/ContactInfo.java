package n2exercise1_AbstractFactory;

public class ContactInfo {
    String name;
    Address address;
    PhoneNumber phoneNumber;

    public ContactInfo(String name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactInfo { " +
                "name = " + name + "; " +
                "address = " + address.getAddress() + "; " +
                "phone number = " + phoneNumber.getPhoneNumber() + " " +
                '}';
    }
}
