CREATE TABLE IF NOT EXISTS Personaje (
    personajeId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nombre TEXT NOT NULL,
    alias TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Poder (
    poderId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    poder TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS PersonajePoder (
    personajeId INTEGER NOT NULL,
    poderId INTEGER NOT NULL,
    FOREIGN KEY(personajeId) REFERENCES Personaje(personajeId),
    FOREIGN KEY(poderId) REFERENCES Poder(poderId),
    PRIMARY KEY(personajeId, poderId)
);

INSERT INTO Personaje (nombre, alias, genero) VALUES
    ('Iron Man', 'Tony Stark', 'Masculino'),
    ('Spider-Man', 'Peter Parker', 'Masculino');

INSERT INTO Poder (poder) VALUES
    ('Vuelo'),
    ('Armadura tecnologica avanzada'),
    ('Rayos laser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido aracnido');

INSERT INTO PersonajePoder VALUES
(1, 1), (1, 2), (1, 3),
(2, 4), (2, 5), (2, 6);