package com.Cliente.api.Cliente.repository;

import com.Cliente.api.Cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
        @Modifying
        @Query("UPDATE Cliente c SET c.nome = :nome, c.email = :email WHERE c.id = :id")
        void update (@Param("id") Long id, @Param("nome") String nome, @Param("email") String email);
}
