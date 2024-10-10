package com.felipem.projeto_spring.repositories;

import com.felipem.projeto_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
