package com.admin.ec3jaimettitocita.repository;

import com.admin.ec3jaimettitocita.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
