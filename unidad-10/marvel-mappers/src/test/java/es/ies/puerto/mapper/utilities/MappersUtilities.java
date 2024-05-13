package es.ies.puerto.mapper.utilities;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MappersUtilities {
    public static final String ERR_MSG = "Unexpected result";
    public static final String MY_ID = "1A";
    public static final String MY_NAME = "Nombre";
    public Personaje personajeEntity;
    public PersonajeDTO personajeDTO;

    public Alias aliasEntity;
    public AliasDTO aliasDTO;

    public Equipamiento equipamientoEntity;
    public EquipamientoDTO equipamientoDTO;

    public Poder poderEntity;
    public PoderDTO poderDTO;

    @BeforeEach
    public void beforeEach() {
        poderEntity = new Poder(MY_ID, MY_NAME);
        poderDTO = new PoderDTO(MY_ID, MY_NAME);

        equipamientoEntity = new Equipamiento(MY_ID, MY_NAME, MY_NAME, MY_ID);
        equipamientoDTO = new EquipamientoDTO(MY_ID, MY_NAME, MY_NAME, MY_ID);

        aliasEntity = new Alias(MY_ID, MY_NAME, MY_ID);
        aliasDTO = new AliasDTO(MY_ID, MY_NAME, MY_ID);

        personajeEntity = new Personaje(MY_ID, MY_NAME, MY_NAME, aliasEntity,
                new HashSet<>(List.of(equipamientoEntity)), new HashSet<>(List.of(poderEntity)));
        personajeDTO = new PersonajeDTO(MY_ID, MY_NAME, MY_NAME, aliasDTO,
                new HashSet<>(List.of(equipamientoDTO)), new HashSet<>(List.of(poderDTO)));
    }

}
