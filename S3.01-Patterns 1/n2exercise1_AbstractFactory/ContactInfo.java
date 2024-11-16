package n2exercise1_AbstractFactory;

public class ContactInfo {
    String name;
    String address;
    String phoneNumber;

    public ContactInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactInfo { " +
                "name = " + name + "; " +
                "address = " + address + "; " +
                "phone number = " + phoneNumber + "; " +
                '}';
    }
}
