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
                "full of peers eager to welcome you into those hallowed halls.");
    }

    public void describeLeavingBoat() {
        System.out.println("The fleet of boats meanders toward\n" +
                "a small dock at the base of the cliff. You and your\n" +
                "peers disembark onto the dock and walk toward a stone entrance\n" +
                "carved into the cliff face. The entrance is braced with two grand pillars, \n" +
                "each adorned with a flaming torch-sconce.\n\n" +
                "As pass through the threshold single-file, find yourself in a\n" +
                "small chamber, filled with flickering torchlight. Granite walls\n" +
                "surround you, and a marble staircase stands before you.\n" +
                "Atop, you see a peculiar looking individual, tall, stooping, and adorned with a pointy.\n" +
                "You discern that they must be a professor. As the line of students ascends\n" +
                "the stairs, the professor raises their hand, motioning you all to stop.\n" +
                "Naturally, you do."
        );
    }

    public void describeWelcomingStudents(NPC npc) {
        System.out.println("The professor begins to speak to you and your peers:\n\n" +
                "Hello First-Years, and welcome to Hogwarts School of Witchcraft and Wizardry." +
                "I am " + npc.getTitle() + ". We are currently standing in the boathouse\n" +
                "I know you are all very excited to explore the castle, but there are some procedures\n" +
                "that must be undertaken. Please follow me double-file toward the foyer.\n\n" +
                "**You and your peers follow the professor up the stairs. Torches adorning the walls ignite \n" +
                "as you pass them. Reaching the top of the stairs, you find yourself in a sort of great foyer.\n" +
                "The gothic-style chamber is alight with magical orbs, candles, and torches.\n" +
                "To your left is a grand staircase, leading to a massive corridor with separate hallways\n" +
                "branching from it. Ahead of you is a giant set of oaken doors, you see the Hogwarts\n" +
                "crest carved into them. That must be the main entrance. To your right is another set of\n" +
                "giant wooden doors, although you there are a great many people behind it. Peering through\n" +
                "a crack in the threshold, you see the Great Hall. Thousands of candles float\n" +
                "above the heads of thousands of Hogwarts Students. Four great tables run the length of the room.\n" +
                "The ceiling appears to be enchanted, it reflects the star-lit sky outside.\n" +
                "At the far-end of the room, you see a great stage where the professors ar seated.\n" +
                "They inhabit a great long-table, with the Headmaster occupying the middle seat.\n" +
                "Seeing your cohort entering, he stands and begins to speak at the golden owl-like\n" +
                "lectern at the center of the stage.");

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

    //SORTING-----------------------------------------------------------------------------------------------------------
        public void firstQuestion() {
            System.out.println("Which of the following would you most hate people to call you?\n");
            String[] responses = {"Cowardly", "Ordinary",
                    "Ignorant", "Selfish"};
            String toString = "";
            for (String string: responses) {
                toString += string + "\n";
            }
            System.out.println(toString);
    }

        public String[] firstResponse() {
            String[] responses = {"Cowardly", "Ordinary",
                    "Ignorant", "Selfish"};
            return responses;
        }

        public void sortingHatDecision(Player player) {
            System.out.println("Well " + player.getName() +", you have proven to be a tricky one.\n" +
                    "Tut, tut, tut. Where to put you? I can sense the house you desire, but is it\n" +
                    "the right fit for you? Perhaps, perhaps not. I have decided.\n" +
                    player.getName() + ". You are a ...\n\n" +
                    player.getPlayerHouse().getName() + "!");
        }
    //PLAYER------------------------------------------------------------------------------------------------------------
    public void whereTo() {
        System.out.println("Where would you like to move to?\n");
    }

    public void movePlayer(String zone) { {
            System.out.println("You start on your way to the " + zone);
        }
    }

    public void noZoneWithThatName() {
        System.out.println("You don't know of any area like that.\n");
    }

}