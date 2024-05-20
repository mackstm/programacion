package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.ws.rs.core.Response;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SongServiceTest {

    public static final String ERR_MSG = "Unexpected Result";
    SongService songService;

    @Mock
    SongRepository songRepositoryMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        songService = new SongService();
        songService.setSongRepository(songRepositoryMock);
    }

    @Test
    void getAllTest() {
        when(songRepositoryMock.getSongs()).thenReturn(new ArrayList<>());
        Response response = songService.getSongs();
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneOkTest() {
        when(songRepositoryMock.getSongById(anyString())).thenReturn(new Song());
        Response response = songService.getSongById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneNotFoundTest() {
        when(songRepositoryMock.getSongById(anyString())).thenReturn(null);
        Response response = songService.getSongById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }

    @Test
    void saveSongTest() {
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(true);
        Response response = songService.addSong(new Song());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(201, response.getStatus(), ERR_MSG);
    }

    @Test
    void saveSongDupeTest() {
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(false);
        Response response = songService.addSong(new Song());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(304, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneOkTest() {
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(true);
        Response response = songService.deleteSongById("uf");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(204, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneErrorTest() {
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(false);
        Response response = songService.deleteSongById("uf");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }
}
