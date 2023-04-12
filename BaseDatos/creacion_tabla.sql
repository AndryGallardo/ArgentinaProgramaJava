CREATE TABLE usuario (
     id INT NOT NULL AUTO_INCREMENT,
     nombre VARCHAR(50),
     apellido VARCHAR(50),
     email VARCHAR(100),
     PRIMARY KEY (id)
);

INSERT INTO usuario (nombre, apellido, email) VALUES ('Juan', 'Pérez', 'juan.perez@gmail.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('María', 'González', 'maria.gonzalez@hotmail.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Pedro', 'Martínez', 'pedro.martinez@yahoo.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Ana', 'López', 'ana.lopez@gmail.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Carlos', 'Ruiz', 'carlos.ruiz@hotmail.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Laura', 'Hernández', 'laura.hernandez@yahoo.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Luis', 'García', 'luis.garcia@gmail.com');
INSERT INTO usuario (nombre, apellido, email) VALUES ('Sofía', 'Sánchez', 'sofia.sanchez@hotmail.com');