import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		TextVisualizer text = new TextVisualizer();
		Player player = new Player();
		Application app = new Application();
		StudentFactory stufac = new StudentFactory();
		stufac.initiateStudents(9);
		System.out.println(stufac.listOfStudentNames());

		Object remembrall = new Object("Remembrall");
		Object book = new Object("Book");
		Professor ed = new Professor();
		Student tom = new Student();
		//text.studentGreetings(player);
		//stufac.getRandomNPC().greetPlayer(player, text);

		}

}
