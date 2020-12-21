import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Player player = new Player();
		Application app = new Application();
		Object remembrall = new Object("Remembrall");
		Object book = new Object("Book");
		Professor ed = new Professor();

		Zone shed = new Zone("Shed", remembrall);
		Zone library = new Zone("Library", book);
		//player.createCharacter();
		ed.createName();

	}

}
