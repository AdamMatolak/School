package sk.kosickaakademia.matolak.school.hobby;

public class Travelling extends Hobby {
private String favoriteCity;

    public Travelling(String name, String favoriteCity) {
        super(name);
    }

    public String getFavoriteCity() {
        return favoriteCity;
    }

    public void setFavoriteCity(String favoriteCity) {
        this.favoriteCity = favoriteCity;
    }
}
