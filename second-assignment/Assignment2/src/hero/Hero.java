package hero;


// for dictionary

import soundEffect.SoundEffect;
import storyLine.Storyline;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// for a dialog box


public class Hero extends Storyline{

    SoundEffect backgroundMusic = new SoundEffect();
    Scanner user_input = new Scanner(System.in);
//    contains the players name and points


    public void setMembers(Map<String, Map<String, Integer>> members) {
        Members = members;
    }

    Map<String, Map<String, Integer>> Members = new HashMap<>();

    public Map<String, Map<String, Integer>> getMembers() {
        return Members;
    }


    Map<String, Integer> playerTool = new HashMap<>();

    public Map<String, Integer> getTreasures() {
        return Treasures;
    }

//    public void setTreasures(Map<String, Integer> treasures) {
//        Treasures = treasures;
//    }

    Map<String, Integer> Treasures = new HashMap<>();
    Map<String, Integer> initialTreasure = new HashMap<>();

    Map<String, Integer> playerTreasures = new HashMap<>();

    public Map<String, Map<String, Integer>> getTreasureBox() {
        return TreasureBox;
    }

    Map<String, Map<String, Integer>> TreasureBox = new HashMap<>();

    int fightingPoints = 0;
    int experiencePoint = 0;
    int weaponsPoints = 0;
    int bonusPoints = 5;


    // deal with text display
    private static void printWithDelay(String text, int delay) {
        System.out.println(text);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
            System.err.println("Interrupted: " + e.getMessage());
        }
    }



    // displays welcome message and players tools
    public void newPlayerItems(String playerName) {

        //  add the background music
        backgroundMusic.playSound("2.wav");


        // populating the treasure dictionary
        Treasures.put("Gold", 50);
        Treasures.put("Silver", 100);
        Treasures.put("Diamond", 150);

        // Get the number of treasures for the player
        int numberOfTreasures = TreasureBox.containsKey(playerName)
                ? TreasureBox.get(playerName).size()
                : 0;

        // check if the user is new or not
        if (Members.containsKey(playerName)) {

            // Get the players tools
            Map<String, Integer> playersTools = Members.get(playerName);
            int FP = playersTools.get(fightingPoints);
            int EP = playersTools.get(experiencePoint);
            int W = playersTools.get(weaponsPoints);


            // Get the number of treasures for the player

            String[] toolSections = {
                    " ",
                    "Welcome back, lets have another experience",
            };


            String[] tool2Sections = {
                    " ",
                    " ------------------------------------------- ",
                    " Below are the tools you have ",
                    " ------------------------------------------- ",
                    "Fighting Points : " + FP ,
                    "Experience Points : " + EP ,
                    "Weapon Points : " + W ,
                    "Number of treasures : " + numberOfTreasures ,
                    "--------------------------------------------",
                    " ",


            };


            // Loop through each section
            for (String section : toolSections ) {
                printWithDelay(section, 200); // Print section with a 2-second delay
            }

            for (String section2 : tool2Sections ) {
                printWithDelay(section2, 2000); // Print section with a 2-second delay
            }


        }





        String[] knownToolSections = {
                " _____________________________________________ ",
                    playerName + ", Welcome to Hero Adventure",

        };

        String[] knownTool2Sections = {
                " ______________________________________________ ",
                " These are your game starter tools/items ",
                " Fighting Points : " + fightingPoints ,
                " Experience Points : " + experiencePoint ,
                " Weapon Points : " + weaponsPoints ,
                " Number of treasures : "+ numberOfTreasures ,
                " ----------------------------------------------- "

        };

        // Get entry bonus
        fightingPoints += (int) (fightingPoints + bonusPoints);
        experiencePoint += (int) (experiencePoint + bonusPoints);
        weaponsPoints += (int) (weaponsPoints + bonusPoints);


        String[] knownTool3Sections = {
                " ________________________________________________ ",
                " After adding entry bonus, below are your items ",
                " Fighting Points + 5 points : " + fightingPoints,
                " Experience Points + 5 points : " + experiencePoint  ,
                " Weapon Points + 5 points : " + weaponsPoints ,
                " Number of treasures : " + numberOfTreasures ,
                " ------------------------------------------------- "

        };


        // Loop through each section
        for (String section : knownToolSections ) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }

        for (String section2 : knownTool2Sections ) {
            printWithDelay(section2, 2000); // Print section with a 2-second delay
        }

        for (String section3 : knownTool3Sections ) {
            printWithDelay(section3, 2000); // Print section with a 2-second delay
        }

        // save the values for the user and username

        playerTool.put("Fighting Points", fightingPoints);
        playerTool.put("Experience Points", experiencePoint);
        playerTool.put("Weapon Points", weaponsPoints);
        Members.put(playerName, playerTool);
        initialTreasure.put("null", 0);
        TreasureBox.put(playerName, initialTreasure);

