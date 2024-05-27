package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("artistRepositoryV2")
public class ArtistRepositoryV2 {
    private ArtistRepository artistRepository;

    public ArtistRepositoryV2() {}

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAll() {
        return artistRepository.getAll();
    }

    public Artist getById(String id) {
        return artistRepository.getById(id);
    }
}
