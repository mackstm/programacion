CREATE TABLE IF NOT EXISTS Personaje (
    personajeId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nombre TEXT NOT NULL,
    alias TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Poder (
    poderId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    personajeId INTEGER NOT NULL,
    poder TEXT NOT NULL,
    FOREIGN KEY(personajeId) REFERENCES Personajes(personajeId)
);

INSERT INTO Personaje (nombre, alias, genero) VALUES
    ('Iron Man', 'Tony Stark', 'Masculino'),
    ('Spider-Man', 'Peter Parker', 'Masculino');

INSERT INTO Poder (personajeId, poder) VALUES
    (1, 'Vuelo'),
    (1, 'Armadura tecnologica avanzada'),
    (1, 'Rayos laser'),
    (2, 'Agilidad sobrehumana'),
    (2, 'Trepamuros'),
    (2, 'Sentido aracnido');
