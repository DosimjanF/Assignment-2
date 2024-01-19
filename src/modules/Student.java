package modules;

public class Student extends Person {
    private double gpa;
    public double salary;

    public Student(){
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }



    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount();
    }


    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {return 36660.0;}
        return 0;
    }
}