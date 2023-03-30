import modelo.Alumno;
import modelo.Inscripcion;
import modelo.Materia;
import util.ArchivosUtil;
import util.SimuladorBaseDatos;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class Programa {
    public static void main(String[] args) throws IOException {

        SimuladorBaseDatos.inicializarBaseDatos();

        List<Inscripcion> inscripciones = ArchivosUtil.getInscripciones();
        for (Inscripcion inscripcion : inscripciones) {
            Optional<Materia> materiaOptional = SimuladorBaseDatos.buscarMateria(inscripcion.getMateria());
            if(materiaOptional.isPresent()) {
                inscripcion.setMateria(materiaOptional.get());
            }

            Optional<Alumno> alumnoOptional = SimuladorBaseDatos.buscarAlumno(inscripcion.getAlumno());
            if(alumnoOptional.isPresent()) {
                inscripcion.setAlumno(alumnoOptional.get());
            } else {
                inscripcion.getAlumno().setLegajo(null);
            }
        }

        ArchivosUtil.grabarResultadoInscripciones(inscripciones);
    }
}
