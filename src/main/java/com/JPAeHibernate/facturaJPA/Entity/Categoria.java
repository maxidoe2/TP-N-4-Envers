package com.JPAeHibernate.facturaJPA.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Categoria")
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denominacion;

    @ManyToMany(mappedBy = "categorias")
    @EqualsAndHashCode.Exclude  // Evita la recursión en equals() y hashCode()
    @ToString.Exclude // Evita la recursión en toString()
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

}
