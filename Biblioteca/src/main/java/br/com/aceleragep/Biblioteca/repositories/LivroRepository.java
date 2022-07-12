package br.com.aceleragep.Biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aceleragep.Biblioteca.entities.LivroEntity;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}