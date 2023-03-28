import modelo.Alumno;
import modelo.Materia;

import java.util.ArrayList;
import java.util.Collection;

public class Programa {
    public static void main(String[] args) {
        Materia matematicaI = new Materia("Matemática I");
        Materia introInformatica = new Materia("Introducción a la Informática");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia programacionI = new Materia("Programación I");
        Materia sistemasOperativos = new Materia("Sistemas Operativos");
        Materia basesDeDatos = new Materia("Bases de Datos");
        Materia programacionII = new Materia("Programación II");
        Materia redesDeComputadoras = new Materia("Redes de Computadoras");
        Materia ingenieriaSoftware = new Materia("Ingeniería de Software");
        Materia programacionWeb = new Materia("Programación Web");
        Materia desarrolloAppsMoviles = new Materia("Desarrollo de Aplicaciones Móviles");
        Materia seguridadInformatica = new Materia("Seguridad Informática");

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

        Alumno jose = new Alumno("José Rodríguez", "1245");
        jose.agregarMateriaAprobada(matematicaI);
        jose.agregarMateriaAprobada(introInformatica);
        jose.agregarMateriaAprobada(algoritmos);

        Alumno vanesa = new Alumno("Vanesa Sosa", "545");
        vanesa.agregarMateriaAprobada(algoritmos);

        Collection<Alumno> alumnos = new ArrayList<>();
        alumnos.add(jose);
        alumnos.add(vanesa);
        System.out.println("Hola!!!!");
    }
}