//        backgroundMusic.stopSound();
        // stop the music 2
        backgroundMusic.stopSound("2.wav");
    }



    // Player moves
    public String moveStart(String move, String name) {
        backgroundMusic.stopSound("3.wav");


        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        String begin = "";
        if (move.equals("S")){

            backgroundMusic.playSound("4.wav");
            StartMoveStory();
            begin = user_input.nextLine().toUpperCase();

            backgroundMusic.stopSound("4.wav");
        }

        else if(move.equals("N")) {
            backgroundMusic.playSound("5.wav");

            NMoveStory();

            backgroundMusic.stopSound("5.wav");

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));


            backgroundMusic.playSound("6.wav");

            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",

            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }



            System.exit(0);

        }

        return begin;
    }



    public String moveLibraryAndPortraitHall(String move, String playerName) {
        String libPort = "";
        if (move.equals("L")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("7.wav");

            LibaryMoveStory();

            //  get players experience point
            int player_point = getMembers().get(playerName).get("Experience Points");

            // add experience point in player tools
            playerTool.put("Experience Points", (player_point + 10));

            // add player tools to the players box
            Members.put(playerName,playerTool );

            libPort = user_input.nextLine().toUpperCase();

        }

        else if (move.equals("P")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("8.wav");

            PortraitHallMoveStory();
            libPort = user_input.nextLine().toUpperCase();
        }

        return libPort;

    }


    public String moveChamberAndRush(String move) {
        String chamRush = "";

        if (move.equals("C")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("9.wav");

            ChamberMoveStory();
            chamRush = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("R")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("10.wav");

            RushMoveStory();

            chamRush = user_input.nextLine().toUpperCase();
        }

        return chamRush;

    }


    public String moveEngageAndProceed(String move, String playerName) {
        String engPro = "";
        if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("11.wav");

            EngageMoveStory();

            // populate the players treasure box with its the players treasure

            int player_Treasure = getTreasures().get("Gold");
            playerTreasures.put("Gold",player_Treasure);

            // add gold point to player treasure box tools
            TreasureBox.put(playerName, playerTreasures);




            engPro = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("P")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("12.wav");

            ProceedMoveStory();
            engPro = user_input.nextLine().toUpperCase();
        }


        return engPro;

    }





    public String moveMysteriousAndSearch(String move, String name) {
        String mesSear = "";

        Map<String, Integer> playersToolss = Members.get(name);

//        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("M")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("13.wav");

            mysteriousMoveStory();

            // subtract 5 from weapon points
            //  get the players weapon point
            int playerWeaponPoint = playersToolss.get("Weapon Points");

            // subtract 5 form the current weapon point
            int totalPoint = playerWeaponPoint - 5 ;

            // save the current changes
            playerTool.put("Weapon Points", totalPoint );

            mesSear = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("B")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("14.wav");

            SearchMoveStory();

            // add 5 fighting points and 10 experience points
            //  get the players weapon point
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // subtract 5 form the current weapon point
            int totalFPoint = playerFightingPoint + 5 ;
            int totalEPoint = playerExperiencePoint + 10 ;

            // save the current changes
            playerTool.put("Fighting Points", totalFPoint );
            playerTool.put("Experience Points", totalEPoint );

            mesSear = user_input.nextLine().toUpperCase();
        }



        return mesSear;
    }



    public String moveMysterious2AndSearch2(String move, String name) {
        String mesSear = "";
        Map<String, Integer> playersToolss = Members.get(name);

//        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("P")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("15.wav");

            Mysterious2MoveStory();

            // 10 experience points and weapon points.
            //  get the players weapon and experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponPoint = playersToolss.get("Weapon Points");

            // subtract add points and treasure
            int totalWeaponPoint = playerWeaponPoint + 10 ;
            int totalExperiencePoint = playerExperiencePoint + 10 ;

            // save the current changes
            playerTool.put("Weapon Points", totalWeaponPoint );
            playerTool.put("Experience Points", totalExperiencePoint );


            mesSear = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("S")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("16.wav");

            Search2MoveStory();

            // 5 experience points
            //  get the players weapon and experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");


            // subtract add points and treasure
            int totalExperiencePoint = playerExperiencePoint + 5 ;

            // save the current changes
            playerTool.put("Experience Points", totalExperiencePoint );

            mesSear = user_input.nextLine().toUpperCase();
        }


    return  mesSear ;

    }




    public String moveExpress2AndEagerly2(String move ,String playerName) {
        String expEag = "";

        if (move.equals("H")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("17.wav");

            expressMoveStory("expressSections1");
            String options = user_input.nextLine().toUpperCase();

            if (options.equals("R")){
                System.out.println("Below are your treasures: ");
                System.out.println("---------------------------");
                getTreasureBox().get(playerName);

                System.out.println("Player Treasure" + getTreasureBox().get(playerName));
                System.out.println("We would use the smallest treasure to heal you ");

                // Get the inner map for the player
                Map<String, Integer> playerMap = TreasureBox.get(playerName);

                // Find the smallest value in the inner map
                int min = Integer.MAX_VALUE;
                String minKey = null;

                for (Map.Entry<String, Integer> entry : playerMap.entrySet()) {
                    if (entry.getValue() < min) {
                        min = entry.getValue();
                        minKey = entry.getKey();
                    }
                }

                // Remove the entry with the smallest value
                if (minKey != null) {
                    playerMap.remove(minKey);
                }



                String treasures = playerMap.toString();

                System.out.println(" ");
                System.out.println("current treasure :" + treasures );



            }
            else if (options.equals("0")) {
                System.out.println("yes");
                System.out.println("Ok then, lets move on");
            }


            Storyline.expressMoveStory("expressSections2");
            expEag = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("18.wav");

            eagerlyMoveStory();
            expEag = user_input.nextLine().toUpperCase();
        }

        return expEag;
    }




    public String moveFightAndRetreat(String move, String name) {
        String expEag = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("F")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("26.wav");

            FightMoveStory();

            // remove all the fighting points
            playersToolss.put("Fighting Points", (playersToolss.get("Fighting Points") - playersToolss.get("Fighting Points")) );


            // add 15 experience points
            int playerExperience = playersToolss.get("Experience Points");

            int totalExperiencePoint = playerExperience + 15;

            // save additions
            playerTool.put("Experience Points", totalExperiencePoint);

            expEag = user_input.nextLine().toUpperCase();

            backgroundMusic.stopSound("26.wav");
        }

        else if (move.equals("R")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("27.wav");

            RetreatMoveStory();

            // add 15 experience points and one gold treasure

            // get experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // get gold treasure
            int playerTreasure1 = getTreasures().get("Gold");

            // add players treasures to his account
            int totalPlayerExperiencePoint = playerExperiencePoint + 15;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold", playerTreasure1);
            }
            else{
                playerTreasures.put("Gold", playerTreasures.get("Gold") + playerTreasure1);


            }

            // save the players achievements

            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            TreasureBox.put(name, playerTreasures);

            backgroundMusic.stopSound("27.wav");

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));


            backgroundMusic.playSound("6.wav");

            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }


            System.exit(0);
        }


    return expEag;

    }






    public String moveNegotiateAndConfront(String move, String name) {
        String NesCon = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("N")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("48.wav");

            NegotiateMoveStory();

            // 15 experience point and 5 weapons points

            //  get the players weapon point
            int playerWeaponPoint = playersToolss.get("Weapon Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // subtract 5 form the current weapon point
            int totalWPoint = playerWeaponPoint + 5 ;
            int totalEPoint = playerExperiencePoint + 15 ;

            // save the current changes
            playerTool.put("Weapon Points", totalWPoint );
            playerTool.put("Experience Points", totalEPoint );

            NesCon = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("C")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("49.wav");

            // remove all points

            playersToolss.put("Fighting Points", (playersToolss.get("Fighting Points") - playersToolss.get("Fighting Points")) );
            playersToolss.put("Experience Points", (playersToolss.get("Experience Points") - playersToolss.get("Experience Points")) );
            playersToolss.put("Weapon Points", (playersToolss.get("Weapon Points") - playersToolss.get("Weapon Points")) );

            // 15 experience points

            //  get the players experience point

            int playerExperiencePoint = playersToolss.get("Experience Points");

            // subtract 5 form the current weapon point

            int totalEPoint = playerExperiencePoint + 15 ;

            // save the current changes

            playerTool.put("Experience Points", totalEPoint );
            Storyline.confrontMoveStory();
            NesCon = user_input.nextLine().toUpperCase();
        }

    return NesCon;

    }



    public String moveTakeAndLeave(String move, String name) {
        String TakLea = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("T")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("41.wav");

            TakeStory();

            // added 20 fighting points, 15 experience point and 10 weapon point to your already existing points and a silver treasure.
            // get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");

//            get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Silver");


//            add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 20;
            int totalPlayerExperiencePoint = playerExperiencePoint + 15;
            int totalPlayerWeaponsPoint = playerWeaponsPoint + 10;

            if (playerTreasures.containsKey("null")){
                    playerTreasures.remove("null");
                    playerTreasures.put("Silver",playerTreasure1 );
            }
            else{

                playerTreasures.put("Silver",playerTreasures.get("Silver") + playerTreasure1 );


            }


//            save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points",totalPlayerWeaponsPoint );
            TreasureBox.put(name, playerTreasures);


            TakLea = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("L")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("42.wav");

            LeaveStory();

            // 20 experience points and a gold and silver treasure

            // get the player points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            //  get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Silver");
            int playerTreasure2 = getTreasures().get("Gold");

            //            add additional points to the current points and add treasure
            int totalPlayerExperiencePoint = playerExperiencePoint + 20;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Silver", playerTreasure1);
                playerTreasures.put("Gold", playerTreasure2);

            }
            else{
                playerTreasures.put("Silver",playerTreasures.get("Silver") + playerTreasure1);
                playerTreasures.put("Gold",playerTreasures.get("Gold") + playerTreasure2 );
            }

            //  save the fighting point
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            TreasureBox.put(name, playerTreasures);

            TakLea = user_input.nextLine().toUpperCase();
        }

    return TakLea;

    }




    public String moveNegotiate2AndConfront2(String move, String name) {
        String NegCon = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("N")){
            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("36.wav");

            NegotiateMoveStory2();
            NegCon = user_input.nextLine().toUpperCase();

            backgroundMusic.stopSound("36.wav");
        }

        else if (move.equals("C")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("37.wav");

            ConfrontMoveStory2();

            // remove all fighting and weapon points
            playersToolss.put("Fighting Points", (playersToolss.get("Fighting Points") - playersToolss.get("Fighting Points")) );
            playersToolss.put("Weapon Points", (playersToolss.get("Weapon Points") - playersToolss.get("Weapon Points")) );


            // 20 points each for all the available points and 1 silver

            // get all player points
            int playerFightingPoints = playersToolss.get("Fighting Points");
            int playerWeaponsPoints = playersToolss.get("Weapon Points");
            int playerExperiencePoints = playersToolss.get("Experience Points");


            // get silver treasure points
            int playerTreasure1 = getTreasures().get("Silver");

            // add points to players points
            int totalPlayerFightingPoint = playerFightingPoints + 20;
            int totalPlayerWeaponsPoint = playerWeaponsPoints + 20;
            int totalPlayerExperiencePoint = playerExperiencePoints + 20;


            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Silver", playerTreasure1 );
            }
            else{
                playerTreasures.put("Silver", playerTreasures.get("Silver") + playerTreasure1 );


            }


            // save the fighting point
            playerTool.put("Fighting Points", totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points", totalPlayerWeaponsPoint );
            TreasureBox.put(name, playerTreasures);

            backgroundMusic.stopSound("37.wav");

            //  display all your achievements

            // display the total number of points the user got at the end of the game

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();


            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));


            backgroundMusic.playSound("6.wav");
            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }


            System.exit(0);
        }



    return NegCon;
    }




    public String moveTake2AndLeave2(String move, String name) {
        String TakLea = "";

        Map<String, Integer> playersToolss = Members.get(name);

        if (move.equals("T")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("32.wav");

            TakeMove2Story();

            TakLea = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("L")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("33.wav");

            LeaveMove2Story();

            // add 40 experience points

            // get the player points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // add additional points to the current points and add treasure
            int totalPlayerExperiencePoint = playerExperiencePoint + 40;


            // save the fighting point
            playerTool.put("Experience Points",totalPlayerExperiencePoint );

            backgroundMusic.stopSound("33.wav");

            // display achievements

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));



            backgroundMusic.playSound("6.wav");

            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }


            System.exit(0);
        }



    return TakLea;
    }



    public String moveYesAndNo(String move, String name) {
        String YesNo = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("Y")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("22.wav");

            YesMoveStory() ;

            // add 10 points to fighting points

            // get player fighting points and add 10 to it
            int playerfightingPoint = playersToolss.get("Fighting Points");
           int totalplayerfightingPoint = playerfightingPoint + 10;

            // save the fighting point
            playerTool.put("Fighting Points",totalplayerfightingPoint);

            String playerfightingPointString = String.valueOf(playersToolss.get("Fighting Points"));
            System.out.println("Fighting points gained : " + playerfightingPointString );

            System.out.println( "Enter your choice (P/E): ");
            YesNo = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("N")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("23.wav");

            NoMoveStory();

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            backgroundMusic.stopSound("23.wav");

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));



            backgroundMusic.playSound("6.wav");

            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }

            // display the number of points the user got at the end of the game
            System.exit(0);


        }



    return YesNo;
    }



    public String moveForwardAndRetreat(String move, String name) {
        String ForRet = "";

        //  display the remaining treasures you had after the story
        Map<String, Integer> playersToolss = Members.get(name);

        // Get the number of treasures for the player

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("F")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("20.wav");

            ForwardMoveStory() ;

            backgroundMusic.stopSound("20.wav");

        }

        else if (move.equals("R")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("21.wav");

            RetreatingMoveStory();

            backgroundMusic.stopSound("21.wav");

        }

        // Convert the inner map to String (or process it as needed)
        String treasuresAsString = playerTreasures.toString();


        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));



        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsString

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }


        System.exit(0);

        return ForRet;

    }




    public String moveContinueAndExit(String move, String name) {
        String ConExi = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("C")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("28.wav");

            ContinueMoveStory() ;

            ConExi = user_input.nextLine().toUpperCase();
        }

        else if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("29.wav");

            ExitMoveStory3();

            backgroundMusic.stopSound("29.wav");

            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));



            backgroundMusic.playSound("6.wav");

            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }


            System.exit(0);
        }



