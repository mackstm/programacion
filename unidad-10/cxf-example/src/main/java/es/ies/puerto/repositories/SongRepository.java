package es.ies.puerto.repositories;

import es.ies.puerto.model.Song;

public class SongRepository {
    public Song getSongById(String id) {
        return new Song(id, "Karma Police","4.00");
    }
}
