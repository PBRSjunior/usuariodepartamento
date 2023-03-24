package br.com.desenvolvedor.usuariodepartamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desenvolvedor.usuariodepartamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
