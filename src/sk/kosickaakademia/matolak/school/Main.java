package sk.kosickaakademia.matolak.school;

public class Main {
    public static void main(String[] args) {
        Grades gradeS1 = new Grades(3,2,1);
        Student s1 = new Student("Marek", "Baca", gradeS1, ClassName.N1);
        Student s2 = new Student("Viliam", "Vozar", null, ClassName.N2);
        s1.setDob();
    }
}
