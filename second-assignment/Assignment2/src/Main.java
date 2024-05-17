//for input

//for accessing other
import hero.Hero;
import soundEffect.SoundEffect;
import storyLine.Storyline;


import java.util.Scanner;



public class Main  extends SoundEffect {
    public static void main(String[] args) {


//        new arrangement
        // add sound for begining
        playSound("1.wav");


        //    take the users name
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter your Players name: ");
        String user_name = userinput.nextLine();

        // stop the music
        stopSound("1.wav");

        // display the users tools and items
        Hero player = new Hero();
        player.newPlayerItems(user_name);


//        display intro story line
        Storyline story = new Storyline();
        playSound("3.wav");

        story.introConsole();
        String move = "Begin";
        String inside_move = "Mother_move" ;

        if (move.equals("Begin")) {
// part 1       take the start move
            while (true) {

                PlayerState savedState = reverseAction1(user_name, player);

                System.out.print("Enter your choice (S/N): ");
                String begin = userinput.nextLine().toUpperCase();

                //            Check if the input was valid (S or N)and exit the loop
                if (begin.equals("S")) {
                    move = player.moveStart(begin, user_name);
                } else if (begin.equals("N")) {
                    player.moveStart(begin, user_name);
                    break;
                }

                if (move.equals("L") || move.equals("P")) {
                    break;
                } else {
                    reverseAction2(user_name, savedState, player);
                    System.out.println("You just repeated your stage");
//

                }


            }
//part2

            if (move.equals("L") || (move.equals("P"))) {

                while (true) {

                    // Simulate reverseAction1 to save the current state

                    PlayerState savedState = reverseAction1(user_name, player);
//
                    inside_move = move;
//                    System.out.println("weretrtytuyio"+ inside_move);
                    move = player.moveLibraryAndPortraitHall(move, user_name);

                    //            Check if the input was valid (S or N)and exit the loop
                    if (inside_move.equals("L") && (move.equals("C") || move.equals("R"))) {
//
                        break;

                    }

                    else if (inside_move.equals("P") && (move.equals("E") || move.equals("P"))) {
                        break;

                    } else {
                        System.out.println("You just repeated your stage");

                        // Reverse the actions to restore the original state
                        reverseAction2(user_name, savedState, player);
//
//



                        System.out.print("Enter your choice (L/P):");
                        move = userinput.nextLine().toUpperCase();
                    }
                }

//part 3
                if (move.equals("C") || move.equals("R")) {
                    while (true) {

                        PlayerState savedState = reverseAction1(user_name, player);

                        inside_move = move;
                        move = player.moveChamberAndRush(move);

                        //            Check if the input was valid (S or N)and exit the loop
                        if (inside_move.equals("C") && (move.equals("P") || move.equals("S"))) {
                            break;

                        }else if (inside_move.equals("R") && (move.equals("M") || move.equals("B"))) {
                            break;

                        } else {
                            reverseAction2(user_name, savedState, player);

                            System.out.println("You just repeated your stage");
                            System.out.print("Enter your choice (C/R): ");
                            move = userinput.nextLine().toUpperCase();
                        }


                    }
//part 4
                    if (move.equals("P") || move.equals("S")) {
                        while (true) {

                            PlayerState savedState = reverseAction1(user_name, player);

                            inside_move = move;
                            move = player.moveMysterious2AndSearch2(move, user_name);

                            //            Check if the input was valid (S or N)and exit the loop
                            if (inside_move.equals("P") && (move.equals("N") || move.equals("C"))) {
                                break;

                            }
                            else if (inside_move.equals("S") && (move.equals("T") || move.equals("L"))) {
                                break;

                            } else {

                                reverseAction2(user_name, savedState, player);

                                System.out.println("You just repeated your stage");
                                System.out.print("Enter your choice (P/S): ");
                                move = userinput.nextLine().toUpperCase();
                            }


                        }

                        //Part 5
                        if (move.equals("N") || move.equals("C")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveNegotiateAndConfront(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("N") && (move.equals("A") || move.equals("D"))) {
                                    break;

                                } else if (inside_move.equals("C") && (move.equals("T") || move.equals("E"))) {
                                    break;

                                } else {
                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (N/C): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }


//part 6
                            if (move.equals("A") || move.equals("D")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    inside_move = move;
                                    move = player.moveAcceptAndDelve(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (inside_move.equals("A")) {
                                        break;
                                    }

                                    else if (inside_move.equals("D") && (move.equals("G") || move.equals("S"))) {
                                        break;


                                    } else {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (A/D): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }

                                }
//part 7
                                if (move.equals("G") || move.equals("S")) {
                                    while (true) {

                                        PlayerState savedState = reverseAction1(user_name, player);

                                        move = player.moveGatherAndStay(move, user_name);

                                        //            Check if the input was valid (S or N)and exit the loop
                                        if (move.equals("")) {

                                            reverseAction2(user_name, savedState, player);

                                            System.out.println("You just repeated your stage");
                                            System.out.print("Enter your choice (G/S): ");
                                            move = userinput.nextLine().toUpperCase();
                                        }


                                    }


                                }
                            }

//part 6
                            if (move.equals("T") || move.equals("E")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveTreasureAndExplore(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (T/E): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }
                            }








                        }

                        //part
                        if (move.equals("T") || move.equals("L")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveTakeAndLeave(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("T") && (move.equals("F") || move.equals("K"))) {
                                    break;

                                } else if (inside_move.equals("L") && (move.equals("E") || move.equals("R"))) {

                                    break;

                                } else {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (T/L): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }

//Part 6
                            if (move.equals("F") || move.equals("K")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    inside_move = move;
                                    move = player.moveFreeAndKeep(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (inside_move.equals("F") && (move.equals("R"))){
//
                                        break;
                                    }
                                    else if (inside_move.equals("K") && (move.equals("E"))){
//
                                        break;
                                    }
                                    else {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (F/K): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }


                                if (move.equals("R") ) {
                                    while (true) {

                                        PlayerState savedState = reverseAction1(user_name, player);

                                        inside_move = move;
                                        move = player.moveExitAndEnd(move, user_name);

                                        //            Check if the input was valid (S or N)and exit the loop
                                        if (inside_move.equals("R")) {
//
                                            break;
                                        }

                                        else {

                                            reverseAction2(user_name, savedState, player);
                                            System.out.println("You just repeated your stage");
                                            System.out.print("Enter your choice (R): ");
                                            move = userinput.nextLine().toUpperCase();
                                        }


                                    }


                                }


                                else if (move.equals("E")) {
                                    while (true) {

                                        PlayerState savedState = reverseAction1(user_name, player);

                                        inside_move = move;
                                        move = player.moveExitAndEnd(move, user_name);

                                        //            Check if the input was valid (S or N)and exit the loop
                                        if (inside_move.equals("E")){
                                            break;
                                        }
                                        else {

                                            reverseAction2(user_name, savedState, player);

                                            System.out.println("You just repeated your stage");
                                            System.out.print("Enter your choice (E): ");
                                            move = userinput.nextLine().toUpperCase();
                                        }


                                    }


                                }
//part 6


                            }
//part 6

                            if (move.equals("E") || move.equals("R")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveExitAndReconsider(move, user_name);

                                    if (!move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (E/R): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }
                            }
                        }
                    }
//part4
                    if (move.equals("M") || move.equals("B")) {
                        while (true) {

                            PlayerState savedState = reverseAction1(user_name, player);

                            inside_move = move;
                            move = player.moveMysteriousAndSearch(move, user_name);

                            //            Check if the input was valid (S or N)and exit the loop
                            if (inside_move.equals("M") && (move.equals("N") || move.equals("C"))) {

                                break;

                            } else if (inside_move.equals("B") && (move.equals("T") || move.equals("L"))) {
                                break;

                            } else {

                                reverseAction2(user_name, savedState, player);

                                System.out.println("You just repeated your stage");
                                System.out.print("Enter your choice (M/B): ");
                                move = userinput.nextLine().toUpperCase();
                            }


                        }

//part 5
                        if (move.equals("N") || move.equals("C")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveNegotiate2AndConfront2(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("N") && (move.equals("A") || move.equals("J") || move.equals("G"))) {
                                    break;

                                } else {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (N/C): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }
//part 6
                            if (move.equals("A") || move.equals("J") || move.equals("G")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveAcientJewelAndGolden(move , user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (A/J/G): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }


                            }


                        }

//part 5
                        if (move.equals("T") || move.equals("L")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveTake2AndLeave2(move,user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("T") && (move.equals("A") || move.equals("R"))) {
                                    break;

                                } else {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (T/L): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }
//part 6
                            if (move.equals("A") || move.equals("R")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveAssertAndRelease(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (T/L): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }


                            }


                        }

                    }
                }


// Part3
                if (move.equals("E") || move.equals("P")) {

                    while (true) {

                        PlayerState savedState = reverseAction1(user_name, player);

                        inside_move = move;
                        move = player.moveEngageAndProceed(move, user_name);



                        //            Check if the input was valid (S or N)and exit the loop
                        if (inside_move.equals("E") && (move.equals("H") || move.equals("E"))) {

                            break;

                        } else if (inside_move.equals("P") && (move.equals("F") || move.equals("R"))) {
                            break;

                        } else {

                            reverseAction2(user_name, savedState, player);

                            System.out.println("You just repeated your stage");
                            System.out.print("Enter your choice (E/P): ");
                            move = userinput.nextLine().toUpperCase();
                        }
                    }


//part 4
                    if (move.equals("H") || move.equals("E")) {
                        while (true) {

                            PlayerState savedState = reverseAction1(user_name, player);

                            inside_move = move;
                            move = player.moveExpress2AndEagerly2(move, user_name);

                            //            Check if the input was valid (S or N)and exit the loop
                            if (inside_move.equals("H") && (move.equals("Y") || move.equals("N"))) {
                                break;

                            } else if (inside_move.equals("E") && (move.equals("F") || move.equals("R"))){
                                break;

                            } else {

                                reverseAction2(user_name, savedState, player);

                                System.out.println("You just repeated your stage");
                                System.out.print("Enter your choice (H/E): ");
                                move = userinput.nextLine().toUpperCase();
                            }


                        }

//part 5
                        if (move.equals("Y") || move.equals("N")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveYesAndNo(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("Y") && (move.equals("P") || move.equals("E"))) {
                                    break;

                                } else {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (Y/N): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }
//part 6

                            if (move.equals("P") || move.equals("E")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveHarnessAndCarefully(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (P/E): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }


                            }


                        }


//part 5
                        if (move.equals("F") || move.equals("R")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                move = player.moveForwardAndRetreat(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (!move.equals(" ")) {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (F/R): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }


                        }

                    }

//part 4
                    if (move.equals("F") || move.equals("R")) {
                        while (true) {

                            PlayerState savedState = reverseAction1(user_name, player);

                            inside_move = move;
                            move = player.moveFightAndRetreat(move, user_name);

                            //            Check if the input was valid (S or N)and exit the loop
                            if (inside_move.equals("F") && (move.equals("C") || move.equals("E")) ){
                                break;

                            } else {

                                reverseAction2(user_name, savedState, player);

                                System.out.println("You just repeated your stage");
                                System.out.print("Enter your choice (F/R): ");
                                move = userinput.nextLine().toUpperCase();
                            }


                        }

//part 5
                        if (move.equals("C") || move.equals("E")) {
                            while (true) {

                                PlayerState savedState = reverseAction1(user_name, player);

                                inside_move = move;
                                move = player.moveContinueAndExit(move, user_name);

                                //            Check if the input was valid (S or N)and exit the loop
                                if (inside_move.equals("C") && (move.equals("T") || move.equals("L"))) {
                                    break;
                                }
                                else if (inside_move.equals("E") ) {
                                    break;

                                } else {

                                    reverseAction2(user_name, savedState, player);

                                    System.out.println("You just repeated your stage");
                                    System.out.print("Enter your choice (C/E): ");
                                    move = userinput.nextLine().toUpperCase();
                                }


                            }

//Part 6
                            if (move.equals("T") || move.equals("L")) {
                                while (true) {

                                    PlayerState savedState = reverseAction1(user_name, player);

                                    move = player.moveTake2AndLeave3(move, user_name);

                                    //            Check if the input was valid (S or N)and exit the loop
                                    if (move.equals("")) {

                                        reverseAction2(user_name, savedState, player);

                                        System.out.println("You just repeated your stage");
                                        System.out.print("Enter your choice (T/L): ");
                                        move = userinput.nextLine().toUpperCase();
                                    }


                                }


                            }
                        }
                    }


                }


            }

        }
    }
















}




