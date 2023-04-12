import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import modelo.Usuario;

import java.util.List;

public class MiPrograma {
    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

        List<Usuario> usuarios = usuarioDAO.obtenerTodos();

        if(usuarios.size() > 0) {
            Usuario usuario = usuarios.get(1);
            usuario.setNombre("Lucía");
            usuario.setEmail("lucia.gonzalez@gmail.com");
            usuarioDAO.actualizar(usuario);

            Usuario otroUsuario = usuarios.get(3);
            usuarioDAO.eliminar(otroUsuario.getId());
        }

    }
}
