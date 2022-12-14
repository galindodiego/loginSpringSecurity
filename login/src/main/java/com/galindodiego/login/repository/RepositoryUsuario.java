package com.galindodiego.login.repository;

import com.galindodiego.login.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryUsuario extends JpaRepository<Usuario,Long> {

    @Query("SELECT u FROM Usuario u WHERE u.email = ?1")
   public Usuario findByEmail(String email);
}
