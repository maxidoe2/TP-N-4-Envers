package com.JPAeHibernate.facturaJPA.Repository;

import com.JPAeHibernate.facturaJPA.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
