package modules;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getSalary();
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
}
