package com.grupo3m.crudSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo3m.crudSpring.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
