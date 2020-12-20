import java.util.*;
import java.io.*;

public class Zone {
    private String name;
    private Object item;
    private boolean hasItem;
    private TextVisualizer text = new TextVisualizer();
    private Scanner input = new Scanner(System.in);

    public Zone(String name, Object item) {
        this.name = name;
        this.item = item;
        this.hasItem = true;
    }

    public Object getItem() {
        return item;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHasItem(boolean bool) {
        hasItem = bool;
    }

    public boolean getHasItem() {
        return hasItem;
    }

    public void searchContents() throws IOException {
        TextVisualizer text = new TextVisualizer();
        Scanner input = new Scanner(System.in);

        if (getHasItem() == true) {
            text.searchContents();

            String itemName = input.next();
            String fileExtension = "text/" + getName() + ".txt";
            BufferedReader br = new BufferedReader(new FileReader(fileExtension));

            if (itemName.equalsIgnoreCase("quit")) {
                text.quitSearching();
                return;
            }

            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                if (line != null && line.equalsIgnoreCase(itemName)) {
                    text.foundItem(getItem().getObjectName());
                    setHasItem(false);
                    input.close();
                    return;
                }
            }
            text.itemNotInZone();
            searchContents();
        } else {
            text.contentsAreEmpty();
            input.close();
            return;
        }
    }

}

