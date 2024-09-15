package com.JPAeHibernate.facturaJPA.Repository;

import com.JPAeHibernate.facturaJPA.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
