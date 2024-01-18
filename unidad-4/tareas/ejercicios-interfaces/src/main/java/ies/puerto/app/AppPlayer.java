package ies.puerto.app;

import ies.puerto.impl.Mp3Player;

public class AppPlayer {
    static Mp3Player mp3Player;
    public static void main(String[] args) {
        mp3Player = new Mp3Player();
        System.out.println(mp3Player.play());
        System.out.println(mp3Player.stop());
    }
}
