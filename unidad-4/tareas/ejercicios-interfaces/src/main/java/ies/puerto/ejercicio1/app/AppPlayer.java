package ies.puerto.ejercicio1.app;

import ies.puerto.ejercicio1.impl.Mp3Player;
import ies.puerto.ejercicio1.interfaz.IPlayer;

/**
 * Tests functionality for player interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppPlayer {
    static IPlayer mp3Player;
    public static void main(String[] args) {
        mp3Player = new Mp3Player();
        System.out.println(mp3Player.play());
        System.out.println(mp3Player.stop());
    }
}
