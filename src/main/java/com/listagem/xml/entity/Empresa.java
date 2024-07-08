package com.listagem.xml.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Empresa {
    private String nome;
    private String cnpj;
    private Endereco endereco;
}
