package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Materia {
    private String nombre;
    private Collection<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nombre, materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
