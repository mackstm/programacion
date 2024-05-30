package es.ies.puerto.services.springboot;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.classic.MapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.mapstruct.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/marvel")
public class PersonajeServiceSpring {
    private static Logger LOG = LoggerFactory.getLogger(PersonajeServiceSpring.class);
    private DaoPersonaje daoPersonaje;

    public PersonajeServiceSpring() {}

    @Autowired
    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GetMapping("/{id}")
    public PersonajeDTO getSongById(@PathVariable(name = "id") final String id) throws MarvelException {
        return MapperPersonaje.personajeToPersonajeDTO(daoPersonaje.findPersonaje(id));
    }

    @GetMapping("/")
    public List<PersonajeDTO> getPersonajes() throws MarvelException {
        Set<Personaje> personajes = daoPersonaje.findAllPersonaje();
        List<PersonajeDTO> personajeDTOList = new ArrayList<>();
        for (Personaje personaje : personajes) {
            personajeDTOList.add(MapperPersonaje.personajeToPersonajeDTO(personaje));
        }
        return personajeDTOList;
    }

    @PostMapping
    //@PatchMapping
    public void addPersonaje(@RequestBody final PersonajeDTO personajeDTO) throws MarvelException {
        daoPersonaje.updatePersonaje(MapperPersonaje.personajeDTOToPersonaje(personajeDTO));
    }


    @DeleteMapping("/{id}")
    public void deletePersonajeById(@PathVariable(name = "id") final String id) throws MarvelException {
        PersonajeDTO personajeDTO = new PersonajeDTO(id);
        daoPersonaje.deletePersonaje(MapperPersonaje.personajeDTOToPersonaje(personajeDTO));
    }
}
