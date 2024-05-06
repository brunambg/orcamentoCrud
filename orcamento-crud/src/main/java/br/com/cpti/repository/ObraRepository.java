package br.com.cpti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.entity.Obra;

public interface ObraRepository extends JpaRepository<Obra, Long>{
}
