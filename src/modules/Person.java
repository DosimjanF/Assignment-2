package modules;

abstract public class Person implements Payable, Comparable<Person>{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;


    public Person() {
        this.id = id_gen++;
    }  // Default no argument constructor that creates an object with only id
    public Person(String name, String surname) {  // This constructor lets you create an object with name and surname along with generating a unique id
        this.id = id_gen++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }  // This method returns the id

    public String getName() {
        return name;
    }  // This method returns the name

    public String getSurname() {
        return surname;
    }  // This method returns the surname

    public String getPosition() {  // This method returns the position
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }  // This is a setter for name

    public void setSurname(String surname) {
        this.surname = surname;
    }  // This is a setter for surname

    public void setPosition(String position) {  // This is a setter for position
        this.position = position;
    }

    @Override
    public int compareTo(Person o) {  // This method lets you compare salaries of two people
        return Integer.compare((int) this.getPaymentAmount(), (int) o.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }  // This method returns the salary

    @Override
    public String toString() {  // Returns the data of objects as a string
        return getPosition() + ' ' + getId() + ": " + getName() + ' ' + getSurname();
    }
}
