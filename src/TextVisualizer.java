
public class TextVisualizer {

    //ZONE--------------------------------------------------------------------------------------------------------------
    public void searchContents() {
        System.out.println("You begin searching the area. What are you looking for?\n'quit' to stop searching.");
    }

    public void contentsAreEmpty() {
        System.out.println("You find nothing of use in this room. \n");
    }

    public void foundItem(String string) {
        System.out.println("You found a " + string + ". \n");
    }

    public void itemNotInZone() {
        System.out.println("You don't find that item. \n");
    }

    public void quitSearching() {
        System.out.println("You quit your search in this area.\n");
    }


    // PLAYER-----------------------------------------------------------------------------------------------------------

    public void initiateCreateCharacter() {
        System.out.println("Hello, and welcome to Hogwarts. I am going to ask you some simple quesitons.\n");
    }

    public void characterName() {
        System.out.println("First, what name do you go by?\n");
    }

    public void characterGender(Player player) {
        System.out.println(player.getName() + ", what a lovely name. Now forgive me if I am being rude but, \n" +
                "are you a boy, or a girl?");
    }

    public void characterCreationComplete(Player player) {
        System.out.println("Excellent " + player.getName() + "! Now, all first years follow me to great hall.\n" +
                "We are about to begin the Sorting Ceremony\n");
    }

    public void boyOrGirlOnly() {
        System.out.println("Simply boy or girl is required if you please.\n");
    }
}