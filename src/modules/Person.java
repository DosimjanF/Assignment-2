package modules;

abstract public class Person implements Payable, Comparable<Person>{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;


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

    public void setPosition(String position) {
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare((int) this.getPaymentAmount(), (int) o.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return getPosition() + ' ' + getId() + ": " + getName() + ' ' + getSurname();
    }
}