return ConExi;
    }





    public String moveAcceptAndDelve(String move, String name) {
        String AccDel = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("A")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("52.wav");
            AcceptStory() ;


            // 2 golden treasures and 1 silver treasure.

            // get gold treasure
            int playerTreasure1 = getTreasures().get("Gold");
            int playerTreasure2 = getTreasures().get("Silver");

            // add players treasures to his account
            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold", playerTreasure1);
                playerTreasures.put("Gold", playerTreasures.get("Gold") + playerTreasure1);
                playerTreasures.put("Silver", playerTreasure2);
            }
            else{
                playerTreasures.put("Gold", playerTreasures.get("Gold" )+ playerTreasure1);
                playerTreasures.put("Gold", playerTreasures.get("Gold") + playerTreasure1);
                playerTreasures.put("Silver", playerTreasures.get("Silver") + playerTreasure2);


            }

            // save the players achievements
            TreasureBox.put(name, playerTreasures);

            backgroundMusic.stopSound("52.wav");
            // display the users gain



            // Convert the inner map to String (or process it as needed)
            String treasuresAsStrings = playerTreasures.toString();

            // Return the string representation of the treasures

            String FPString = String.valueOf(playersToolss.get("Fighting Points"));

            String EPString = String.valueOf(playersToolss.get("Experience Points"));

            String WPString = String.valueOf(playersToolss.get("Weapon Points"));


            backgroundMusic.playSound("6.wav");
            String[] nSections = {
                    " Achievements ",
                    "----------------------------------",


            };

            String[] n2Sections = {

                    "Fighting points : " + FPString,
                    "Experience points : " + EPString,
                    "Weapon points : " + WPString,
                    "Treasures : " + treasuresAsStrings

            };

            // Loop through each section
            for (String section : nSections ) {
                printWithDelay(section, 1200); // Print section with a 2-second delay
            }

            // Loop through each section
            for (String section : n2Sections ) {
                printWithDelay(section, 20); // Print section with a 2-second delay
            }


            System.exit(0);
        }

        else if (move.equals("D")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("53.wav");

            DelveMoveStory();

            // 50 experience points
            // get experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");


            //  get diamond treasure
            int playerTreasure1 = getTreasures().get("Diamond");

            // add players treasures to his account
            int totalPlayerExperiencePoint = playerExperiencePoint + 50;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Diamond", playerTreasure1);
            }
            else{
                playerTreasures.put("Diamond", playerTreasures.get("Diamond") + playerTreasure1);


            }

            // save the players achievements

            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            TreasureBox.put(name, playerTreasures);


            AccDel = user_input.nextLine().toUpperCase();

        }

    return AccDel;

    }






    public String moveTreasureAndExplore(String move, String name) {
        String ForRet = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("T")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("50.wav");

            TreasureMoveStory();

            // which is a golden and diamond treasure

            // get gold treasure
            int playerTreasure1 = getTreasures().get("Gold");
            int playerTreasure2 = getTreasures().get("Diamond");

            // add players treasures to his account
            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold", playerTreasure1);
                playerTreasures.put("Diamond", playerTreasure2);
            }
            else{
                playerTreasures.put("Gold", playerTreasures.get("Gold") + playerTreasure1);
                playerTreasures.put("Diamond", playerTreasures.get("Diamond") + playerTreasure2);


            }

            // save the players achievements
            TreasureBox.put(name, playerTreasures);

            backgroundMusic.stopSound("50.wav");

        }

        else if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("51.wav");

            ExploreMoveStory();

            // 40 Experience points

            // get experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // add players treasures to his account
            int totalPlayerExperiencePoint = playerExperiencePoint + 40;

            // save the players
            playerTool.put("Experience Points",totalPlayerExperiencePoint );


            backgroundMusic.stopSound("51.wav");
        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }

        System.exit(0);


    return ForRet;
    }


    public String moveFreeAndKeep(String move, String name) {
        String freKre = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("F")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("45.wav");

            FreeMoveStory();

            // add 50 experience points

            //  get the players weapon and experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // subtract add points and treasure
            int totalExperiencePoint = playerExperiencePoint + 50 ;

            // save the current changes
            playerTool.put("Experience Points", totalExperiencePoint );

            freKre= user_input.nextLine().toUpperCase();
        }

        else if (move.equals("K")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("46.wav");

            KeepMoveStory();

            // remove all treasures

            playerTreasures.clear();
            freKre = user_input.nextLine().toUpperCase();
        }


    return freKre;
    }





    public String moveExitAndReconsider(String move, String name) {
        String exiRec = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("43.wav");

            ExitMoveStory1();

            backgroundMusic.stopSound("43.wav");



        }

        else if (move.equals("R")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("44.wav");

            ReconsiderMoveStory1();

            // 20 fighting points , silver and gold treasure ,10 experience points and 5 weapon points

            // get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");


            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Gold");
            int playerTreasure2 = getTreasures().get("Silver");


            // add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 20;
            int totalPlayerExperiencePoint = playerExperiencePoint + 10;
            int totalPlayerWeaponsPoint = playerWeaponsPoint + 5;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold",playerTreasure1);
                playerTreasures.put("Silver",playerTreasure2);
            }
            else{
                playerTreasures.put("Gold",getTreasures().get("Gold") + playerTreasure1 );
                playerTreasures.put("Silver",getTreasures().get("Silver") + playerTreasure2 );

            }



            // save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points",totalPlayerWeaponsPoint );
            playerTreasures.clear();
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("44.wav");
            // display the total number of points the user got at the end of the game

        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();


        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }


        System.exit(0);


        return exiRec;
    }





    public String moveAcientJewelAndGolden(String move , String name) {
        String acieJewGol = "";


        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);


        if (move.equals("A")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("38.wav");


            AcientMoveStory();

            // 50 each of all the points and a silver treasure.

            // get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");


            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Silver");

            // add additional points to the current points and add treasure
            int totalplayerfightingPoint = playerFightingPoint + 50;
            int totalplayerexperiencePoint = playerExperiencePoint + 50;
            int totalplayerweaponsPoint = playerWeaponsPoint + 50;


            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Silver",playerTreasure1 );
            }
            else{
                playerTreasures.put("Silver",playerTreasures.get("Silver") + playerTreasure1 );


            }



            // save the fighting point
            playerTool.put("Fighting Points",totalplayerfightingPoint );
            playerTool.put("Experience Points",totalplayerexperiencePoint );
            playerTool.put("Weapon Points",totalplayerweaponsPoint );
            TreasureBox.put(name, playerTreasures);

            backgroundMusic.stopSound("38.wav");


        }

        else if (move.equals("J")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("39.wav");

            jeweledMoveStory();

            // add 30 experience point  and five fighting points.

            // get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 5;
            int totalPlayerExperiencePoint = playerExperiencePoint + 30;


            // save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );


            backgroundMusic.stopSound("39.wav");
        }

        else if (move.equals("G")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("40.wav");

            goldenMoveStory();

            // 30 points each of all the points and one golden treasure.


            //  get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");



            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Gold");


            // add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 30;
            int totalPlayerExperiencePoint = playerExperiencePoint + 30;
            int totalPlayerWeaponsPoint = playerWeaponsPoint + 30;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold",playerTreasure1 );
            }
            else{
                playerTreasures.put("Gold",playerTreasures.get("Gold") + playerTreasure1 );


            }



            //  save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points",totalPlayerWeaponsPoint );
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("40.wav");
        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }



        System.exit(0);

    return acieJewGol;

    }





    public String moveAssertAndRelease(String move, String name) {
        String asseRel = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("A")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("34.wav");

            AssertMoveStory();

            // 20 experience points, 10 weapon point, 10 fighting point and a silver treasure

            // get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");



            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Silver");


            //  add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 10;
            int totalPlayerExperiencePoint = playerExperiencePoint + 20;
            int totalPlayerWeaponsPoint = playerWeaponsPoint + 10;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Silver",playerTreasure1 );
            }
            else{
                playerTreasures.put("Silver",playerTreasures.get("Silver") + playerTreasure1 );


            }



            //  save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points",totalPlayerWeaponsPoint );
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("34.wav");
            // display the total number of points the user got at the end of the game

        }

        else if (move.equals("R")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("35.wav");

            ReleaseMoveStory();

            // a gold treasure, 5 fighting, experience nad weapon points.


            //            get the player points
            int playerFightingPoint = playersToolss.get("Fighting Points");
            int playerExperiencePoint = playersToolss.get("Experience Points");
            int playerWeaponsPoint = playersToolss.get("Weapon Points");



            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Gold");


            // add additional points to the current points and add treasure
            int totalPlayerFightingPoint = playerFightingPoint + 5;
            int totalPlayerExperiencePoint = playerExperiencePoint + 5;
            int totalPlayerWeaponsPoint = playerWeaponsPoint + 5;

            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold",playerTreasure1 );
            }
            else{
                playerTreasures.put("Gold",playerTreasures.get("Gold") + playerTreasure1 );


            }



            // save the fighting point
            playerTool.put("Fighting Points",totalPlayerFightingPoint );
            playerTool.put("Experience Points",totalPlayerExperiencePoint );
            playerTool.put("Weapon Points",totalPlayerWeaponsPoint );
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("35.wav");
            //  display the total number of points the user got at the end of the game


        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }


        System.exit(0);

    return asseRel;

    }





    public String moveHarnessAndCarefully(String move, String name) {
        String harCare = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("P")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("24.wav");

            HarnessMoveStory();

            // add 15 fighting points,  5 weapon points, treasure of gold and diamond, 25 experience points

            // get the player points
            int playerfightingPoint = playersToolss.get("Fighting Points");
            int playerexperiencePoint = playersToolss.get("Experience Points");
            int playerweaponsPoint = playersToolss.get("Weapon Points");



            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Gold");
            int playerTreasure2 = getTreasures().get("Diamond");

            // add additional points to the current points and add treasure
            int totalplayerfightingPoint = playerfightingPoint + 15;
            int totalplayerexperiencePoint = playerexperiencePoint + 25;
            int totalplayerweaponsPoint = playerweaponsPoint + 5;

            if (playerTreasures.containsKey("null") || playerTreasures.containsKey("")){

                playerTreasures.remove("null");
                playerTreasures.put("Gold",playerTreasure1 );
                playerTreasures.put("Diamond",playerTreasure2);

            }
            else if (playerTreasures.containsKey("Gold")) {
                playerTreasures.put("Gold",playerTreasures.get("Gold") + playerTreasure1 );
                playerTreasures.put("Diamond",playerTreasure2 );


            }
            else{

                playerTreasures.put("Gold",playerTreasure1 );
                playerTreasures.put("Diamond",playerTreasure2);
            }



            // save the fighting point
            playerTool.put("Fighting Points",totalplayerfightingPoint );
            playerTool.put("Experience Points",totalplayerexperiencePoint );
            playerTool.put("Weapon Points",totalplayerweaponsPoint );
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("24.wav");
            // display the total number of points the user got at the end of the game


        }

        else if (move.equals("E")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("25.wav");

            carefullyMoveStory();

            backgroundMusic.stopSound("25.wav");
        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }


        System.exit(0);

    return harCare;

    }



    public String moveTake2AndLeave3(String move, String name) {
        String takLea = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("T")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("30.wav");

            TakeMoveStory3();

            // add silver treasure
            // get individual treasures that would be added
            int playerTreasure1 = getTreasures().get("Silver");

            // add the treasure
            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null", 0);
                playerTreasures.put("Silver",playerTreasure1 );
            }
            else{
                playerTreasures.put("Silver",playerTreasure1 );


            }

            // add 20 experience points

            // get player points
            int playerexperiencePoint = playersToolss.get("Experience Points");

            // add additional points
            int totalplayerexperiencePoint = playerexperiencePoint + 20;



            // save additions
            playerTool.put("Experience Points",totalplayerexperiencePoint );
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("30.wav");

        }

        else if (move.equals("L")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("31.wav");

            LeaveMoveStory3();

            backgroundMusic.stopSound("31.wav");
        }



        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }

        System.exit(0);

        return takLea;

    }





    public String moveGatherAndStay(String move, String name) {
        String gatSta = "";
        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        if (move.equals("G")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("54.wav");

            GatherMoveStory();
            // Jewel made of diamond, ancient manuscripts written with gold, and a silver mystical artifacts

            // get gold treasure
            int playerTreasure1 = getTreasures().get("Gold");
            int playerTreasure2 = getTreasures().get("Silver");
            int playerTreasure3 = getTreasures().get("Diamond");

            // add players treasures to his account
            if (playerTreasures.containsKey("null")){
                playerTreasures.remove("null");
                playerTreasures.put("Gold", playerTreasure1);
                playerTreasures.put("Silver", playerTreasure2);
                playerTreasures.put("Diamond", playerTreasure3);
            }
            else{
                playerTreasures.put("Gold", playerTreasure1);
                playerTreasures.put("Silver", playerTreasure2);
                playerTreasures.put("Diamond", playerTreasures.get("Diamond" )+ playerTreasure3);


            }

            // save the players achievements
            TreasureBox.put(name, playerTreasures);


            backgroundMusic.stopSound("54.wav");

        }

        else if (move.equals("S")){

            backgroundMusic.stopSound("3.wav");
            backgroundMusic.playSound("55.wav");

            StayMoveStory();

            // 50 experience points

            // get experience points
            int playerExperiencePoint = playersToolss.get("Experience Points");

            // add players treasures to his account
            int totalPlayerExperiencePoint = playerExperiencePoint + 50;


            // save the players achievements

            playerTool.put("Experience Points",totalPlayerExperiencePoint );

            backgroundMusic.stopSound("55.wav");

        }


        // Convert the inner map to String (or process it as needed)
        String treasuresAsStrings = playerTreasures.toString();

        // Return the string representation of the treasures

        String FPString = String.valueOf(playersToolss.get("Fighting Points"));

        String EPString = String.valueOf(playersToolss.get("Experience Points"));

        String WPString = String.valueOf(playersToolss.get("Weapon Points"));


        backgroundMusic.playSound("6.wav");
        String[] nSections = {
                " Achievements ",
                "----------------------------------",


        };

        String[] n2Sections = {

                "Fighting points : " + FPString,
                "Experience points : " + EPString,
                "Weapon points : " + WPString,
                "Treasures : " + treasuresAsStrings

        };

        // Loop through each section
        for (String section : nSections ) {
            printWithDelay(section, 1200); // Print section with a 2-second delay
        }

        // Loop through each section
        for (String section : n2Sections ) {
            printWithDelay(section, 20); // Print section with a 2-second delay
        }


        System.exit(0);

    return gatSta;
}


