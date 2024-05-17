package storyLine;

import javax.swing.*;

public class Storyline {


    //    deal with text display
    private static void printWithDelay(String text, int delay) {
        System.out.println(text);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
            System.err.println("Interrupted: " + e.getMessage());
        }
    }


    //    Introducing my story line
    public void introConsole() {

        String[] introSections = {

                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^",
                """
                    Echoes of the past linger in the air
                    as you stand before the ancient, ivy-clad facade of Ravenwood Manor....
                """,
                " ",
                """
                    This once-majestic estate, now a shadow of its former glory,
                    is rumored to hold treasures beyond imagination,
                    left behind by its eccentric and reclusive occupants.
                    But the manor does not give up its secrets easily.
                """,
                " ",
                """
                    It is said that powerful beings, spectral guardians
                    bound to the treasures they once owned in life,
                    roam its dilapidated halls and hidden chambers.
                    These spirits, fueled by a mix of sorrow, rage,
                    and an unyielding attachment to the worldly possessions they left behind,
                    are determined to protect their treasures at any cost.
                """,
                " ",
                """
                    As you push open the heavy, oak door,
                    a chill runs down your spine,
                    not just from the cold air that rushes out,
                    but from the realization that the way back is no longer an option.
                    The only exit from this twisted maze of secrets
                    and shadows is a door hidden somewhere beyond the tangle of corridors and rooms,
                    behind the manor's decaying heart.
                """,
                " ",
                """
                    Will you brave the dark secrets of Ravenwood,
                    face its spectral defenders,
                    and claim the treasures that have eluded many before you?
                    Or will the manor claim you as another lost soul,
                    forever wandering its lonely halls?
                """,
                " ",
                """
                    The choice is yours. Press 'S' to step into the darkness and begin your adventure,
                    or press 'N' to turn away from the unknown,
                    leaving the mysteries of Ravenwood Manor unsolved and its treasures untouched.
                """,
                "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv"


        };


        // Loop through each section
        for (String section : introSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void StartMoveStory() {

        String[] startSections = {
                " ",
                """
                    The heavy door creaks closed behind you,
                    echoing finality through the empty halls of Ravenwood Manor.
                    The air inside is thick with dust and unspoken histories.
                    Your only light is the faint glow of your lantern
                    as you step into the grand entrance hall,
                    its once-lavish decorations now tarnished by time and neglect.
                """,
                " ",
                """
                    Ahead, the manor unfolds like a labyrinth,
                    its corridors and rooms shrouded in darkness.
                    Whispers hint at spectral guardians,
                    charging the air with tension.
                    To uncover the treasures,
                    you must be cunning and brave.
                """,
                " ",
                """
                    Your journey begins with a choice:
                    to your left, the library, filled with ancient books and hidden knowledge;
                    to your right, the portrait hall,
                    where painted eyes follow your every move, hiding clues or traps for the unwary.
                """,
                " ",
                """
                    Where will you go first?
                    Press 'L' to explore the library,
                    or 'P' to investigate the portrait hall.
                """,
                " ",
                "Enter your choice (L/P): "


        };
//        System.out.print("Enter your choice (L/P): ");

        // Loop through each section
        for (String section : startSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void NMoveStory() {

        String[] NSections = {
                " ",
                """
                    You turn away from the manor,
                    leaving its secrets and stories for another braver soul to discover.
                """,
                " ",
                """
                    But the whisper of adventure and the promise of untold treasures linger in your mind,
                    perhaps calling you back one day.
                """,
                " ",


        };
//        System.out.print("Enter your choice (L/P): ");

        // Loop through each section
        for (String section : NSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    //    section 1
    public static void LibaryMoveStory() {

        String[] librarySections = {
                " ",
                """ 
                    The library awaits,
                    filled with dusty tomes and a chess-themed puzzle.
                    
                """,
                " ",
                """
                    Outsmarting the spectral guardians,
                    you gain 10 Experience points and you uncover a hidden chamber
                """,
                " ",
                "  Now, faced with a choice: ",
                " ",
                """
                    Press 'C' to cautiously explore the hidden chamber
                    or 'R' to rush through the passage and continue your quest.
                """,
                " ",
                "  Enter your choice (C/R): "

        };


        // Loop through each section
        for (String section : librarySections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void PortraitHallMoveStory() {

        String[] portraitSections = {
                " ",
                """
                    The portrait hall beckons,
                    adorned with mesmerizing paintings concealing mysteries.
                    Solving the puzzles reveals a secret door leading to the Crypt.
                """,
                " ",
                """
                    Press 'E' to engage in a conversation with the spirits in the Crypt,
                    attempting to learn more about the manor's secrets,
                    or 'P' to proceed with caution,
                    ready to face any dangers that may arise.
                """,
                " ",
                "Enter your choice (E/P): "

        };


        // Loop through each section
        for (String section : portraitSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ChamberMoveStory() { //L

        String[] ChamberSections = {
                " ",
                """
                    Cautiously exploring the hidden chamber,
                    you find an ornate key that hints at a door leading to the Gallery.
                    The Gallery is adorned with mesmerizing paintings,
                    each concealing a puzzle or a hidden mechanism.
                """,
                " ",

                """
                    Press 'P' to solve the mysterious paintings' puzzles,
                    or 'S' to search for secret passages behind the artworks.
                """,
                " ",
                "Enter your choice (P/S): "

        };


        // Loop through each section
        for (String section : ChamberSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void RushMoveStory() { //L

        String[] rushSections = {
                " ",
                """
                    Rushing through the passage,
                    you find yourself in a dimly lit hallway leading to the Gallery.
                    The Gallery is adorned with mesmerizing paintings,
                    each concealing a puzzle or a hidden mechanism.
                """,
                " ",
                """ 
                    Press 'M' to solve the mysterious paintings puzzles,
                    or 'B' to search for secret passages behind the artworks.
                """,
                " ",
                "Enter your choice (M/B): "


        };


        // Loop through each section
        for (String section : rushSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void EngageMoveStory() { //P

        String[] conversationSections = {
                " ",
                """
                    Engaging in conversation with the spirits in the Crypt,
                    you learn valuable information about the manor's history and secrets.
                    The spirits, grateful for your willingness to listen,
                    gave you a gift of gold and guided you towards a hidden door leading to the heart of the manor.
                                                                                                                  
                """,
                " ",
                """
                    Press 'H' to express gratitude to the spirits and heal using available items,
                    or 'E' to eagerly move towards the hidden door
                """,
                " ",
                "Enter your choice (H/E): "

        };


        // Loop through each section
        for (String section : conversationSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }

    public static void ProceedMoveStory() { //P

        String[] proceedSections = {
                " ",
                """
                    Proceeding with caution in the Crypt,
                    you sense an impending danger.
                    The spirits seem agitated,
                    and the air is charged.
                    Suddenly, shadowy figures emerge from the darkness,
                    manifesting as hostile entities determined to protect the Crypt.
                                                                                                                  
                """,
                " ",
                """
                    Press 'F' to fight the hostile entities,
                    or 'R' to attempt to retreat and find another path.
                """,

                " ",
                "Enter your choice (F/R): "


        };


        // Loop through each section
        for (String section : proceedSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void mysteriousMoveStory() {//C

        String[] mysteriousMoveStorySections = {
                " ",
                """
                    Your keen eye and sharp wit allow you to decipher the puzzles hidden within the paintings with your 5 weapond points.
                    Each solution brings you closer to the truth behind Ravenwood Manor.
                    With the final piece of the puzzle in place,
                    a section of the wall slides away to reveal a luxurious, yet eerie, study.
                    This must be where the manor's lord conducted his most private affairs 
                    and perhaps where the greatest treasures are hidden.
                """,
                """
                    As you step into the study,
                    the door slides shut behind you.
                    You're now in the heart of Ravenwood,
                    with the manor's secrets within arm's reach.
                    But beware,
                    for this room is said to be closely guarded by the lord's own spirit,
                    enraged at any who dare to uncover his deepest secrets.
                """,
                " ",
                """
                    Press 'N' to negotiate with the lord's spirit for safe passage,
                    or 'C' to confront the spirit,
                    using all your skills to claim the treasure.
                """,
                " ",
                "Enter your choice (N/C): "

        };


        // Loop through each section
        for (String section : mysteriousMoveStorySections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void SearchMoveStory() {//C

        String[] searchSections = {
                " ",
                """
                    Your intuition leads you to a seemingly ordinary piece of artwork,
                    but upon closer inspection, you discover a lever hidden within the frame.
                    Pulling it reveals a secret passage, dimly lit and inviting.
                    As you navigate this hidden corridor,
                    you find it lined with artifacts and relics of the manor's past,
                    each telling a story of glory, betrayal,
                    a curse that has bound the spirits to these halls.
                """,
                """
                    You gain 5 fighting points and 10 experience point after learning about the manor's past.
                    The passage ends at a vaulted chamber,
                    home to the manor's most precious artifact: the Ravenwood Crest.
                    Legend says it holds the power to control the spirits within the manor
                    or unleash them upon the world.
                """,
                """
                    Press 'T' to take the Ravenwood Crest, fully aware of the risks involved,
                    or 'L' to leave it in place and explore further for safer treasures.
                """,
                " ",
                "Enter your choice (T/L): "

        };


        // Loop through each section
        for (String section : searchSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void Mysterious2MoveStory() {//R

        String[] mysterious2Sections = {
                " ",
                """
                    Your keen eye and sharp wit allow you to decipher the puzzles hidden within the paintings.
                    Each solution brings you closer to the truth behind Ravenwood Manor
                    and you gain 10 experience points and weapon points.
                    With the final piece of the puzzle in place,
                    a section of the wall slides away to reveal.
                    This must be where the manor's lord conducted his most private affairs
                    and perhaps where the greatest treasures are hidden.
                """,
                """
                    As you step into the study,
                    the door slides shut behind you.
                    You're now in the heart of Ravenwood,
                    with the manor's secrets within arm's reach.
                    But beware,
                    for this room is said to be closely guarded by the lord's own spirit,
                    enraged at any who are to uncover his deepest secrets.
                """,
                " ",
                """
                    Press 'N' to negotiate with the lord's spirit for safe passage,
                    or 'C' to confront the spirit,
                    using all your skills to claim the treasure.
                """,
                " ",
                "Enter your choice (N/C): "

        };


        // Loop through each section
        for (String section : mysterious2Sections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void Search2MoveStory() {//R

        String[] searchSections = {
                " ",
                """
                    Your intuition leads you to a seemingly ordinary piece of artwork,
                    but upon closer inspection,
                    you discover a lever hidden within the frame gaining 5 experirnce points.
                    Pulling it reveals a secret passage, dimly lit and inviting.
                    As you navigate this hidden corridor,
                    you find it lined with artifacts and relics of the manor's past,
                    each telling a story of glory, betrayal
                    and a curse that has bound the spirits to these halls.
                """,
                """
                    The passage ends at a vaulted chamber
                    home to the manor's most precious artifact: the Ravenwood Crest.
                    Legend says it holds the power to control the spirits within the manor
                    or unleash them upon the world.
                """,
                " ",

                """ 
                    Press 'T' to take the Ravenwood Crest, fully aware of the risks involved,
                    or 'L' to leave it in place and explore further for safer treasures.
                """,
                "Enter your choice (T/L): "

        };


        // Loop through each section
        for (String section : searchSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void expressMoveStory(String option) { //engage

        if (option.equals("expressSections1")) {
            String[] expressSections1 = {
                    " ",
                    """
                    You take a moment to express your gratitude to the spirits,
                    and also deciding whether to use some of your resources to tend to your wounds.
                    
                """,
                    """
                    You can only heal yourself with your available treasures.
                """,
                    "Do you want to use your treasure to heal yourself?",
                    """
                        if Yes press "R" to heal yourself and "O" to opt out
                        
                    """,
                    "Enter your choice (R/O): "
            };

            // Loop through each section
            for (String section : expressSections1) {
                printWithDelay(section, 2000); // Print section with a 2-second delay
            }
        } else if (option.equals("expressSections2")) {
            String[] expressSections2 = {
                    " ",
                    """
                        The spirits, touched by your respect and care,
                        bestow upon you a blessing that makes you feel rejuvenated
                        and ready to face whatever lies ahead.
                                    
                    """,
                    """
                        With a renewed spirit,
                        you proceed towards the hidden door,
                        spirits guiding your path with a soft, ethereal light.
                    """,

                    """
                        You find yourself before a grand door
                        its details hinting at the importance of what lies beyond.
                        Do you press on? (Y/N)
                    """,
                    "Enter your choice (Y/N): "
            };

            // Loop through each section
            for (String section : expressSections2) {
                printWithDelay(section, 2000); // Print section with a 2-second delay
            }
        }


    }


    public static void eagerlyMoveStory() { //engage

        String[] eagerlySections = {
                " ",
                """
                    Driven by eagerness, you quickly make your way to the hidden door,
                    barely noticing the spirits' warnings of the dangers that lie ahead.
                """,
                """
                    As the door creaks open,
                    you're met with a challenge that tests all your skills and wits.
                    The heart of Ravenwood Manor is not only filled with treasure
                    but also guarded by puzzles and traps.
                """,
                """
                    Do you brave the dangers and press forward,
                    or retreat to gather your strength? (F/R)
                """,
                "Enter your choice (F/R): "
        };


        // Loop through each section
        for (String section : eagerlySections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void FightMoveStory() { //proceed

        String[] fightSections = {
                " ",
                """
                    You brace yourself for a confrontation with the hostile entities.
                    With each step, their forms become more defined,
                    revealing twisted and tormented faces.
                """,
                """
                    As the first entity lunges towards you,
                    you draw your weapon and engage in a fierce battle which takes all your fighting points from you.
                    Luckly for you you gain a 15 extra experience points for your farce battle performance.
                """,

                """
                    Press 'C' to continue exploring the Crypt
                    or 'E' to exit and reassess your strategy.
                """,
                "Enter your choice (C/E): "
        };


        // Loop through each section
        for (String section : fightSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void RetreatMoveStory() { //proceed

        String[] retreatSections = {
                " ",
                """
                    Choosing discretion over confrontation,
                    you quickly assess the situation and decide to retreat,
                    hoping to find an alternative route through the Crypt.
                    The spirits,
                    though aggressive, do not pursue far beyond their sacred grounds.
                """,
                """
                    As you backtrack through the dimly lit corridors,
                    you stumble upon a hidden passage obscured by the shadows.
                    With a sense of relief mixed with anticipation,
                    you navigate this new path,
                    which seems to have been overlooked by others.
                """,

                """
                    The passage leads you to a secluded chamber within the Crypt,
                    home to a forgotten artifact.
                    This artifact, radiating a gentle, protective energy,
                    seems to pacify the spirits of the Crypt,
                    allowing you to explore freely and uncover hidden treasures without further hostility.
                """,
                """
                    You found a golden treasure lying down at the center of the room and you took it,
                    and through the process you got 15 experience points for being able to pick the treasure.
                """,
                """
                    With the newfound artifact and treasures in hand, you make your way out of the Crypt,
                    guided by the benevolent spirits that now regard you as a protector of their resting place.
                    Your decision to retreat has not only saved you from potential harm
                    but also rewarded you with unexpected allies and riches.
                """,
                """
                    Game Over. Thank you for playing.
                    Your wisdom and respect for the unseen have led you to a peaceful resolution,
                    earning you both treasure and the gratitude of the spirits.
                """
        };


        // Loop through each section
        for (String section : retreatSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void NegotiateMoveStory() { //Painting

        String[] negotiateSections = {
                " ",
                """
                    Approaching the ethereal figure with respect and understanding,
                    you attempt to communicate your intentions and seek an agreement.
                    The lord's spirit,
                    while initially hostile, senses the purity of your quest and decides to test your resolve.
                    He proposes a riddle, a question about the manor's history that only a true scholar
                    or a dedicated explorer could answer.
                """,
                """
                    Successfully answering the riddle not only earns you the spirit's respect
                    but also his assistance and 15 experience point and 5 weapons points.
                    He reveals the location of the manor's greatest treasure,
                    hidden within a secret compartment in his study,
                    and grants you safe passage out of the manor.
                """,

                """
                    Press 'A' to accept the treasure and leave,
                    honoring your agreement with the spirit,
                    or 'D' to delve deeper into the manor's mysteries,
                    risking the spirit's wrath
                    but potentially uncovering even greater secrets.
                """,
                " ",
                "Enter your choice (A/D): "


        };


        // Loop through each section
        for (String section : negotiateSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void confrontMoveStory() { //Painting

        String[] confrontSections = {
                " ",
                """
                    Armed with your courage and wit, you confront the enraged spirit.
                    The air crackles with energy as you stand your ground,
                    using every piece of knowledge and skill you've acquired within the manor.
                    And this removes all your points achieved so far.
                    The confrontation is intense, with the spirit unleashing spectral forces to deter you.
                                                                                                
                """,
                """
                    In the end, your determination prevails which gives you 15 experience points.
                    The spirit, defeated, acknowledges your strength and relinquishes control over the treasure.
                    With the spirit's power waning,
                    the manor begins to calm, and a path to leave is revealed.
                """,
                """
                    Press 'T' to take the treasure and exit the manor,
                    a victor in the truest sense,
                    or 'E' to explore the now-peaceful manor further,
                    free from the threats that once lurked in its shadows.
                """,
                "Enter your choice (T/E): "


        };


        // Loop through each section
        for (String section : confrontSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void TakeStory() { //Search

        String[] takeSections = {
                " ",
                """
                    Grasping the Ravenwood Crest, you immediately feel a surge of power
                    which added 20 fighting points, 15 exirence point
                    and 10 weapond point to your already existing points and a silver treasure.
                    The spirits of the manor, once bound to its halls,
                    now recognize you as their new master.
                    With this artifact,
                    you have the power to uncover every secret and treasure hidden within the manor.
                """,
                """
                    However, with great power comes great responsibility.
                    You must choose whether to use the Crest to free the spirits
                    or keep them bound to protect the treasures within.
                                                                                                                                                        
                """,
                """
                    Press 'F' to free the spirits,
                    releasing them from their eternal bondage
                    and forgoing the manor's treasures in favor of peace,
                    or 'K' to keep the spirits bound,
                    ensuring the manor's riches remain yours but at the cost of the spirits' freedom.
                """,
                " ",
                "Enter your choice (F/K): "

        };


        // Loop through each section
        for (String section : takeSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void LeaveStory() {//Search

        String[] leaveSections = {
                " ",
                """
                    Deciding against the potential risks,
                    you leave the Ravenwood Crest in its place.
                    This choice reflects your respect for the balance between power and its consequences.
                    As you step away,
                    the manor seems to acknowledge your decision,
                    the oppressive atmosphere lightens,
                    and a hidden exit reveals itself to you.
                                                                                                                    
                """,
                """
                    You leave the manor with valuable artifacts
                    and the knowledge you've gained
                    in the form of points are 20 experience points and a gold and silver treasure,
                    but the greatest treasure remains within,
                    guarded by the spirits you've chosen to respect.
                                                                                                                                                     
                """,
                """
                    Press 'E' to exit the manor,
                    your journey complete, with stories of bravery and wisdom to share,
                    or 'R' to reconsider and take the Ravenwood Crest,
                    facing whatever consequences may follow.
                """,
                "Enter your choice (E/R): ",
                " ",

        };


        // Loop through each section
        for (String section : leaveSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void NegotiateMoveStory2() { //puzzel

        String[] negotiate2Sections = {
                " ",
                """
                    With a deep breath,
                    you call out to the spirit,
                    offering words of peace and understanding.
                    Your voice echoes through the study,
                    carrying your sincere intentions.
                    Silence follows,
                     tense, heavy silence that seems to stretch for an eternity.
                """,
                """
                    Then, from the shadows,
                    a soft, ethereal glow appears.
                    The lord's spirit, once furious and protective,
                    now regards you with a curious gaze.
                    "You are not like the others", it whispers,
                    "You seek not to plunder for greed but to understand".
               """,
                """
                    The spirit moves closer,
                    its form becoming more defined,
                    a sad smile on its face.
                    "I will grant you safe passage", it declares,
                    "and one item from my collection".
                    Choose wisely, for it will be the only treasure you will leave with.
                """,

                """
                    Press 'A' to choose the ancient tome of knowledge,
                    'J' for the jeweled dagger of eternal youth, or
                    'G' for the golden orb of fortune.
                """,
                " ",
                "Enter your choice (A/J/G): "

        };


        // Loop through each section
        for (String section : negotiate2Sections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ConfrontMoveStory2() {//puzzel

        String[] confront2Sections = {
                " ",
                """
                    Steel in your heart,
                    you prepare to confront the spirit.
                    With every tool and trick at your disposal,
                    you brace for the inevitable clash.
                """,
                """
                    The room grows colder,
                    the shadows darker,
                    as the spirit manifests fully before you,
                    its rage palpable,
                    a storm of supernatural fury.
               """,
                """
                    The battle is fierce,
                    a test of wills and strength
                    and you used all your fighting and weapon points.
                    In the end, though, your determination proves stronger.
                    The spirit, defeated, dissipates into the ether,
                    leaving behind a silence filled with both triumph and sorrow.
                """,

                """
                    Before you, the treasures of the study lay unprotected,
                    yours for the taking.
                    You get 20 points each for all the available points and 1 silver treasure
                    But remember, some victories come with their own burdens and regrets.
                """,
                """   
                    You leave Ravenwood Manor with your spoils,
                    but the memory of the confrontation,
                    and the spirit's despair,
                    linger with you long after.
                """,
                " ",

        };


        // Loop through each section
        for (String section : confront2Sections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void TakeMove2Story() { //secret

        String[] takeSections = {
                " ",
                """
                    You grasp the Ravenwood Crest,
                    feeling its ancient power.
                    The spirits of the manor swirl around you,
                    their intentions unclear
               """,
                """
                    Press 'A' to assert control over the spirits
                    or 'R' to release the Crest and calm them.
               """,
                "Enter your choice (A/R): "


        };


        // Loop through each section
        for (String section : takeSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void LeaveMove2Story() {//secret

        String[] leaveSections = {
                " ",
                """
                    Respecting the manor's history,
                    you leave the Crest.
                    Exploring further,
                    you find a small, hidden alcove with personal mementos of the manor's inhabitants.
                    These tell a tale of love, loss, and redemption.
                    You leave with no treasure
                    but carry with you stories of a past era,
                    perhaps the real treasure of Ravenwood giving you 40 experience points.
               """,


        };


        // Loop through each section
        for (String section : leaveSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void YesMoveStory() { //express

        String[] yesSections = {
                " ",
                """
                    You step through the door to discover the heart of Ravenwood Manor ,
                    filled with untold secrets and treasures and instantly gained 10 fighting points.
                    Your journey within these haunted halls reaches a climax
                    as you uncover the true legacy of the manor.
                """,
                """
                    As you delve deeper,
                    you stumble upon a forgotten chamber,
                    its walls adorned with ancient runes.
                    The spirits guide you to a mystical artifact,
                    pulsating with power.
                """,
                """
                    Press 'P' to harness the artifact's power
                    and unlock its secrets,
                    or 'E' to carefully exit the chamber,
                    choosing not to tempt fate.
                """,


        };


        // Loop through each section
        for (String section : yesSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void NoMoveStory() { //express

        String[] noSections = {
                " ",
                """
                    Choosing caution over curiosity,
                    you decide to retreat and plan your next move.
                    The secrets of Ravenwood remain,
                    waiting for a time when you might return.
                """,
                """
                    Your exploration in Ravenwood Manor concludes for now.
                    Thank you for playing.
                    Until our paths cross again.
                """,
        };


        // Loop through each section
        for (String section : noSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ForwardMoveStory() { // egaerly

        String[] forwardSections = {
                " ",
                """
                    With determination,
                    you navigate through the challenges,
                    your every skill put to the test.
                    Finally,
                    you stand triumphant amid the riches and secrets of the manor,
                    a testament to your courage and wit.
                """,
                " ",
                " ",
                " ",
        };


        // Loop through each section
        for (String section : forwardSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void RetreatingMoveStory() { //egaerly

        String[] retreatingSections = {
                " ",
                """
                    Realizing the risks outweigh your preparedness,
                    you choose to retreat.
                    The secrets of Ravenwood Manor remain intact,
                    but so do the tales of your wisdom and prudence.
                """,
                " ",
                " ",
                " ",
        };


        // Loop through each section
        for (String section : retreatingSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ContinueMoveStory() { //fight

        String[] continueSections = {
                " ",
                """
                Undeterred by the confrontation,
                you press on deeper into the Crypt.
                The air is heavy with the weight of history,
                and the spirits whisper tales of long-forgotten secrets.
                """,

                """
                As you reach the heart of the Crypt,
                you discover an ancient chamber bathed in an otherworldly glow.
                An artifact, pulsating with power,
                rests upon an ancient pedestal.
                """,
                """
                Press 'T' to take the artifact and complete your quest,
                or 'L' to leave the artifact untouched, respecting the sanctity of the Crypt.
                """,
                "Enter your choice (T/L): "
        };


        // Loop through each section
        for (String section : continueSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ExitMoveStory3() { //fight

        String[] exitSections = {
                " ",
                """
                    Choosing to exit the Crypt,
                    you retreat to the dimly lit corridors of Ravenwood Manor.
                    The hostile entities fade into the shadows,
                    and you find yourself at a crossroads.
                """,
                """
                    Your exploration in Ravenwood Manor concludes,
                    but the mysteries of the forgotten artifact linger.
                    Thank you for playing. Until our paths cross again.
                """
        };


        // Loop through each section
        for (String section : exitSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void AcceptStory() { //Negociate

        String[] acceptSections = {
                " ",
                """
                    Honoring your agreement with the spirit,
                    you carefully retrieve the treasure from its secret compartment
                    which gives you 2 golden treasures and 1 silver treasure.
                    As promised,
                    the spirit guides you to a safe exit,
                    a hidden door that leads out into the cool night air.
                    The treasure,
                    a symbol of your courage and wisdom,
                    will serve as a reminder of the adventure and the pact you made within the walls of Ravenwood Manor.
                """,
                """
                    As you step outside,
                    the door seals behind you,
                    and the manor stands silent once more,
                    its secrets safe.
                    You've completed your quest with honor and respect,
                    leaving the spirits to rest,
                    and you return to the world a wealthier and wiser soul.
                """,
                """ 
                    Congratulations!
                    You've successfully navigated Ravenwood Manor
                    and emerged with its greatest treasure.
                    Your journey is complete,
                    but who knows what other adventures await?
                """,
                " ",

        };


        // Loop through each section
        for (String section : acceptSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void DelveMoveStory() { //Negoriate

        String[] delveSections = {
                " ",
                """
                    Driven by an insatiable curiosity,
                    you decide to explore the manor further,
                    seeking out its deepest secrets.
                    The spirit, though wary,
                    respects your decision and fades away,
                    leaving you to your quest.
                    Your journey takes you through hidden corridors and secret rooms,
                    each revealing more about the manor's dark past
                    and the tragedies that befell its inhabitants.
                """,
                """
                    Finally, in the lowest dungeons of the manor,
                    you uncover the source of its curse,
                    a powerful artifact that has bound the spirits to this place.
                    This findings gives you 50 experience points.
                    With great care, you manage to neutralize the artifact,
                    releasing the spirits from their eternal torment
                    and lifting the curse from Ravenwood Manor
                    and generated a diamond treasure as an achievement token.
                """,
                " ",
                """
                    Press 'G' to gather the now-unbound treasures of the manor and leave,
                    or 'S' to stay a while longer,
                    learning more about the manor's history now that peace has been restored".
                """,

                " ",
                "Enter your choice (G/S): "

        };


        // Loop through each section
        for (String section : delveSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void TreasureMoveStory() { //Confront

        String[] treasureSections = {
                " ",
                """
                    With the treasure securely in your possession which is a golden and diamond treasure,
                    you make your way to the exit revealed by the spirit's waning power.
                    The manor, now calm and silent,
                    seems almost grateful for the resolution you've brought.
                    As you step outside,
                    the weight of the adventure lifts,
                    replaced by a sense of accomplishment and the thrill of the unknown.
                """,

                """
                    You've faced down the spirits of Ravenwood Manor and emerged victorious,
                    the treasure a testament to your bravery and resolve.
                    The night welcomes you back to the world beyond,
                    your heart lighter and your pockets heavier.
                """,
                " ",
                """
                    As the manor fades into the mist behind you,
                    you can't help but wonder what other mysteries await your discovery.
                """,
                """   
                    Victory!
                    You've conquered the challenges of Ravenwood Manor and secured its treasures.
                    What adventures lie ahead for a brave soul like yours?
                """,
                " "
        };


        // Loop through each section
        for (String section : treasureSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }

    }


    public static void ExploreMoveStory() { //Confront

        String[] exploreSections = {
                " ",
                """
                    Freed from the immediate threats that once lurked in its halls,
                    you take this opportunity to explore Ravenwood Manor in peace.
                    The spirits, no longer bound by anger or sorrow,
                    occasionally appear to offer insights
                    or guide you to hidden nooks you might have otherwise missed.
                """,
                """
                    This exploration reveals not just treasures of material value
                    but also of historical significance,
                    offering a deeper understanding of the manor
                    and its inhabitants and this gives you 40 experience points.
                    Your journey through Ravenwood becomes not just an adventure
                    but a journey through time itself.
                """,
                """
                    As dawn breaks, you emerge from the manor,
                    not just as a treasure hunter
                    but as a guardian of its stories and secrets.
                    The manor, now truly at peace,
                    stands as a testament to the spirits' release
                    and your role in their salvation.
                """,

                """
                    Through your courage and wisdom,
                    you've brought peace to Ravenwood Manor and uncovered its deepest secrets.
                    Your adventure ends,
                    but the legacy of your journey will remain forever.
                    """,
                " "
        };


        // Loop through each section
        for (String section : exploreSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void FreeMoveStory() { //Take

        String[] freeSections = {
                " ",
                """
                    The moment you decide to free the spirits,
                    the Ravenwood Crest in your hand begins to glow with a soft, ethereal light.
                    The air around you fills with whispers of gratitude from the spirits as one by one,
                    they are released from their bindings.
                    The manor, once a place of sorrow and unrest,
                    is filled with a serene peace,
                    and the weight of centuries lifts from its halls.
                """,
                """
                    As the last spirit departs,
                    the manor's treasures vanish,
                    taken by the spirits as a token of their newfound freedom.
                    You stand alone in the empty manor,
                    devoid of its riches but rich in spirit.
                    The knowledge that you have righted the wrongs of the past
                    and brought peace to Ravenwood is a treasure beyond measure.
                """,
                """
                    The adventure concludes with you leaving the manor
                    with an additional experience point of 50 covering the other treasure you could not take,
                    its doors closing softly behind you.
                    Ravenwood Manor will stand as a monument to peace
                    and a reminder of the power of compassion.
                """,
                " ",
                " Press 'R' to exit the game and reflect on your journey.",
                " ",
                "Enter your choice (R): "

        };


        // Loop through each section
        for (String section : freeSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void KeepMoveStory() { //Take

        String[] keepSections = {
                " ",
                """
                    Choosing to keep the spirits bound,
                    you feel a heavy burden settle on your shoulders.
                    The Ravenwood Crest's glow dims to a somber tone,
                    and the air grows colder.
                    The spirits, once hopeful for release,
                    wail in despair as they realize their fate is sealed to the manor for eternity.
                """,
                """
                    The manor's treasures, though vast and valuable,
                    come at the cost of endless sorrow.
                    You wander the opulent halls,
                    now a master of a haunted domain, rich in material wealth
                    but impoverished in spirit.
                    Now all your retrieved treasure moves from your keeping place to it original storage place.
                """,
                """
                    As days turn to nights,
                    you begin to wonder if the treasures were worth the price.
                    The whispers of the bound spirits are a constant reminder of your choice.
                """,
                " ",
                "Press 'E' to end the game, trapped in luxury and haunted by your decision.",
                "Enter your choice (E): "

        };


        // Loop through each section
        for (String section : keepSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ExitMoveStory1() { //Leave

        String[] exitSections = {
                " ",
                """
                    With a sense of completion and a heart full of stories,
                    you step through the newly revealed exit.
                    The manor, with all its mysteries and treasures,
                    stands silent behind you as you walk away.
                    You have chosen a path of wisdom and respect,
                    leaving behind the temptations of power for the sake of preserving the balance.
                                                                                                                                                                                                                                                                                                        
                """,
                """
                    As you emerge into the light of day,
                    the weight of the adventure lifts from your shoulders.
                    You carry with you not just the physical artifacts you've found
                    but also invaluable experiences
                    and the knowledge that some treasures are best left undiscovered.
                """,
                """
                    
                    Thank you for playing.
                    Your journey through Ravenwood Manor is a testament to the courage
                    and wisdom of those who seek not just to explore, but to understand.
                """,
                " ",
                "Game over"
        };


        // Loop through each section
        for (String section : exitSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ReconsiderMoveStory1() { //Leave

        String[] reconsiderSections = {
                " ",
                """
                Driven by a last-minute change of heart,
                you turn back towards the crest,
                your resolve hardened by the allure of its power.
                With a steady hand, you remove the Ravenwood Crest from its resting place.
                The moment the crest is in your possession,
                the atmosphere shifts,
                a low rumble echoes through the manor as if the very foundation protests your decision.
                The spirits of the manor, once passive,
                now swirl around you in a frenzy, their displeasure clear.
                """,
                """
                    With the crest's power now yours giving you 20 fighting points , silver and gold treasure ,10 experience points and 5 weapond points,
                    you rush towards the exit,
                    the manor's corridors twisting and turning against you,
                    a labyrinth created by the angered spirits.
                    But the crest guides you,
                    its power warding off the malevolent forces until you emerge into the daylight.
                """,
                """
                    You've escaped with the Ravenwood Crest,
                    but at what cost?
                    The manor's curse now lingers on you,
                    a reminder of the balance disrupted by your choice.
                    This robes you of all your treasures
                    and leaves you with only points for the next time you decide to come :)
                    The adventure ends,
                    but the legacy of your decision will follow you,
                    a shadow cast by the power you now wield.
                """,
                """
                    Game Over.
                    Thank you for playing.
                    Your journey through Ravenwood Manor has ended,
                    but the consequences of your choices will continue to unfold.
                """

        };


        // Loop through each section
        for (String section : reconsiderSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void AcientMoveStory() { //Negotiate2

        String[] acientSections = {
                " ",
                """
                    You reach out and take the ancient tome.
                    As your fingers brush against its cover,
                    knowledge floods your mind - secrets of the past, understanding of the present,
                    and glimpses of the future.
                    You also gained 50 each of all the points and a silver treasure.
                """,
                """
                    With the tome in your possession,
                    you find yourself escorted out of the study by the spirit,
                    now free to leave Ravenwood Manor with your chosen treasure.
                """,
                """
                    Your adventure at Ravenwood Manor comes to a close.
                    As you step beyond its gates, you reflect on the journey
                    and the choices you've made.
                    The manor fades into the distance,
                    but its memories, and the treasure you've chosen,
                    will stay with you forever.
                """,
                " ",
                """
                    Thank you for playing.
                    Farewell, adventurer,
                    until our paths cross again in another tale.
                    """,
        };


        // Loop through each section
        for (String section : acientSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void jeweledMoveStory() { //Negotiate2

        String[] jeweleSections = {
                " ",
                """
                    The jeweled dagger glints as you take it in your hand,
                    its edge sharp and cold.
                    Instantly, you feel vitality coursing through your veins,
                    the promise of eternal youth now yours to command ,30 experience poinst  and five fighting points.
                """,
                """
                    With the dagger secured,
                    the spirit guides you from the study,
                    allowing you to exit Ravenwood Manor,
                    forever changed by your choice.
                """,
                """
                    Your adventure at Ravenwood Manor comes to a close.
                    As you step beyond its gates,
                    you reflect on the journey and the choices you've made.
                    The manor fades into the distance,
                    but its memories, and the treasure you've chosen,
                    will stay with you forever.
                """,
                " ",
                """
                    Thank you for playing.
                    Farewell, adventurer, until our paths cross again in another tale.
                """


        };


        // Loop through each section
        for (String section : jeweleSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }

    }


    public static void goldenMoveStory() { //Negotiate2

        String[] goldenSections = {
                " ",
                """
                    You choose the golden orb,
                    its surface swirling with an inner light.
                    Fortune, both good and ill,
                    will now be yours to command,
                    a tool and a test of your character.
                    Attached to this treasure,
                    you gain 30 points each of all the points and one golden treasure.
                """,
                """
                    Holding the orb,
                    you are led by the spirit out of the manor,
                    into the world beyond, richer in wealth and experience.
                """,
                """
                    Your adventure at Ravenwood Manor comes to a close.
                    As you step beyond its gates,
                    you reflect on the journey and the choices you've made.
                    The manor fades into the distance,
                    but its memories, and the treasure you've chosen,
                    will stay with you forever.
                """,
                " ",
                """
                    Thank you for playing.
                    Farewell, adventurer,
                    until our paths cross again in another tale.
                """,

        };


        // Loop through each section
        for (String section : goldenSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void AssertMoveStory() { //Take 2

        String[] assertSections = {
                " ",
                """
                    With a strong will,
                    you command the spirits to heed your call.
                    They bow to the Crest's power,
                    granting you access to all of Ravenwood's secrets.
                    For this experience you gain 20 experience points, 10 weapon point, 10 fighting point and a silver treasure.
                    You leave the manor,
                    treasure in hand,
                    but wonder if the spirits' obedience is truly a victory.
                """

        };


        // Loop through each section
        for (String section : assertSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ReleaseMoveStory() { //Take 2

        String[] releaseSections = {
                " ",
                """
                    Choosing peace, you return the Crest.
                    The spirits,
                    recognizing your respect,
                    guide you to a hidden chamber with lesser treasures which are a gold treasure, 5 fighting, experience nad weapon points.
                    You leave Ravenwood richer in wealth and spirit,
                    the manor's curse lifted by your actions.
                """

        };


        // Loop through each section
        for (String section : releaseSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void HarnessMoveStory() { //yes

        String[] harnessSections = {
                " ",
                """
                    You decide to harness the artifact's power,
                    unlocking its secrets.
                    The energy courses through you,
                    granting newfound abilities and knowledge.
                    You gained 15 fighting points, 5 weapong points, treasure of gold and diamond, 25 experience points
                """,
                """
                    Your journey in Ravenwood Manor comes to an end,
                    leaving you forever changed.
                    As you exit the manor,
                    the spirits bid you farewell,
                    their whispers echoing in the wind.
                """,
                """
                    Thank you for playing.
                    Until our paths cross again.
                """
        };


        // Loop through each section
        for (String section : harnessSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void carefullyMoveStory() { //yes

        String[] carefullySections = {
                " ",
                """
                    Choosing caution, you carefully exit the chamber,
                    leaving the mysterious artifact undisturbed.
                    The grand door closes softly behind you,
                    and you find yourself back in the dimly lit corridors of Ravenwood Manor.                                                                                                                                   System.out.println("Your journey in Ravenwood Manor comes to an end, leaving you forever changed. As you exit the manor, the spirits bid you farewell, their whispers echoing in the wind. Thank you for playing. Until our paths cross again.");
                """,
                """
                    Your exploration in Ravenwood Manor concludes,
                    but the mysteries of the forgotten artifact linger.
                    
                    Thank you for playing.
                    Until our paths cross again.
                """
        };


        // Loop through each section
        for (String section : carefullySections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void TakeMoveStory3() { //continue

        String[] takeSections = {
                " ",
                """
                    You decide to take the artifact made of silver,
                    feeling its energy resonate with yours.
                    As you lift it from the pedestal,
                    the spirits around you whisper words of approval.
                """,
                """
                    With the artifact in hand,
                    you emerge from the Crypt gaining 20 experience points,
                    the hostile entities now silent and the spirits at peace.
                    Your quest within Ravenwood Manor is complete.
                """,
                """
                    Thank you for playing Ravenwood Manor Adventure.
                    Your journey ends here,
                    but the echoes of your actions will resonate through the haunted halls.
                """
        };


        // Loop through each section
        for (String section : takeSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void LeaveMoveStory3() { //continue

        String[] leaveSections = {
                " ",
                """
                    Choosing to leave the artifact untouched,
                    you exit the Crypt,
                    the spirits guiding you back to the manor's corridors.
                """,
                """
                    Thank you for playing Ravenwood Manor Adventure.
                    Your journey ends here,
                    but the mysteries of the manor remain.
                    Until our paths cross again.
                """
        };


        // Loop through each section
        for (String section : leaveSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void GatherMoveStory() { //delve continue

        String[] gatherSections = {
                " ",

                """
                    Choosing wealth over wisdom,
                    you swiftly collect the unbound treasures of the manor.
                    Jewel made of diamond,
                    ancient manuscripts written with gold,
                    and a silver mystical artifacts fill your satchel.
                """,
                """
                    As you leave the manor,
                    the sun rises,
                    casting light on a new day.
                    The spirits of Ravenwood,
                    now freed,
                    fade into the dawn,
                    their whispers of gratitude carried away by the wind.
                """,
                """
                    Your adventure at Ravenwood Manor concludes here,
                    with pockets heavier and stories that will echo through time.
                    But remember,
                    some secrets and treasures come with their own burdens.
                """


        };


        // Loop through each section
        for (String section : gatherSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void StayMoveStory() { //delve continue

        String[] gatherSections = {
                " ",


                """
                    Your thirst for knowledge outweighing the lure of treasure,
                    you delve into the manor's archives .
                    You learn of the manor's origins,
                    the lives it touched,
                    the legacy of its inhabitants and gain 50 experience points.
                """,
                """
                    With a deeper understanding of Ravenwood,
                    you leave the manor as a guardian of its stories,
                    ensuring the spirits sacrifices were not in vain.
                """,
                """
                    As you step out of Ravenwood Manor,
                    the adventure ends,
                    but the journey of sharing its tales has just begun.
                    The manor stands silent,
                    a testament to the power of respect and understanding.
                """


        };


        // Loop through each section
        for (String section : gatherSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }


    }


    public static void ExitMoveStory() { //free

        String[] exitSections = {
                " ",
                """
                    No matter the path you chose,
                    the journey through Ravenwood Manor has come to an end.
                    You carry with you the memories of your adventure
                    and the lessons it taught you about power, responsibility, and compassion.
                """,
        };

        // Loop through each section
        for (String section : exitSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }

//        System.out.println("Your adventure continues...");

    }


    public static void EndMoveStory() { //free

        String[] exitSections = {
                " ",
                """
                    No matter the path you chose,
                    the journey through Ravenwood Manor has come to an end.
                    You carry with you the memories of your adventure
                    and the lessons it taught you about power, responsibility, and compassion.
                """,
        };

        // Loop through each section
        for (String section : exitSections) {
            printWithDelay(section, 2000); // Print section with a 2-second delay
        }

//        System.out.println("Your adventure continues...");

    }


}