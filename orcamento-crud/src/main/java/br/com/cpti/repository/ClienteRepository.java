package br.com.cpti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
