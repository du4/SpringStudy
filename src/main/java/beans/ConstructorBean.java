package beans;

public class ConstructorBean {
    String name;
    Integer addres;

    public ConstructorBean() {
    }

    public ConstructorBean(String name, Integer addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddres() {
        return addres;
    }

    public void setAddres(Integer addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "ConstructorBean{" +
                "name='" + name + '\'' +
                ", addres=" + addres +
                '}';
    }
}
