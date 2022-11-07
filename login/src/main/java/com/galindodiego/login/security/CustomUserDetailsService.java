package com.galindodiego.login.security;

import com.galindodiego.login.entity.Usuario;
import com.galindodiego.login.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private RepositoryUsuario repositoryUsuario;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repositoryUsuario.findByEmail(email);
        if(usuario==null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return new CustomUserDetails(usuario);
    }
}
