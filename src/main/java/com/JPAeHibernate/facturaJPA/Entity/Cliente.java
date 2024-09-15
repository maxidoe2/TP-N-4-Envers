package com.JPAeHibernate.facturaJPA.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String apellido;
    private int dni;
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;


}
