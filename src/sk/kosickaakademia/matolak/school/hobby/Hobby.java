package sk.kosickaakademia.matolak.school.hobby;

public abstract class Hobby {
    private String name;

    public Hobby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