public String moveExitAndEnd(String move, String name) {
        String gatSta = "";

        Map<String, Integer> playersToolss = Members.get(name);

        Map<String, Integer> playerTreasures = TreasureBox.get(name);

        backgroundMusic.stopSound("3.wav");
        backgroundMusic.playSound("47.wav");

        if (move.equals("R")){
            ExitMoveStory();

            backgroundMusic.stopSound("47.wav");
        }

        else if (move.equals("E")){

            EndMoveStory();

            backgroundMusic.stopSound("47.wav");

        }


    // Convert the inner map to String (or process it as needed)
    String treasuresAsStrings = playerTreasures.toString();

    // Return the string representation of the treasures

    String FPString = String.valueOf(playersToolss.get("Fighting Points"));

    String EPString = String.valueOf(playersToolss.get("Experience Points"));

    String WPString = String.valueOf(playersToolss.get("Weapon Points"));


    backgroundMusic.playSound("6.wav");
    String[] nSections = {
            " Achievements ",
            "----------------------------------",


    };

    String[] n2Sections = {

            "Fighting points : " + FPString,
            "Experience points : " + EPString,
            "Weapon points : " + WPString,
            "Treasures : " + treasuresAsStrings

    };

    // Loop through each section
    for (String section : nSections ) {
        printWithDelay(section, 1200); // Print section with a 2-second delay
    }

    // Loop through each section
    for (String section : n2Sections ) {
        printWithDelay(section, 20); // Print section with a 2-second delay
    }

    System.exit(0);

    return gatSta;
    }





}
