package sk.kosickaakademia.matolak.school.hobby;

public class Movie extends Hobby {
    private int year;
    public Movie(String name, int year) {
        super(name);
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}
