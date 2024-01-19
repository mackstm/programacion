package ies.puerto.ejercicio1.impl;

import ies.puerto.ejercicio1.interfaz.IPlayer;

/**
 * MP3 player class that implements player interface
 * @author Jose Maximiliano Boada Martin
 */
public class Mp3Player implements IPlayer {

    /**
     * Overrides play method from interface
     * @return confirmation that mp3 is playing
     */
    @Override
    public String play() {
        return "Playing mp3...";
    }

    /**
     * Overrides stop method from interface
     * @return confirmation that mp3 is stopping
     */
    @Override
    public String stop() {
        return "Stopping mp3...";
    }


}
