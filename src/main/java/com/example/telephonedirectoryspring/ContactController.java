package com.example.telephonedirectoryspring;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/td")
@AllArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/add")
    public void addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
    }

    @GetMapping("/getAll")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{firstName}/{lastName}")
    public Contact findByFullName(@PathVariable String firstName, @PathVariable String lastName) {
        return contactService.findByFullName(firstName, lastName);
    }

    @GetMapping("/{number}")
    public Contact findByNumber(@PathVariable String number) {
        return contactService.findByNumber(number);
    }

    @DeleteMapping("/delete_num/{number}")
    public void deleteByNumber(@PathVariable String number) {
        contactService.deleteByNumber(number);
    }

    @DeleteMapping("/delete_name/{firstName}/{lastName}")
    public void deleteByName(@PathVariable String firstName, @PathVariable String lastName) {
        contactService.deleteByName(firstName, lastName);
    }

    @GetMapping("/search_lastName/{lastName}")
    public Contact findByLastName(@PathVariable String lastName) {
        return contactService.findByLastName(lastName);
    }

    @PutMapping("change_contact/")
    public Contact updateContact(Contact contact) {
        return contactService.updateContact(contact);
    }
}
