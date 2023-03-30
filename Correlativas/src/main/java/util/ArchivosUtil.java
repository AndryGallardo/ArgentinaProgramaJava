package util;

import modelo.Alumno;
import modelo.Inscripcion;
import modelo.Materia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArchivosUtil {
    private static  final String ARCHIVO_INSCRIPCIONES = "/Users/jandres/Downloads/inscripciones.csv";
    private static  final String ARCHIVO_INSCRIPCIONES_RESULTADO = "/Users/jandres/Downloads/inscripciones_resultado.csv";

    public static List<Inscripcion> getInscripciones() throws IOException {
        List<Inscripcion> inscripciones = new ArrayList<>();
        for (String linea : Files.readAllLines(Paths.get(ARCHIVO_INSCRIPCIONES))) {
            String[] inscripcionLinea = linea.split(",");
            Alumno alumno = new Alumno(inscripcionLinea[0].trim(), "0000");
            Materia materia = new Materia(inscripcionLinea[1].trim());
            Inscripcion inscripcion = new Inscripcion(alumno, materia);
            inscripciones.add(inscripcion);
        }
        return inscripciones;
    }

    public static void grabarResultadoInscripciones(List<Inscripcion> inscripciones) throws IOException {

        if(!existeArchivo(ARCHIVO_INSCRIPCIONES_RESULTADO)) {
            Files.createFile(Paths.get(ARCHIVO_INSCRIPCIONES_RESULTADO));
        }

        String contenido = "Alumno,Materia,Inscripción\n";
        for (Inscripcion inscripcion : inscripciones) {
            String linea = inscripcion.getAlumno().getNombre() + "," + inscripcion.getMateria().getNombre() + ",";
            if(Objects.nonNull(inscripcion.getAlumno().getLegajo())) {
                linea += (inscripcion.aprobada() ? "Aprobada" : "Rechazada");
            } else {
                linea += "No existe el/la alumno/a";
            }
            contenido += linea.concat("\n");
        }
        Files.writeString(Paths.get(ARCHIVO_INSCRIPCIONES_RESULTADO), contenido);
    }

    private static boolean existeArchivo(String path) {
        return Files.exists(Paths.get(path));
    }
}
