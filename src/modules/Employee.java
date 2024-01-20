package modules;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {  // Default no parameter constructor of Employee which only creates it with data
        super();
    }

    // This constructor lets you create an Employee object with name, surname, position and salary
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }  // This method is a setter for position

    public void setSalary(double salary) {
        this.salary = salary;
    }  // This method is a setter for salary

    public String getPosition() {
        return position;
    }  // This method returns the position

    @Override
    public double getPaymentAmount() {  // This method returns te value of salary.
        return this.salary;
    }
    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount();
    }  // Returns the data of object as a string


}
