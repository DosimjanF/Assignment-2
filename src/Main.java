import modules.Employee;
import modules.Student;
import modules.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // We are creating instances for student and employee class:
        Employee employee1 = new Employee("John", "Wick", "Python Dev", 28811.0);
        Employee employee2 = new Employee("George", "Miller", "Filmmaker", 50000.0);
        Student student3 = new Student("Bakhtyiar", "Qalzhan", 2.59);
        Student student4 = new Student("Gadjiyev", "Rashad", 2.68);

        ArrayList<Person> people = new ArrayList<>();

        // We are adding each object into our 'people' arraylist
        people.add(employee1);
        people.add(employee2);
        people.add(student3);
        people.add(student4);

        // We are sorting our arraylist using a method from 'Collections'
        Collections.sort(people);

        // We are using our method of PrintData to print out the data of each objects
        printData(people);

    }

    public static void printData(Iterable<Person> people) {  // This method returns the data from to-string method of each object of our array
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
 }
