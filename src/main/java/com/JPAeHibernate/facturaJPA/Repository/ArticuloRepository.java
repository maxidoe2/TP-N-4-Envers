package com.JPAeHibernate.facturaJPA.Repository;

import com.JPAeHibernate.facturaJPA.Entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
}
