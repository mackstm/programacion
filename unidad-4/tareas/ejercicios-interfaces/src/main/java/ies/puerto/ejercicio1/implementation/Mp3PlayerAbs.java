package ies.puerto.ejercicio1.implementation;

import ies.puerto.ejercicio1.abstractas.PlayerAbstract;

/**
 * MP3 player class that extends from player abstract class
 * @author Jose Maximiliano Boada Martin
 */
public class Mp3PlayerAbs extends PlayerAbstract {

    /**
     * Overrides play method from bstract class
     * @return confirmation that mp3 is playing
     */
    @Override
    public String play() {
        return "Playing mp3...";
    }

    /**
     * Overrides play method from abstract class
     * @return confirmation that mp3 is stopping
     */
    @Override
    public String stop() {
        return "Stopping mp3...";
    }


}
