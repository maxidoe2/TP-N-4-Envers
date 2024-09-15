package com.JPAeHibernate.facturaJPA.Controller;

import com.JPAeHibernate.facturaJPA.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/crearFactura")
    public String crearFactura() {
        facturaService.crearFactura();
        return "Factura creada";
    }
}
