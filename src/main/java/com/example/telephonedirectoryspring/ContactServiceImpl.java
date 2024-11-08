package com.example.telephonedirectoryspring;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService{

    private final ContactRepository repository;

    @Override
    public void addContact(Contact contact) {
    repository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public Contact findByFullName(String firstName, String lastName) {
        return repository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Contact findByNumber(String number) {
        return repository.findByNumber(number);
    }

    @Override
    @Transactional
    public void deleteByNumber(String number) {
        repository.deleteByNumber(number);
    }

    @Override
    @Transactional
    public void deleteByName(String firstName, String lastName) {
    repository.deleteByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Contact findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return repository.save(contact);
    }
}
