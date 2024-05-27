package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/artist")
public class ArtistServiceV1 {
    private static Logger LOG = LoggerFactory.getLogger(ArtistServiceV1.class);

    private ArtistRepository artistRepository;

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public ArtistServiceV1() {}

    @GetMapping("/")
    public List<Artist> getAll() {
        return artistRepository.getAll();
    }
}
