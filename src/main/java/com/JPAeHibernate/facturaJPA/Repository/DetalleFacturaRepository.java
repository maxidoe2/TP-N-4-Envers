package com.JPAeHibernate.facturaJPA.Repository;

import com.JPAeHibernate.facturaJPA.Entity.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {
}
