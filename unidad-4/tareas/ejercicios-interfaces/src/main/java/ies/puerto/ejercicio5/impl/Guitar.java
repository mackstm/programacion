package ies.puerto.ejercicio5.impl;

import ies.puerto.ejercicio5.interfaz.IMusicalInstrument;

/**
 * MP3 player class that implements player interface
 * @author Jose Maximiliano Boada Martin
 */
public class Guitar implements IMusicalInstrument {

    public String changeString() {
        return "Changing guitar strings...";
    }

    /**
     * Overrides play note method from interface
     * @return confirmation that mp3 is playing
     */
    @Override
    public String playNote(String note) {
        return "Playing note: " + note;
    }

    /**
     * Overrides tune method from interface
     * @return confirmation that mp3 is stopping
     */
    @Override
    public String tune() {
        return "Tuning guitar...";
    }
}
