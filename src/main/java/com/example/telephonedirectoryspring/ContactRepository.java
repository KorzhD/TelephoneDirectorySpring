package com.example.telephonedirectoryspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, String> {

  Contact findByFirstNameAndLastName(String firstName, String lastName);

  Contact findByNumber(String number);

  void deleteByNumber(String number);

  void deleteByFirstNameAndLastName(String firstName, String lastName);

  Contact findByLastName(String lastName);
}
