package com.JPAeHibernate.facturaJPA.Repository;

import com.JPAeHibernate.facturaJPA.Entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long>{
}
