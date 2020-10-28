package sk.kosickaakademia.matolak.school;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private int salary;
    private Date dob;
    private Grades grades;

    public Student(String firstName, String lastName, Grades grades, ClassName className){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ClassName getClassName() {
        return className;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDob() {
        return dob;
    }

    public Grades getGrades() {
        return grades;
    }
}
