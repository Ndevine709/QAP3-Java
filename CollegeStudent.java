    // Problem #1
public class CollegeStudent extends Student {
    // Instance variables
    protected String myMajor;    // e.g., "Electrical Engineering", "Communications", "Undeclared"
    protected int myYear;        // year level (e.g., FROSH = 1, SOPH = 2, ...)

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
