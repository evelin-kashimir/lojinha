package com.loja.e_commerce.domain.repository;

import com.loja.e_commerce.domain.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<Long, NotaFiscal> {
}
