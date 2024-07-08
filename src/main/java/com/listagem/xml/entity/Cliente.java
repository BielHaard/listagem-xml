package com.listagem.xml.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
}
