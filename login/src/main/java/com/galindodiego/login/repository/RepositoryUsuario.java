package com.galindodiego.login.repository;

import com.galindodiego.login.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario,Long> {
}
