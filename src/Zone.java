import java.util.*;
import java.io.*;

public class Zone {
    private String name;
    private boolean hasBeenVisited = false;


    public Zone() {
    }

    public void setHasBeenVisited(Boolean bool) {
        hasBeenVisited = bool;
    }

    public boolean getHasBeenVisited() {
        return hasBeenVisited;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

