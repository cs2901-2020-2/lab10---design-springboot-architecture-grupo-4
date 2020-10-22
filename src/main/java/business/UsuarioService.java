package business;

import data.entities.Usuario;
import data.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.reflect.AccessibleObject;

import java.util.List;
import java.util.Optional;
import java.lang.reflect.Field;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return (List<Usuario>) repository.findAll();
    }

    public Usuario findOne(Long codigo){
        return repository.findById(codigo).orElseThrow();
    }

    public Usuario create(Usuario newUsuario){
        return repository.save(newUsuario);
    }

    public Usuario update(Usuario usuarioUpdate, Long codigo){
        Optional<Usuario> foundUser = repository.findById(codigo);
        if(foundUser.isPresent()) {
            Usuario usuario = foundUser.get();
            return updatePresentUser(usuarioUpdate, usuario);
        } else {
            usuarioUpdate.setCodigo(codigo);
            return repository.save(usuarioUpdate);
        }
    }

    public Usuario updatePresentUser(Usuario fromUsuario, Usuario toUsuario) {
        Field[] fromFields = fromUsuario.getClass().getDeclaredFields();
        for(Field field:fromFields) field.setAccessible(true);
        Field[] toFields = toUsuario.getClass().getDeclaredFields();
        for(Field field:toFields) field.setAccessible(true);
        if (fromFields != null && toFields != null) {
            for (Field toField : toFields) {
                try {
                    Field fromField = fromUsuario.getClass().getDeclaredField(toField.getName());
                    for(Field field:fromFields) field.setAccessible(true);
                    if (fromField != null && fromField.get(fromUsuario) != null) {
                        toField.set(toUsuario, fromField);
                    }
                } catch (Exception e) {
                     e.printStackTrace();
                }
            }
        }
        return repository.save(toUsuario);
    }

    public Usuario findOneByEmail(String email){
        Usuario user = findOneByEmail(email);
        return user;
    }

    public void deleteById(Long codigo){
        repository.deleteById(codigo);
    }



}
