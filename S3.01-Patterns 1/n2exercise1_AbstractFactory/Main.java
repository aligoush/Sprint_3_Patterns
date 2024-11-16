package n2exercise1_AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContactInfo> contacts = new ArrayList<>();

        SpainFactory spain = new SpainFactory();
        String spainAddress = spain.createAddress("Roc Boronat", 5, 2, "2", "Barcelona", "08010", "Spain");
        String spainPhoneNumber = spain.createPhoneNumber("123", "45678");
        ContactInfo contact1 = new ContactInfo("Josemi Perez", spainAddress, spainPhoneNumber);
        contacts.add(contact1);

        USAFactory usa = new USAFactory();
        String usaAddress = usa.createAddress("Kingston", 313, 2, "A", "New York", "12401", "USA");
        String usaPhoneNumber = usa.createPhoneNumber("212", " 555 1234");
        ContactInfo contact2 = new ContactInfo("John Smith", usaAddress, usaPhoneNumber);
        contacts.add(contact2);

        for (ContactInfo contact : contacts) {
            System.out.println(contact);
        }
    }
}
