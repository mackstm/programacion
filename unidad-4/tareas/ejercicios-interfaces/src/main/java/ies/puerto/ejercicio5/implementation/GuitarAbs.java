package ies.puerto.ejercicio5.implementation;

import ies.puerto.ejercicio5.abstractas.MusicalInstrumentAbstract;

/**
 * MP3 player class that implements player abstract class
 * @author Jose Maximiliano Boada Martin
 */
public class GuitarAbs extends MusicalInstrumentAbstract {

    public String changeString() {
        return "Changing guitar strings...";
    }

    /**
     * Overrides play note method from abstract class
     * @return confirmation that mp3 is playing
     */
    @Override
    public String playNote(String note) {
        return "Playing note: " + note;
    }

    /**
     * Overrides tune method from abstract class
     * @return confirmation that mp3 is stopping
     */
    @Override
    public String tune() {
        return "Tuning guitar...";
    }
}
