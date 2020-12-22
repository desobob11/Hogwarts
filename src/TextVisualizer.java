import java.io.*;
import java.util.*;


public class TextVisualizer {
    private ArrayList<String> studentGreetings = new ArrayList<String>();

    public ArrayList<String> getStudentGreetings() {
        return studentGreetings;
    }


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

    //Descriptions================================================
    public void describeBoatRide() {
        System.out.println("You can't believe it; September 1st is finally here!\n" +
                "It is late in the evening. The sun has set and the full moon is\n" +
                "high above the clouds.\n" +
                "You are on your way to Hogwarts, School of Witchcraft and Wizardry.\n" +
                "You received a letter notifying you of you admission on your 11th birthday.\n" +
                "Discovering your magical abilities was shocking enough to you,\n" +
                "but you are absolutely stunned at the prospect of attending\n" +
                "a school to educate you on magic!\n\n" +
                "You are drifting across a sprawling lake, in a small boat\n" +
                "filled with fellow prospective students.\n" +
                "A lantern at the stern of your boat lights the way ahead of you.\n" +
                "Up ahead, atop a towering cliff, you see Hogwarts.\n" +
                "An imposing castle, dotted with towers, battlements, bright windows,\n" +
                "and smoking chimneys. In clear view, you see the Great Hall, \n" +
                "full of peers eager to welcome you into those magical halls.");
    }

    public void describeLeavingBoat() {
        System.out.println("");
    }

    public void describeGreatHall() {

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

    public void enterGreatHall(Player player) {
        System.out.println("Okay first years, it is time for the sorting ceremony!\n" +
                "I'm sure most of you could use a refresher on this process.\n" +
                "If you look toward the stage, you will see a three-legged stool.\n" +
                "Each of you will take a seat on that stool, and I will place\n" +
                "the sorting hat on your head. It will then use its infinite wisdom\n" +
                "to determine which house you are destined to represent during\n" +
                "your time here at hogwarts. Let us begin!\n\n"
                 + player.getName() + ", you will be going first.");
    }

    //NPC---------------------------------------------------------------------------------------------------------------
    public void studentGreetings(Player player) {
        String sample1 = "Hello " + player.getName() + "! How's it going? I hope\n" +
                "to see you at the Quidditch Match this week!";

        String sample2 = "Fuck off " + player.getName() + ". You're a faggot";

        String sample3 = "God I'm so fucking horny my man";
        studentGreetings.add(sample1);
        studentGreetings.add(sample2);
        studentGreetings.add(sample3);
    }





}