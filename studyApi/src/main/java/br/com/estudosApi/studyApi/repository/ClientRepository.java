package br.com.estudosApi.studyApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudosApi.studyApi.model.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long>{
 
}
