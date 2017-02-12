package beans;

import javax.inject.Inject;
import javax.inject.Named;

public class Person {
    private Long id;
    private String name;
    private String surname;
    private String email;

    @Inject
    @Named("companyAddress")
    private IAddress address;

    public Person() {
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
