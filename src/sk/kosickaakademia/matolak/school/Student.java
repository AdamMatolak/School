package sk.kosickaakademia.matolak.school;

import sk.kosickaakademia.matolak.school.hobby.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private int salary;
    private Date dob;
    private Grades grades;
    private Hobby[] hobbies;
    private int countHobbies;

    public Student(String firstName, String lastName, Grades grades, ClassName className){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        hobbies = new Hobby[5];
        countHobbies = 0;
    }

    public Student(String firstName, String lastName, Grades grades, ClassName className, Date dob ){
        this(firstName,lastName,grades,className);
        this.dob=dob;
    }

    public void setSalary(int salary) { this.salary = salary; }

    public void setDob(Date dob) {
        this.dob = dob;
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

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + getGrades().getAverage();
    }

    public void addHobby(Hobby newHobby){
        int len = hobbies.length;
        if(countHobbies==len){
            System.out.println("Nie je možné pridať ďalšie hobby!");
            return;
        }
        hobbies[countHobbies++] = newHobby;
    }

    public void printHobbies(){
        System.out.println("Student's hobby: ");
        int len = hobbies.length;
        for(int i = 0;i < countHobbies;i++){
            System.out.println(hobbies[i].getName());
            if(hobbies[i] instanceof Book){
                System.out.println(((Book)hobbies[i]).getAuthor());
            }
            if(hobbies[i] instanceof Movie){
                System.out.println(((Movie)hobbies[i]).getYear());
            }
            if(hobbies[i] instanceof Sport){
                System.out.println(((Sport)hobbies[i]).getType());
            }
            if(hobbies[i] instanceof Gaming){
                System.out.println(((Gaming)hobbies[i]).getGenre());
            }
            if(hobbies[i] instanceof Travelling){
                System.out.println(((Travelling)hobbies[i]).getFavoriteCity());
            }
        }
    }
}
