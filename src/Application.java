import java.io.IOException;
import java.util.*;

public class Application {
    private TextVisualizer text = new TextVisualizer();
    private Player player = new Player();
    private Factory fac = new Factory();
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Zone> zoneList = new ArrayList<Zone>();
    private ArrayList<Professor> professorList = new ArrayList<Professor>();
    private ArrayList<Integer> houseCounts = new ArrayList<Integer>();
    private ArrayList<House> houseList = new ArrayList<House>();
    private Comparator<House> houseComparator;
    private int[] pointsIntArray = {0, 0, 0, 0};

    public TextVisualizer getText() {
        return text;
    }

    public void initializeObjects() throws IOException {
        fac.initiateNPCS(9);
        fac.initiateHouses();
        fac.initiateZones();

        houseList = fac.getHouseList();
        studentList = fac.getStudentList();
        professorList = fac.getProfessorList();
        zoneList = fac.gteZoneList();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public ArrayList<Zone> getZoneList() {
        return zoneList;
    }

    public Player getPlayer() {
        return player;
    }

    public int[] getPointsIntArray() {
        return pointsIntArray;
    }

    public static void cls(){
        try {

            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public void appendCount(String userResponse, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(userResponse)) {
                houseList.get(i).setProcessCount(houseList.get(i).getProcessCount() + 1);
                return;
            }
        }
    }


    public void appendLongCount(String userResponse, ArrayList<String> array) {
        if ("".equalsIgnoreCase(userResponse)) {
            return;
        }
        else if (userResponse.charAt(0) >= 49 && userResponse.charAt(0) <= 52) {
            int userResponse3 = Integer.parseInt(userResponse) - 1;
            for (int i = 0; i < array.size(); i++) {
                if (i == userResponse3) {
                    houseList.get(i).setProcessCount(houseList.get(i).getProcessCount() + 1);
                    return;
                }
            }
        }
    }


    public void sortingCeremony() {
        int[] pointsArray = new int[4];
        Scanner input = new Scanner(System.in);

        text.firstQuestion();
        String userResponse1 = input.nextLine();
        appendCount(userResponse1, text.firstResponse());

        text.secondQuestion();
        String userResponse2 = input.nextLine();
        appendCount(userResponse2, text.secondResponse());

        text.thirdQuestion();
        String userResponse3 = input.nextLine();
        appendLongCount(userResponse3, text.thirdResponse());

        text.fourthQuestion();
        String userResponse4 = input.nextLine();
        appendLongCount(userResponse4, text.fourthResponse());

        text.fifthQuestion();
        String userResponse5 = input.nextLine();
        appendLongCount(userResponse5, text.fifthResponse());

        text.sixthQuestion();
        String userResponse6 = input.nextLine();
        appendLongCount(userResponse6, text.sixthResponse());

        text.seventhQuestion();
        String userResponse7 = input.nextLine();
        appendCount(userResponse7, text.seventhResponse());

        text.eighthQuestion();
        String userResponse8 = input.nextLine();
        appendCount(userResponse8, text.eighthResponse());

        sortingCeremonyResults(pointsArray);
    }


    public void sortingCeremonyResults(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getHouseList().get(i).getProcessCount();
        }
        Arrays.sort(array);
        int chosenHouse = array[3];
        for (House house : getHouseList()) {
            if (house.getProcessCount() == chosenHouse) {
                player.setHouse(house);
                text.sortingHatDecision(player);
                return;
            }
        }
    }



    public void discreteMovePlayer(String string) {
        for (Zone zone: getZoneList()) {
            if (zone.getName().equalsIgnoreCase(string)) {
                player.setZone(zone);
            }
        }
    }

    public NPC getRandomNPC(String type) {
        Random ran = new Random();
        if ("student".equalsIgnoreCase(type)) {
            int index = ran.nextInt(getStudentList().size() - 1);
            return getStudentList().get(index);
        }
        else if ("prof".equalsIgnoreCase(type)) {
            int index = ran.nextInt(getProfessorList().size() - 1);
            return getProfessorList().get(index);
        }
        return new NPC();
    }

    public Zone getZone(String string) {
        for (Zone zone: zoneList) {
            if(zone.getName().equalsIgnoreCase(string)) {
                return zone;
            }
        }
        return null;
    }

    public void movePlayer() {
        Scanner input = new Scanner(System.in);
        text.whereTo();
        String desiredZone = input.nextLine();
        for (Zone zone: zoneList) {
            if (zone.getName().equalsIgnoreCase(desiredZone)) {
                player.setZone(zone);
                text.movePlayer(zone.getName());
                return;
            }
        }
        text.noZoneWithThatName();
        movePlayer();
    }

    public void beginGame() throws IOException {
        initializeObjects();
        text.titleScreen();
        player.createCharacter();
        text.describeBoatRide();
        text.describeLeavingBoat();
        text.describeWelcomingStudents(getRandomNPC("prof"));
        text.describeGreatHall();
        sortingCeremony();

    }







}
