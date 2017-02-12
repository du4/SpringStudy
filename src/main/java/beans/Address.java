package beans;

import java.util.List;

public class Address implements IAddress{

    Long id;

    Integer home;

    String street;

    List<Integer>flats;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Integer> getFlats() {
        return flats;
    }

    public void setFlats(List<Integer> flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", home=" + home +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (id != null ? !id.equals(address.id) : address.id != null) return false;
        if (home != null ? !home.equals(address.home) : address.home != null) return false;
        return street != null ? street.equals(address.street) : address.street == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (home != null ? home.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }
}
