package ies.puerto.impl;

import ies.puerto.interfaz.IPlayer;

/**
 * MP3 player class that implements player interface
 * @author Jose Maximiliano Boada Martin
 */
public class Mp3Player implements IPlayer {
    @Override
    public String play() {
        return "Playing mp3...";
    }

    @Override
    public String stop() {
        return "Stopping mp3...";
    }


}
