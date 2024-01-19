package models;

abstract public class Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;


    public Person() {
        this.id = id_gen++;
    }
    public Person(String name, String surname) {
        this.id = id_gen++;
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
