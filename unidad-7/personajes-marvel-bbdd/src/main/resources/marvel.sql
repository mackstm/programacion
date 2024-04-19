CREATE TABLE IF NOT EXISTS Personaje (
    personajeId INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Alias (
    aliasId INTEGER PRIMARY KEY AUTOINCREMENT,
    personajeId INTEGER NOT NULL,
    alias TEXT NOT NULL,
    FOREIGN KEY(personajeId) REFERENCES Personaje(personajeId)
);

CREATE TABLE IF NOT EXISTS Poder (
    poderId INTEGER PRIMARY KEY AUTOINCREMENT,
    poder TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS PersonajePoder (
    personajeId INTEGER,
    poderId INTEGER,
    PRIMARY KEY (personajeId, poderId),
    FOREIGN KEY(personajeId) REFERENCES Personaje(personajeId),
    FOREIGN KEY(poderId) REFERENCES Poder(poderId)
);

-- Inserción de datos
INSERT INTO Personaje (nombre, genero) VALUES
    ('Iron Man', 'Masculino'),
    ('Spider-Man', 'Masculino');

INSERT INTO Alias (personajeId, alias) VALUES
    (1, 'Tony Stark'),
    (2, 'Peter Parker');

INSERT INTO Poder (poder) VALUES
    ('Vuelo'),
    ('Armadura tecnologica avanzada'),
    ('Rayos laser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido aracnido');

INSERT INTO PersonajePoder (personajeId, poderId) VALUES
    (1, 1), -- Iron Man tiene Vuelo
    (1, 2), -- Iron Man tiene Armadura tecnológica avanzada
    (1, 3), -- Iron Man tiene Rayos láser
    (2, 4), -- Spider-Man tiene Agilidad sobrehumana
    (2, 5), -- Spider-Man tiene Trepamuros
    (2, 6); -- Spider-Man tiene Sentido arácnido