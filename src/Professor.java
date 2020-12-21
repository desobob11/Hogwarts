import java.io.*;
import java.util.*;


public class Professor {

    private String firstName;
    private String firstWord;
    private String lastWord;
    private String fullName;
    private String lastName;

    public void setFirstName() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text/FirstNames"));
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
        BufferedReader br = new BufferedReader(new FileReader("text/FirstWord"));
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
        BufferedReader br = new BufferedReader(new FileReader("text/LastWord"));
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
        String lastName = firstWord + lastWord;
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(lastName);




    }







}
