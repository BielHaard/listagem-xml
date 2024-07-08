package com.listagem.xml.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
