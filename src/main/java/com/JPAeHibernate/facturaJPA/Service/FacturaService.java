package com.JPAeHibernate.facturaJPA.Service;

import com.JPAeHibernate.facturaJPA.Entity.*;
import com.JPAeHibernate.facturaJPA.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaService {
    @Autowired
    private ArticuloRepository articuloRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Autowired
    private FacturaRepository facturaRepository;

    @Transactional
    public void crearFactura() {

        Categoria metanfetamina = Categoria.builder()
                .denominacion("Metanfetamina")
                .build();

        Categoria quimica = Categoria.builder()
                .denominacion("Química")
                .build();

        Categoria equipo = Categoria.builder()
                .denominacion("Equipo de Laboratorio")
                .build();

        Articulo blueMeth = Articulo.builder()
                .cantidad(1)
                .denominacion("Blue Meth")
                .precio(100000)
                .build();

        Articulo reactivo = Articulo.builder()
                .cantidad(5)
                .denominacion("Reactivo químico")
                .precio(2000)
                .build();

        Articulo matraz = Articulo.builder()
                .cantidad(2)
                .denominacion("Matraz Erlenmeyer")
                .precio(500)
                .build();

        blueMeth.getCategorias().add(metanfetamina);
        blueMeth.getCategorias().add(quimica);

        quimica.getArticulos().add(blueMeth);
        metanfetamina.getArticulos().add(blueMeth);
        reactivo.getCategorias().add(quimica);
        quimica.getArticulos().add(reactivo);
        matraz.getCategorias().add(equipo);
        equipo.getArticulos().add(matraz);

        Factura fac1 = Factura.builder()
                .fecha("13/09/2024")
                .numero(40)
                .build();

        Cliente cliente = Cliente.builder()
                .apellido("White")
                .dni(50505050)
                .nombre("Walter")
                .build();

        Domicilio domicilio = Domicilio.builder()
                .nombreCalle("Calle de la Rosa")
                .numero(123)
                .build();

        cliente.setDomicilio(domicilio);

        fac1.setCliente(cliente);

        DetalleFactura linea1 = new DetalleFactura();
        linea1.setArticulo(blueMeth);
        linea1.setCantidad(1);
        linea1.setSubtotal(100000);
        fac1.getFacturas().add(linea1);

        DetalleFactura linea2 = new DetalleFactura();
        linea2.setArticulo(reactivo);
        linea2.setCantidad(3);
        linea2.setSubtotal(6000);
        fac1.getFacturas().add(linea2);

        DetalleFactura linea3 = new DetalleFactura();
        linea3.setArticulo(matraz);
        linea3.setCantidad(1);
        linea3.setSubtotal(500);
        fac1.getFacturas().add(linea3);

        categoriaRepository.save(metanfetamina);
        categoriaRepository.save(quimica);
        categoriaRepository.save(equipo);
        articuloRepository.save(blueMeth);
        articuloRepository.save(reactivo);
        articuloRepository.save(matraz);
        domicilioRepository.save(domicilio);
        clienteRepository.save(cliente);
        facturaRepository.save(fac1);
        detalleFacturaRepository.save(linea1);
        detalleFacturaRepository.save(linea2);
        detalleFacturaRepository.save(linea3);
    }

}
}
