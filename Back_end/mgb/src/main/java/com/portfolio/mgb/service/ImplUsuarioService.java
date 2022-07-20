package com.portfolio.mgb.service;
import com.portfolio.mgb.entidad.Usuario;
import com.portfolio.mgb.interfaz.InUsuarioService;
import com.portfolio.mgb.repositorio.InUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImplUsuarioService implements InUsuarioService
{@Autowired InUsuarioRepository inUsuarioRepository;    
    @Override
    public List<Usuario> getUsuario() {
    List<Usuario>Usuario= inUsuarioRepository.findAll();
    return Usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
    inUsuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
       inUsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
       Usuario usuario = inUsuarioRepository.findById(id).orElse(null);
               return usuario;
               
    }
    
    
}
