package com.admin.ec3jaimettitocita.repository;

import com.admin.ec3jaimettitocita.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {
    UsuarioCliente findByUsuario(String usuario);
}
