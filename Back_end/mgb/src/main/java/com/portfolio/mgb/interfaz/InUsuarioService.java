package com.portfolio.mgb.interfaz;

import com.portfolio.mgb.entidad.Usuario;
import java.util.List;

public interface InUsuarioService {
    //Lista de persona
    public List<Usuario> getUsuario();
    //Guardar objeto de usuario
    public void saveUsuario(Usuario usuario);
   //Eliminar usuario con ID
    public void deleteUsuario(Long id);
    //Buscar usuario con id
    public Usuario findUsuario(Long id);
    
}
