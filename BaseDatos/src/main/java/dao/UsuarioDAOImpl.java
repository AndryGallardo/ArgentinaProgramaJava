package dao;

import modelo.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl extends DAO implements UsuarioDAO {

    private static final String ELIMINAR = "DELETE FROM usuario WHERE id=";
    private static final String OBTENER_TODOS = "SELECT * FROM usuario ORDER BY id";
    private static final String ACTUALIZAR = "UPDATE usuario SET nombre='%s', apellido='%s', email='%s' WHERE id=%d";

    @Override
    public List<Usuario> obtenerTodos() {
        List<Usuario> usuarios = new ArrayList<>();

        try {
            ResultSet resultSet = ejecutarConsulta(OBTENER_TODOS);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                String apellido = resultSet.getString("apellido");
                Usuario usr = new Usuario(id, nombre, apellido, email);
                usuarios.add(usr);
            }
            desconectar();
        } catch (SQLException e) {
            System.out.println("Error al obtener los usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    @Override
    public void eliminar(int id) {
        try {
            ejecutarActualizacion((ELIMINAR + id));
            desconectar();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el usuario: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(Usuario usuario) {
        String sentenciaActualizacion = String.format(ACTUALIZAR, usuario.getNombre(), usuario.getApellido(),
                usuario.getEmail(), usuario.getId());
        try {
            ejecutarActualizacion(sentenciaActualizacion);
            desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el usuario: " + e.getMessage());
        }
    }
}
