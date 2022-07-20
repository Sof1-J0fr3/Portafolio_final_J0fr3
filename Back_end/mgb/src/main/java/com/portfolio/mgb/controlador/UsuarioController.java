package com.portfolio.mgb.controlador;

import com.portfolio.mgb.entidad.Usuario;
import com.portfolio.mgb.interfaz.InUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins="http://localhost:4200")

public class UsuarioController {
    @Autowired InUsuarioService inUsuarioService; 
    
    @GetMapping("Usuarios/Traer")
    public List <Usuario> getUsuario(){
        return inUsuarioService.getUsuario();
    }
   @PostMapping("/Usuarios/Crear")
   public String createUsuario(@RequestBody Usuario usuario){
       inUsuarioService.saveUsuario(usuario);
       return "Usuario Creado";
   }
   @DeleteMapping("/Usuario/Eliminar/(id)")
   public String deleteUsuario(@PathVariable Long id){
       inUsuarioService.deleteUsuario(id);
       return "Usuario Eliminado";
   }
   @PutMapping("/Usuario/Editar(id)")
   public Usuario editUsuario(@PathVariable Long id,
           @RequestParam("nombre") String NombreActualizado,
           @RequestParam("apellido") String ApellidoActualizado,
           @RequestParam("img") String ImgActualizada)
   {
               Usuario usuario=inUsuarioService.findUsuario(id);
               
               usuario.setNombre(NombreActualizado);
               usuario.setApellido(ApellidoActualizado);
               usuario.setImg(ImgActualizada);
               
               inUsuarioService.saveUsuario(usuario);
               return usuario;
            
   }

@GetMapping("/Usuarios/traer/perfil")
public Usuario findUsuario(){
    return inUsuarioService.findUsuario((long)1);
}
}

