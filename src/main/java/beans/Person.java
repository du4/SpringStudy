package beans;

import javax.inject.*;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private Long id;
    private String name;
    private String surname;
    private String email;

    @Inject
    @AddressAnnotated
    @CompanyAddr
    private Set <IAddress> addresses;

    public Person() {
    }

    public Person(Provider<IAddress> addressProvider) {
        addresses = new HashSet<IAddress>();
        for (int i = 0 ; i < 5 ; i++){
            addresses.add(addressProvider.get());
        }
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

    public Set<IAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<IAddress> addresses) {
        this.addresses = addresses;
    }

    public void destroy() {
        this.id  = null;
        this.name = null;
        this.surname = null;
        this.email = null;
        this.addresses = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address=" + addresses +
                '}';
    }
}
