package controller;

import business.UsuarioService;
import data.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {
    static final String CLIENT_URL = "*";

    @Autowired
    private UsuarioService service;

    @GetMapping
    @CrossOrigin(origins = CLIENT_URL)
    public List<Usuario> readAll() { return service.findAll(); }

    @PostMapping
    @CrossOrigin(origins = CLIENT_URL)
    public Usuario newUsuario(@RequestBody Usuario newUsuario) { return service.create(newUsuario); }

    @GetMapping("/{id}")
    @CrossOrigin(origins = CLIENT_URL)
    public Usuario one(@PathVariable Long id) { return service.findOne(id);}

    @PutMapping("/{id}")
    @CrossOrigin(origins = CLIENT_URL)
    public Usuario replaceUsuario(@RequestBody Usuario newUsuario, @PathVariable Long id) { return service.update(newUsuario, id); }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = CLIENT_URL)
    public void deleteUsuario(@PathVariable Long id) { service.deleteById(id); }
}