package beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    private static final Logger LOG = LoggerFactory.getLogger(Person.class);

    private Long id;
    private String name;
    private String surname;
    private String email;

    private IAddress address;

    public Person() {
    }

    public Person(Long id, String name, String surname, String email, IAddress address ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    @Autowired
    public Person(@AddressAnnotated IAddress address) {
        this.address = address;
    }

    public static Person getInstance() {
        return null;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }

    public void destroy() {
        this.id  = null;
        this.name = null;
        this.surname = null;
        this.email = null;
        this.address = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
