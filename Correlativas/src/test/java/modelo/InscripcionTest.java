package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia matematicaI;
    Materia introInformatica;
    Materia algoritmos;
    Materia programacionI;
    Materia sistemasOperativos;
    Materia basesDeDatos;
    Materia programacionII;
    Materia redesDeComputadoras;
    Materia ingenieriaSoftware;
    Materia programacionWeb;
    Materia desarrolloAppsMoviles;
    Materia seguridadInformatica;

    @BeforeEach
    void setup() {
        matematicaI = new Materia("Matemática I");
        introInformatica = new Materia("Introducción a la Informática");
        algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        programacionI = new Materia("Programación I");
        sistemasOperativos = new Materia("Sistemas Operativos");
        basesDeDatos = new Materia("Bases de Datos");
        programacionII = new Materia("Programación II");
        redesDeComputadoras = new Materia("Redes de Computadoras");
        ingenieriaSoftware = new Materia("Ingeniería de Software");
        programacionWeb = new Materia("Programación Web");
        desarrolloAppsMoviles = new Materia("Desarrollo de Aplicaciones Móviles");
        seguridadInformatica = new Materia("Seguridad Informática");


        // Agregando las materias correlativas
        algoritmos.agregarCorrelativa(matematicaI);
        algoritmos.agregarCorrelativa(introInformatica);

        programacionI.agregarCorrelativa(algoritmos);

        sistemasOperativos.agregarCorrelativa(algoritmos);
        sistemasOperativos.agregarCorrelativa(programacionI);

        basesDeDatos.agregarCorrelativa(algoritmos);
        basesDeDatos.agregarCorrelativa(programacionI);

        programacionII.agregarCorrelativa(programacionI);
        programacionII.agregarCorrelativa(sistemasOperativos);

        redesDeComputadoras.agregarCorrelativa(sistemasOperativos);

        ingenieriaSoftware.agregarCorrelativa(programacionI);
        ingenieriaSoftware.agregarCorrelativa(basesDeDatos);

        programacionWeb.agregarCorrelativa(programacionII);
        programacionWeb.agregarCorrelativa(basesDeDatos);

        desarrolloAppsMoviles.agregarCorrelativa(programacionII);
        desarrolloAppsMoviles.agregarCorrelativa(basesDeDatos);

        seguridadInformatica.agregarCorrelativa(redesDeComputadoras);
        seguridadInformatica.agregarCorrelativa(ingenieriaSoftware);
    }

    @Test
    void aprobadoSinCorrelativas() {
        Alumno alumno = new Alumno("Juan", "1255");
        Inscripcion inscripcion = new Inscripcion(alumno, matematicaI);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void noAprobadoSinCorrelativas() {
        Alumno alumno = new Alumno("Juan", "1255");
        Inscripcion inscripcion = new Inscripcion(alumno, algoritmos);
        assertFalse(inscripcion.aprobada());
    }

    @Test
    void aprobadoConCorrelativas() {
        Alumno alumno = new Alumno("Juan", "1255");
        alumno.agregarMateriaAprobada(matematicaI);
        alumno.agregarMateriaAprobada(introInformatica);

        Inscripcion inscripcion = new Inscripcion(alumno, algoritmos);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void noAprobadoConCorrelativas() {
        Alumno alumno = new Alumno("Juan", "1255");
        alumno.agregarMateriaAprobada(matematicaI);
        alumno.agregarMateriaAprobada(introInformatica);

        Inscripcion inscripcion = new Inscripcion(alumno, programacionI);
        assertFalse(inscripcion.aprobada());
    }

    @Test
    void noAprobadoConCorrelativas2() {
        Alumno alumno = new Alumno("Juan", "1255");
        alumno.agregarMateriaAprobada(matematicaI);
        alumno.agregarMateriaAprobada(introInformatica);
        alumno.agregarMateriaAprobada(algoritmos);

        Inscripcion inscripcion = new Inscripcion(alumno, sistemasOperativos);
        assertFalse(inscripcion.aprobada());
    }
}