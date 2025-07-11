package com.loja.e_commerce.domain.repository;

import com.loja.e_commerce.infra.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Long, Cliente> {
}
