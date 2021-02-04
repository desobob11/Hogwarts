import java.io.IOException;
import java.util.*;


public class TextVisualizer {
    private ArrayList<String> studentGreetings = new ArrayList<String>();
    private Scanner input = new Scanner(System.in);

    public ArrayList<String> getStudentGreetings() {
        return studentGreetings;
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


    //MAIN MENU---------------------------------------------------------------------------------------------------------
    
    public void displayMainMenu(Player player) {
        cls();
        System.out.println("\nYou are currently located at the " + player.getZone().getName());
        System.out.println("What would you like to do?\n\n" +
                "Options:\n\n" +
                "-Move\n" +
                "-Search\n");
    }

    public void end() {
        String end = input.nextLine();
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

    public void searchRoom(Player player) {
        cls();
        System.out.println("You look around the " + player.getZone().getName() + " and find: \n\n");
    }

    //Descriptions================================================

    public void titleScreen() {
        cls();
        System.out.println("\nWelcome to the Hogwarts Adventure Text-Based Game, authored by\n" +
                "Desmond O'Brien\n\n Please enter anything to begin");
        end();
    }

    public void describeBoatRide() {
        cls();
        System.out.println("\nIt is September 1st. You are a prospective student at Hogwarts School\n" +
                "of Witchcraft and Wizardry. You are seated in a dark mahogany canoe that is\n" +
                "slowly gliding across a motionless lake under twilight.\n" +
                "Ahead of you is a towering cliff, rising above the lake like a great bulwark.\n" +
                "Crowning the rock face is a sprawling gothic-castle adorned with battlements,\n" +
                "towers, and windows that glow with a warm yellow hue. That great structure,\n" +
                "as you well know, is Hogwarts." +
                "As pull up against the cliff face, your boats meander to a wooden dock," +
                "protruding from a cavern that appears to have been born from the rock.\n" +
                "Torchlight flickers beyond its threshold. Along with your fellow students,\n" +
                "you disembark from your boat, step foot on the wooden dock, and proceed toward\n" +
                "the cave opening");
        end();
    }

    public void describeLeavingBoat() {
        cls();
        System.out.println("\nAs pull up against the cliff face, your boats meander to a wooden dock," +
                "protruding from a cavern that appears to have been born from the rock.\n" +
                "Torchlight flickers beyond its threshold. Along with your fellow students,\n" +
                "you disembark from your boat, step foot on the wooden dock, and proceed toward\n" +
                "the cave opening. Inside, you see a professor standing atop a great stone stairway\n" +
                "that climbs steadily up, toward sounds of merrymaking and twinkling lioghts");
        end();
    }

    public void describeWelcomingStudents(NPC npc) {
        cls();
        System.out.println("\nThe professor begins to speak to you and your peers:\n\n" +
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
        end();
    }


    public void describeGreatHall() {

    }




    // PLAYER-----------------------------------------------------------------------------------------------------------

    public void initiateCreateCharacter() {
        cls();
        System.out.println("\nHello, and welcome to Hogwarts. I am going to ask you some simple questions.\n");
        end();
    }

    public void characterName() {
        cls();
        System.out.println("\nFirst, what name do you go by?\n");
    }

    public void characterGender(Player player) {
        cls();
        System.out.println("\n" + player.getName() + ", what a lovely name. Now forgive me if I am being rude but, \n" +
                "are you a boy, or a girl?");
    }

    public void characterCreationComplete(Player player) {
        cls();
        System.out.println("\nExcellent " + player.getName() + "! Now, all first years follow me to great hall.\n" +
                "We are about to begin the Sorting Ceremony\n");
        end();
    }

    public void boyOrGirlOnly() {
        cls();
        System.out.println("\nSimply boy or girl is required if you please.\n");
    }

    public void enterGreatHall(Player player) {
        cls();
        System.out.println("\nOkay first years, it is time for the sorting ceremony!\n" +
                "I'm sure most of you could use a refresher on this process.\n" +
                "If you look toward the stage, you will see a three-legged stool.\n" +
                "Each of you will take a seat on that stool, and I will place\n" +
                "the sorting hat on your head. It will then use its infinite wisdom\n" +
                "to determine which house you are destined to represent during\n" +
                "your time here at hogwarts. Let us begin!\n\n"
                 + player.getName() + ", you will be going first.");
        end();
    }

    //NPC---------------------------------------------------------------------------------------------------------------
    public void studentGreetings(Player player) {
        cls();
        String sample1 = "Hello " + player.getName() + "! How's it going? I hope\n" +
                "to see you at the Quidditch Match this week!";

        String sample2 = "Fuck off " + player.getName() + ". You're a faggot";

        String sample3 = "God I'm so fucking horny my man";
        studentGreetings.add(sample1);
        studentGreetings.add(sample2);
        studentGreetings.add(sample3);
    }

    //SORTING-----------------------------------------------------------------------------------------------------------

        public void responseToString(ArrayList<String> array) {
            for (String string: array) {
                System.out.println((array.indexOf(string) + 1) + ". " + string + "\n");
            }
        }

        public String[] firstResponse() {
            String[] responses = {"Cowardly", "Ordinary", "Ignorant", "Selfish"};
            return responses;
        }


        public String firstQuestion() {
            cls();
            String question = "Which of the following would you most hate people to call you?\n\n";
            System.out.println(question);
            System.out.println(Arrays.toString(firstResponse()) + "\n");
            return question;
        }


        public String[] secondResponse() {
            String[] responses = {"Glory", "Power", "Wisdom", "Love"};
            return responses;
        }


        public void secondQuestion() {
            cls();
            System.out.println(("Given the choice, would you rather invent a potion that would guarantee you:\n\n"));
            System.out.println(Arrays.toString(secondResponse()));
        }


        public ArrayList<String> thirdResponse() {
            ArrayList<String> aList = new ArrayList<String>();
            String[] responses = {"The foaming, frothing, silvery liquid " +
                    "that sparkles as though containing ground diamonds.",
                    "The smooth, thick, richly purple drink that gives off a delicious smell of chocolate and plums.",
                    "The golden liquid so bright that it hurts the eye, and which makes sunspots " +
                            "dance all around the room.", "The mysterious black liquid that gleams like ink, " +
                    "and gives off fumes that make you see strange visions."};
            for (String string: responses) {
                aList.add(string);
            }
            Collections.shuffle(aList);
            return aList;
        }


        public void thirdQuestion() {
            cls();
            System.out.println("Four goblets are placed before you. Which would you choose to drink?\n\n");
            responseToString(thirdResponse());
            System.out.println("1, 2, 3, or 4\n");
        }


        public ArrayList<String> fourthResponse() {
            ArrayList<String> aList = new ArrayList<String>();
            String[] responses = {"A crackling log fire", "Fresh parchment", "Home", "The Sea"};
            for (String string: responses) {
                aList.add(string);
            }
            Collections.shuffle(aList);
            return aList;
        }

        public void fourthQuestion() {
            cls();
            System.out.println("Once every century, the Flutterby bush produces flowers that adapt their scent \n" +
                    "to attract the unwary. If it lured you, it would smell of:\n\n");
            responseToString(fourthResponse());
            System.out.println("1, 2, 3, or 4\n");
        }


        public ArrayList<String> fifthResponse() {
            ArrayList<String> aList = new ArrayList<String>();
            String[] responses = {"Attempt to confuse the troll into letting all three of you pass without fighting?",
            "Suggest drawing lots to decide which of you will fight?", "Suggest that all three of you should fight" +
                    " (without telling the troll)?", "Volunteer to fight?"};
            for (String string: responses) {
                aList.add(string);
            }
            Collections.shuffle(aList);
            return aList;
        }


        public void fifthQuestion() {
            cls();
            System.out.println("You and two friends need to cross a bridge guarded by a river troll\n " +
                    "who insists on fighting one of you before he will let all of you pass. Do you:\n\n");
            responseToString(fifthResponse());
            System.out.println("1, 2, 3, or 4\n");
        }


        public ArrayList<String> sixthResponse() {
            ArrayList<String> aList = new ArrayList<String>();
            String[] responses = {"Proceed with caution, keeping one hand on your concealed wand and\n " +
                    "an eye out for any disturbance?", "Draw your wand and try to discover the source of the noise?",
            "Draw your wand and stand your ground?", "Withdraw into the shadows to await developments, while mentally\n" +
                    " reviewing the most appropriate defensive and offensive spells, should trouble occur?"};
            for (String string : responses) {
                aList.add(string);
            }
            Collections.shuffle(aList);
            return aList;
        }

        public void sixthQuestion() {
            cls();
            System.out.println("Late at night, walking alone down the street, you hear a peculiar cry \n" +
                    "that you believe to have a magical source. Do you:\n\n");
            responseToString(sixthResponse());
            System.out.println("1, 2, 3, or 4\n");
        }

        public String[] seventhResponse() {
            String[] responses = {"Drums", "Violin", "Piano", "Trumpet"};
            return responses;
        }

        public void seventhQuestion() {
            cls();
            System.out.println("What kind of instrument most pleases your ear?\n\n");
            System.out.println(Arrays.toString(seventhResponse()));
        }


        public String[] eighthResponse() {
            String[] responses = {"The Bold", "The Great", "The Wise", "The Good"};
            return responses;
        }


        public void eighthQuestion() {
            cls();
            System.out.println("How would you like to be known to history?\n\n");
            System.out.println(Arrays.toString(eighthResponse()));
        }


        public void sortingHatDecision(Player player) {
            cls();
            System.out.println("Well " + player.getName() +", you have proven to be a tricky one.\n" +
                    "Tut, tut, tut. Where to put you? I can sense the house you desire, but is it\n" +
                    "the right fit for you? Perhaps, perhaps not. I have decided.\n" +
                    player.getName() + ". You are a ...\n\n" +
                    player.getPlayerHouse().getName() + "!");
            end();
        }
    //PLAYER------------------------------------------------------------------------------------------------------------
    public void whereTo() {
        cls();
        System.out.println("Where would you like to move to?\n");
    }

    public void movePlayer(String zone) { {
        cls();
        System.out.println("You start on your way to the " + zone);
        end();
        }
    }

    public void noZoneWithThatName() {
        cls();
        System.out.println("You don't know of any area like that.\n");
        end();
    }

    public void arrival(Player player) {
        cls();
        System.out.println("\nYou have arrived at the " + player.getZone().getName());
        end();
    }

    //ERROR-------------------------------------------------------------------------------------------------------------
    public void invalidResponse() {
        System.out.println("Error, inavlid response.");
    }


    public void mustRestart() {
        System.out.println("Must restart.\n\n");
    }
}