    // Problem #1
public class Teacher extends Person {
    // Instance variables
    protected double mySalary;    
    protected String mySubject;   

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySalary = salary;
        mySubject = subject;
    }

    // Getters and Setters
    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: $" + mySalary + ", subject: " + mySubject;
    }
}
