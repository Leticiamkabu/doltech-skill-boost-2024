package soundEffect;


import hero.Hero;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class SoundEffect {

    private static Clip clip;
    public static void playSound(String soundFileName) {

        try {
            // Obtain a URL to the audio file
            URL url = SoundEffect.class.getClassLoader().getResource("music/" + soundFileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            // Get a sound clip resource
            clip = AudioSystem.getClip();

            // Open audio clip and load samples from the audio input stream
            clip.open(audioIn);
            clip.start();  // Start playing the sound
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();

        }
    }

    public static void stopSound(String soundFileName) {
        if (clip != null) {
            clip.stop();  // Stop the clip
            clip.close(); // Close the clip and release the resources
        }
    }



// for reversed moves
    public static class PlayerState {
        int experiencePoints;
        int fightingPoints;
        int weaponPoints;
        Map<String, Integer> treasurePoints;

        public PlayerState(int experiencePoints, int fightingPoints, int weaponPoints, Map<String, Integer> treasurePoints) {
            this.experiencePoints = experiencePoints;
            this.fightingPoints = fightingPoints;
            this.weaponPoints = weaponPoints;
            this.treasurePoints = new HashMap<>(treasurePoints); // Create a copy to avoid mutation issues
        }
    }

    public static PlayerState reverseAction1(String user_name, Hero player) {

        int experiencePoints = player.getMembers().get(user_name).get("Experience Points");
        int fightingPoints = player.getMembers().get(user_name).get("Fighting Points");
        int weaponPoints = player.getMembers().get(user_name).get("Weapon Points");
        Map<String, Integer> treasurePoints = player.getTreasureBox().get(user_name);

        // display initial points
        System.out.println("F point :" + experiencePoints);
        System.out.println("E point :" + fightingPoints);
        System.out.println("W point :" + weaponPoints);
        System.out.println("Treasure :" + treasurePoints);

        return new PlayerState(experiencePoints, fightingPoints, weaponPoints, treasurePoints);
    }

    public static void reverseAction2(String user_name, PlayerState originalState, Hero player) {


        // Restore the old points
        player.getMembers().get(user_name).put("Experience Points", originalState.experiencePoints);
        player.getMembers().get(user_name).put("Fighting Points", originalState.fightingPoints);
        player.getMembers().get(user_name).put("Weapon Points", originalState.weaponPoints);
        player.getTreasureBox().get(user_name).putAll(originalState.treasurePoints);

        int experiencePoints = player.getMembers().get(user_name).get("Experience Points");
        int fightingPoints = player.getMembers().get(user_name).get("Fighting Points");
        int weaponPoints = player.getMembers().get(user_name).get("Weapon Points");
        Map<String, Integer> treasurePoints = player.getTreasureBox().get(user_name);

        // display restored points
        System.out.println("new F point :" + experiencePoints);
        System.out.println("new E point :" + fightingPoints);
        System.out.println("new W point :" + weaponPoints);
        System.out.println("new Treasure :" + treasurePoints);
    }

}

