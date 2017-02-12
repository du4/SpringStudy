package beans;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class CollectionBean {
    private Set<String> names;
    private Collection<String>cars;
    private String[] cities;
    private Collection<Person> persons;

    public CollectionBean() {
    }

    public CollectionBean(Set<String> names, Collection<String> cars, String[] cities, Collection<Person> persons) {
        this.names = names;
        this.cars = cars;
        this.cities = cities;
        this.persons = persons;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public Collection<String> getCars() {
        return cars;
    }

    public void setCars(Collection<String> cars) {
        this.cars = cars;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public Collection<Person> getPersons() {
        return persons;
    }

    public void setPersons(Collection<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "names=" + names +
                ", cars=" + cars +
                ", cities=" + Arrays.toString(cities) +
                ", persons=" + persons +
                '}';
    }
}
