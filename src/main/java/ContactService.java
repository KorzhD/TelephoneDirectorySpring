import org.springframework.stereotype.Service;

import java.util.List;


public interface ContactService {

    void addContact(Contact contact);
    List<Contact> getAllContacts();
    Contact findByFullName(String firstName, String lastName);
    Contact findByNumber(String number);
    void deleteByNumber(String number);
    void deleteByName(String firstName, String lastName);
    Contact findByLastName(String lastName);
    Contact updateContact(Contact contact);



}
