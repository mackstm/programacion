package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperPersonaje {
    public static PersonajeDTO personajeToPersonajeDTO(Personaje personaje) {
        if (personaje == null) {
            return null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setGenero(personaje.getGenero());
        personajeDTO.setAlias(MapperAlias.aliasToAliasDTO(personaje.getAlias()));

        for (Equipamiento equipamiento : personaje.getEquipamientos()) {
            personajeDTO.getEquipamientos().add(MapperEquipamiento.equipamientoToEquipamientoDTO(equipamiento));
        }

        for (Poder poder : personaje.getPoderes()) {
            personajeDTO.getPoderes().add(MapperPoder.poderToPoderDTO(poder));
        }

        return personajeDTO;
    }

    public static Personaje personajeDTOToPersonaje(PersonajeDTO personajeDTO) {
        if (personajeDTO == null) {
            return null;
        }
        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setGenero(personajeDTO.getGenero());
        personaje.setAlias(MapperAlias.aliasDTOToAlias(personajeDTO.getAlias()));

        for (EquipamientoDTO equipamiento : personajeDTO.getEquipamientos()) {
            personaje.getEquipamientos().add(MapperEquipamiento.equipamientoDTOToEquipamiento(equipamiento));
        }

        for (PoderDTO poder : personajeDTO.getPoderes()) {
            personaje.getPoderes().add(MapperPoder.poderDTOToPoder(poder));
        }

        return personaje;
    }
}
