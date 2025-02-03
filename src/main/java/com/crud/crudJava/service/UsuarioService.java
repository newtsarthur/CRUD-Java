package com.crud.crudJava.service;

import com.crud.crudJava.model.Usuario;
import com.crud.crudJava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public boolean validateUser(String nome, String senha) {
        Optional<Usuario> usuario = repository.findByNome(nome); // Certifique-se de ter esse método no repositório

        return usuario.isPresent() && usuario.get().getSenha().equals(senha);
    }
}
