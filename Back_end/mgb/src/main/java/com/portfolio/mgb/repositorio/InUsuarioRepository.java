package com.portfolio.mgb.repositorio;

import com.portfolio.mgb.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InUsuarioRepository extends JpaRepository<Usuario,Long>{
}
