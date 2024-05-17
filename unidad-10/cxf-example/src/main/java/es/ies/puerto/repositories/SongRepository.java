package es.ies.puerto.repositories;

import es.ies.puerto.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {
    private List<Song> songs;

    public SongRepository() {
        songs = new ArrayList<>();
        songs.add(new Song("1", "Karma Police","4.00"));
        songs.add(new Song("2", "Pepe Benavente","10.00"));
        songs.add(new Song("3", "Entierra La Luz","9.00"));
    }
    public Song getSongById(String id) {
        return songs.get(Integer.parseInt(id));
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void saveSong(Song song) {
        if (songs.contains(song)) {

        }
        songs.add(song);
    }
}
