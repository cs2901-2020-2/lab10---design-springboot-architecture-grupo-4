package data.repositories;

import data.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findUsuarioByEmailAndPassword(String email, String password);
    Usuario findUsuarioByEmail(String email);
}
