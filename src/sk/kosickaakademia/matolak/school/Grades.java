package sk.kosickaakademia.matolak.school;

public class Grades {
    private int math;
    private int eng;
    private int pro;

    public Grades(int math, int eng, int pro) {
        this.math = math;
        this.eng = eng;
        this.pro = pro;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int getPro() {
        return pro;
    }

    @Override
    public String toString() {
        return "Grades: MATEMATIKA: " + math + "ENG: " + eng + "PRO: " + pro;
    }
}
