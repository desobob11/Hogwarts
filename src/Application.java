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

    public TextVisualizer getText() {
        return text;
    }

    public void initializeObjects() throws IOException {
        fac.initiateNPCS(9);
        fac.initiateZones();
        fac.initiateHouses();

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

    public void appendCount(String userResponse, String[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(userResponse)) {
                houseList.get(i).setProcessCount(houseList.get(i).getProcessCount() + 1);
            }
        }
    }

    public void sortingCeremony() {
        int[] pointsArray = new int[4];
        Scanner input = new Scanner(System.in);

        text.firstQuestion();
        String userResponse = input.nextLine();
        appendCount(userResponse, text.firstResponse());

        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i] = getHouseList().get(i).getProcessCount();
        }
        Arrays.sort(pointsArray);
        int chosenHouse = pointsArray[3];
        for (House house: getHouseList()) {
            if (house.getProcessCount() == chosenHouse) {
                player.setHouse(house);
                text.sortingHatDecision(player);
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









}
