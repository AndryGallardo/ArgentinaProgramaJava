package dao;

import modelo.Usuario;

import java.util.List;

public interface UsuarioDAO {
    List<Usuario> obtenerTodos();
    void eliminar(int id);
    void actualizar(Usuario usuario);
}
