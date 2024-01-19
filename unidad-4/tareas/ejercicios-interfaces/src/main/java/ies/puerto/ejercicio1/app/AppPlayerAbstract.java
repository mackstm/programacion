package ies.puerto.ejercicio1.app;

import ies.puerto.ejercicio1.abstractas.PlayerAbstract;
import ies.puerto.ejercicio1.implementation.Mp3PlayerAbs;

/**
 * Tests functionality for player abstract class and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppPlayerAbstract {
    static PlayerAbstract mp3Player;
    public static void main(String[] args) {
        mp3Player = new Mp3PlayerAbs();
        System.out.println(mp3Player.play());
        System.out.println(mp3Player.stop());
    }
}
