package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Materia {
    private String nombre;
    private Collection<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public boolean puedeCursar(Alumno alumno) {
        boolean puedeCursar = false;
        if(alumno.getMateriasAprobadas().containsAll(correlativas)) {
               puedeCursar = true;
        }
        return puedeCursar;
    }

    public void agregarCorrelativa(Materia correlativa) {
        correlativas.add(correlativa);
    }
}
