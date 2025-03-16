    // Problem #1
public class CollegeStudent extends Student {
    // Instance variables
    protected String myMajor;    
    protected int myYear;        

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getters and Setters
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", major: " + myMajor + ", year: " + myYear;
    }
}
