import java.util.*;

public class Container {

    private String containerId;
    private String containerName;
    private ArrayList<Object> contents;
    private boolean isLocked;
    private int lockLevel;

    public Container(String id, String name, boolean locked, int lockLevel) {
        ArrayList<Object> contents = new ArrayList<Object>();
        this.contents = contents;
        this.containerId = id;
        this.containerName = name;
        this.isLocked = locked;
        this.lockLevel = lockLevel;
    }

    public Container(String id, String name) {
        ArrayList<Object> contents = new ArrayList<Object>();
        this.contents = contents;
        this.containerId = id;
        this.containerName = name;
        this.isLocked = false;
    }

    public Container(Container container) {
        this.containerId = container.getContainerID();
        this.containerName = container.getContainerName();
        this.contents = container.getContents();
        this.isLocked = container.getIsLocked();
        this.lockLevel = container.getLockLevel();
    }

    public String getContainerID() {
        return containerId;
    }

    public String getContainerName() {
        return containerName;
    }

    public ArrayList<Object> getContents() {
        return contents;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public int getLockLevel() {
        return lockLevel;
    }

    public void setIsLocked(boolean bool){
        lockLevel = bool;
    }

    public void addItem(Object object) {
        contents.add(object);
    }

    public void emptyContents() {
        contents.clear();
    }

}
