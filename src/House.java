public class House {

    private String name;
    private String color;
    private int points;


    public House(String houseName, String houseColor) {
        this.name = houseName;
        this.color = houseColor;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int change) {
        points += change;
    }

    public void removePoints(int change) {
        points -= change;
    }

}
