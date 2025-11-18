import java.util.*;
/**
 * Class used to represent a student's data, holds name, age, gender, year, major, GPA, previous internships, and a preference list of other students for roommates
 * Must implement calculateConnectionStrength(), which calculates how "close" a student is with another student
 */
public abstract class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected int year;
    protected String major;
    protected double gpa;
    protected List<String> roommatePreferences;
    protected List<String> previousInternships;
    /**
     * Returns theoretical edge weight between this student and another student
     * @param other student to calculate connection with
     * @return how "close" the student is to other, metrics will depend on the implementation
     */
    public abstract int calculateConnectionStrength(Student other);
}
