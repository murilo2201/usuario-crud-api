package com.murilo.sistema_usuarios.repository;

import com.murilo.sistema_usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
}
