import java.util.*;

public class Player {
	private TextVisualizer text = new TextVisualizer();
	private String name;
	private int gender;
	private String house;
	private ArrayList<Object> inventory = new ArrayList<Object>();
	private Zone location;

	public Player() {
	}

	public void setName(String playerName) {
		name = playerName;
	}

	public void setGender(int playerGender) {
		gender = playerGender;
	}

	public void setHouse(String houseName) {
		house = houseName;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public String getHouse() {
		return house;
	}

	public ArrayList<Object> getInventory() {
		return inventory;
	}

	public void setLocation(Zone zone) {
		location = zone;
	}

	public Zone getLocation() {
		return location;
	}

	public void createCharacter() {
		Scanner input = new Scanner(System.in);

		text.initiateCreateCharacter();
		text.characterName();
		String name = input.nextLine();
		setName(name);

		text.characterGender(this);
		String gender = input.nextLine();
		while (!gender.equalsIgnoreCase("boy") && !gender.equalsIgnoreCase("girl")) {
			text.boyOrGirlOnly();
			gender = input.nextLine();
		}
		if (gender.equalsIgnoreCase("boy")) {
			setGender(0);
		}
		if (gender.equalsIgnoreCase("girl")) {
			setGender(1);
		}
		text.characterCreationComplete(this);
		input.close();
	}

	public void sortHouse() {
		text.enterGreatHall(this);


	}






}
