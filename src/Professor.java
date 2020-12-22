import java.io.*;
import java.util.*;


public class Professor {

    private String firstName;
    private String firstWord;
    private String lastWord;
    private String fullName;
    private String lastName;
    private String title;
    private int gender;

    public void setGender() {
        Random ran = new Random();
        gender = ran.nextInt(2);
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
        BufferedReader br = new BufferedReader(new FileReader("text/FirstNames.txt"));
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

    public void createName() throws IOException {
        setFirstName();
        setFirstWord();
        setLastWord();
        String stringLastName = getFirstWord() + getLastWord();
        String stringFullName = getFirstName() + " " + stringLastName;
        lastName = stringLastName;
        fullName = stringFullName;
        title = "Professor " + getLastName();
    }







}
