package com.agencia.niju.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.niju.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem,Long>{

}