import java.util.*;
import java.io.*;

public class NPC {

    private String firstName;
    private String firstWord;
    private String lastWord;
    private String fullName;
    private String lastName;
    private String title;
    private int gender;
    private Zone location = null;
    private boolean readyForSpeech = true;

    public void setReadyForSpeech(boolean bool) {
        readyForSpeech = bool;
    }

    public boolean getReadyforSpeech() {
        return readyForSpeech;
    }

    public void setLocation(Zone zone) {
        location = zone;
    }

    public Zone getLocation() {
        return location;
    }

    public void setGender(int i) {
        gender = i;
    }

    public int getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFirstName() throws IOException {
        String extension;
        if (getGender() == 1) {
            extension = "text/FemaleFirstNames";
        }
        else {
            extension = "text/FirstNames.txt";
        }

        BufferedReader br = new BufferedReader(new FileReader(extension));
        ArrayList<String> firstNames = new ArrayList<String>();
        Random ran = new Random();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            firstNames.add(line);
        }
        int random = ran.nextInt(firstNames.size() - 1);
        firstName = firstNames.get(random);
    }

    public void setFirstWord() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text/FirstWord.txt"));
        ArrayList<String> firstNames = new ArrayList<String>();
        Random ran = new Random();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            firstNames.add(line);
        }
        int random = ran.nextInt(firstNames.size() - 1);
        firstWord = firstNames.get(random);
    }

    public void setLastWord() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text/LastWord.txt"));
        ArrayList<String> firstNames = new ArrayList<String>();
        Random ran = new Random();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            firstNames.add(line);
        }
        int random = ran.nextInt(firstNames.size() - 1);
        lastWord = firstNames.get(random);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public String getLastWord() {
        return lastWord;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setFullName(String name) {
        fullName = name;
    }

    public void setTitle(String name) {
        title = name;
    }
    public void createName() throws IOException {
        setFirstName();
        setFirstWord();
        setLastWord();
        String stringLastName = getFirstWord() + getLastWord();
        String stringFullName = getFirstName() + " " + stringLastName;
        String stringTitle = "Professor " + getLastName();
        setLastName(stringLastName);
        setFullName(stringFullName);
        setTitle(stringTitle);
    }

    public void greetPlayer(Player player, TextVisualizer text) {
        if (location == player.getLocation() && getReadyforSpeech() == true ) {
            Random ran = new Random();
            int responseIndex = ran.nextInt(text.getStudentGreetings().size()-1);
            String npcGreeting = text.getStudentGreetings().get(responseIndex);
            System.out.println(getFullName() + " says:\n\n" +
                    npcGreeting);
        }



    }









}
