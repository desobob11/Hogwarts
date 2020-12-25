import java.util.Comparator;

public abstract class houseComparator implements Comparator {
    public int compare(House o1, House o2) {
        return o1.getProcessCount() - o2.getProcessCount();
    }
}
