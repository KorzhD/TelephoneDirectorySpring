import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, String> {
     Contact findByFullName(String firstName, String lastName);
    Contact findByNumber(String number);
    void deleteByNumber(String number);
    void deleteByName(String firstName, String lastName);
    Contact findByLastName(String lastName);

}
