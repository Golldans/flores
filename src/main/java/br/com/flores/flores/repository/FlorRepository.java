package br.com.flores.flores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flores.flores.models.Flor;

public interface FlorRepository extends JpaRepository<Flor, Long>{
	
}
