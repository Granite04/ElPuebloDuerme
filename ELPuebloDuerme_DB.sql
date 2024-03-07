DROP DATABASE IF EXISTS ElPuebloDuerme_DB;

CREATE DATABASE IF NOT EXISTS ElPuebloDuerme_DB
COLLATE utf8mb4_spanish_ci;

USE ElPuebloDuerme_DB;

CREATE TABLE JUGADOR (
    idJugador VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(20) UNIQUE,
    nivel INT,
    partidas_jugadas INT,
    victorias INT,
    derrotas INT,
    partidas_asesino INT,
    partidas_pueblo INT
);


CREATE TABLE Partida (
    idPartida VARCHAR(10),
    idJugador VARCHAR(10),
    esAsesino TINYINT,
    numRondas INT,
    estadoFinal VARCHAR(20),
    fecha TIMESTAMP,
    duracion TIME
);



CREATE TABLE Amigos (
    idAmistad VARCHAR(10) PRIMARY KEY,
    idJugador1 VARCHAR(10),
    idJugador2 VARCHAR(10),
    estado ENUM('pendiente', 'aceptada', 'rechazada'),
    FOREIGN KEY (idJugador1) REFERENCES JUGADOR(idJugador),
    FOREIGN KEY (idJugador2) REFERENCES JUGADOR(idJugador)
);

CREATE TABLE Cartas (
    idRol VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(50),
    descripcion TEXT,
    habilidad TEXT
);

CREATE TABLE Logros (
    idLogro VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(50),
    descripcion TEXT
);
