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


    public String selectWord(String extension, ArrayList<String> array) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(extension));
        Random ran = new Random();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            array.add(line);
        }
        int random = ran.nextInt(array.size() - 1);
        return array.get(random);
    }

    public void setFirstName() throws IOException {
        String extension;
        if (getGender() == 1) {
            extension = "text/FemaleFirstNames";
        }
        else {
            extension = "text/FirstNames.txt";
        }
        ArrayList<String> firstNames = new ArrayList<String>();
        firstName = selectWord(extension, firstNames);

    }


    public void setFirstWord() throws IOException {
        String extension = "text/FirstWord.txt";
        ArrayList<String> firstWords = new ArrayList<String>();
        firstWord = selectWord(extension, firstWords);
    }


    public void setLastWord() throws IOException {
        String extension = "text/LastWord.txt";
        ArrayList<String> lastWords = new ArrayList<String>();
        lastWord = selectWord(extension, lastWords);
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
        setLastName(stringLastName);
        setFullName(stringFullName);
        String stringTitle = "Professor " + getLastName();
        setTitle(stringTitle);
    }


    public void greetPlayer(Player player, TextVisualizer text) {
        if (getLocation() == player.getZone() && getReadyforSpeech() == true ) {
            Random ran = new Random();
            int responseIndex = ran.nextInt(text.getStudentGreetings().size()-1);
            String npcGreeting = text.getStudentGreetings().get(responseIndex);
            System.out.println(getFullName() + " says:\n\n" +
                    npcGreeting);
        }



    }









}
