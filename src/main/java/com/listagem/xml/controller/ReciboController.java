package com.listagem.xml.controller;

import com.listagem.xml.entity.Recibo;
import com.listagem.xml.entity.wrapper.RecibosWrapper;
import com.listagem.xml.service.ReciboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recibos")
public class ReciboController {

    private final ReciboService service;

    @Autowired
    public ReciboController(ReciboService service) {
        this.service = service;
    }

    @GetMapping("/json")
    public List<Recibo> getReciboJson() {
        return service.getRecibos();
    }

    @GetMapping(value = "/xml",  produces = MediaType.APPLICATION_XML_VALUE)
    public RecibosWrapper getReciboXml() {
        return new RecibosWrapper(service.getRecibos());
    }

    @GetMapping(value = "/xml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public RecibosWrapper getReciboXmlById(@PathVariable int id) {
        Recibo recibo = service.getReciboPorId(id);
        if (recibo == null) {
            throw new RuntimeException("Recibo não encontrado para o ID: " + id);
        }
        return new RecibosWrapper(List.of(recibo));
    }
}
