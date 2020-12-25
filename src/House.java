public class House {

    private String name;
    private String color;
    private int points = 0;
    private int processCount = 0;

    public void setName(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }

    public int getProcessCount() {
        return processCount;
    }

    public void setProcessCount(int num) {
        processCount = num;
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

