package com.felipem.projeto_spring.repositories;

import com.felipem.projeto_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
