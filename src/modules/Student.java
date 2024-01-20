package modules;

public class Student extends Person {
    private double gpa;
    private double salary;

    public Student(){
        super();
    }  // Default no argument constructor that creates an instance with only id

    public Student(String name, String surname, double gpa){  // This constructor lets you create a student object with name, surname and gpa
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }  // This method is a setter for gpa

    public double getGpa() {
        return gpa;
    }  // This method returns the gpa

    @Override
    public String getPosition() {  // This method overrides the getPosition method to return "Student"
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount();
    }  // Returns the data of object as a string


    @Override
    public double getPaymentAmount() {  // Returns the payment amount for student according to gpa
        if (getGpa() > 2.67) {return 36660.0;}
        return 0;
    }
}
