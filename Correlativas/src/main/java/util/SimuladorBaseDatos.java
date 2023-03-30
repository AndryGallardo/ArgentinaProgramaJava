package util;

import modelo.Alumno;
import modelo.Materia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class SimuladorBaseDatos {
    static Collection<Alumno> alumnos = new ArrayList<>();
    static List<Materia> materias = new ArrayList<>();
    static Materia matematicaI = new Materia("Matemática I");
    static Materia introInformatica = new Materia("Introducción a la Informática");
    static Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
    static Materia programacionI = new Materia("Programación I");
    static Materia sistemasOperativos = new Materia("Sistemas Operativos");
    static Materia basesDeDatos = new Materia("Bases de Datos");
    static Materia programacionII = new Materia("Programación II");
    static Materia redesDeComputadoras = new Materia("Redes de Computadoras");
    static Materia ingenieriaSoftware = new Materia("Ingeniería de Software");
    static Materia programacionWeb = new Materia("Programación Web");
    static Materia desarrolloAppsMoviles = new Materia("Desarrollo de Aplicaciones Móviles");
    static Materia seguridadInformatica = new Materia("Seguridad Informática");


    public static void inicializarBaseDatos() {
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

        materias.add(matematicaI);
        materias.add(introInformatica);
        materias.add(algoritmos);
        materias.add(programacionI);
        materias.add(sistemasOperativos);
        materias.add(basesDeDatos);
        materias.add(programacionII);
        materias.add(redesDeComputadoras);
        materias.add(ingenieriaSoftware);
        materias.add(programacionWeb);
        materias.add(desarrolloAppsMoviles);
        materias.add(seguridadInformatica);

        Alumno jose = new Alumno("José Rodríguez", "1245");
        jose.agregarMateriaAprobada(matematicaI);
        jose.agregarMateriaAprobada(introInformatica);
        jose.agregarMateriaAprobada(algoritmos);

        Alumno vanesa = new Alumno("Vanesa Sosa", "545");
        vanesa.agregarMateriaAprobada(algoritmos);

        alumnos.add(jose);
        alumnos.add(vanesa);
    }

    public static Optional<Materia> buscarMateria(Materia materia) {
        return materias.stream()
                .filter(mat -> mat.equals(materia))
                .findFirst();
    }

    public static Optional<Alumno> buscarAlumno(Alumno alumno) {
        return alumnos.stream()
                .filter(alum -> alum.equals(alumno))
                .findFirst();
    }
}
