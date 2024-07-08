package com.listagem.xml.service.impl;

import com.listagem.xml.entity.Cliente;
import com.listagem.xml.entity.Empresa;
import com.listagem.xml.entity.Endereco;
import com.listagem.xml.entity.Recibo;
import com.listagem.xml.service.ReciboService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReciboServiceImpl implements ReciboService {
    private final List<Recibo> recibos;

    public ReciboServiceImpl() {
        this.recibos = new ArrayList<>();
        recibos.add(new Recibo(1, new Empresa("Telecom XYZ Ltda", "12.345.678/0001-90", new Endereco("Avenida Principal, 123", "São Paulo", "SP", "01000-000")),
                new Cliente("João da Silva", "123.456.789-00", new Endereco("Rua Secundária, 456", "São Paulo", "SP", "02000-000")), 100.00));
        recibos.add(new Recibo(2, new Empresa("Telecom XYZ Ltda", "12.345.678/0001-90", new Endereco("Avenida Principal, 123", "São Paulo", "SP", "01000-000")),
                new Cliente("João da Silva", "123.456.789-00", new Endereco("Rua Secundária, 456", "São Paulo", "SP", "02000-000")), 110.10));
        recibos.add(new Recibo(3, new Empresa("Telecom XYZ Ltda", "12.345.678/0001-90", new Endereco("Avenida Principal, 123", "São Paulo", "SP", "01000-000")),
                new Cliente("João da Silva", "123.456.789-00", new Endereco("Rua Secundária, 456", "São Paulo", "SP", "02000-000")), 120.20));
        recibos.add(new Recibo(4, new Empresa("Telecom XYZ Ltda", "12.345.678/0001-90", new Endereco("Avenida Principal, 123", "São Paulo", "SP", "01000-000")),
                new Cliente("João da Silva", "123.456.789-00", new Endereco("Rua Secundária, 456", "São Paulo", "SP", "02000-000")), 130.30));
    }

    @Override
    public List<Recibo> getRecibos() {
        return recibos;
    }
}
