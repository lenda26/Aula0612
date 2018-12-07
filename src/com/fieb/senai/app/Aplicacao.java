/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;
import com.fieb.senai.entidades.Telefone;

/**
 *
 * @author Aluno
 */
public class Aplicacao {

  
    
    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa("Maria", 468796, 30);
        Endereco end1 = new Endereco("Rua A", "25", "Ribeira");
        Telefone tel1 = new Telefone("985476998");
        // Declarando a associação.
        p1.setEndereco(end1);
        List<Telefone> listaTelefone = new ArrayList<>();
        
        Pessoa p2 = new Pessoa("Julia", 6473634, 42);
        Endereco end2 = new Endereco("Rua B", "14", "Curuzu");
        Telefone tel2 = new Telefone("985898774");
        
        // Declarando a associação.
        p2.setEndereco(end2);
        List<Telefone> listaTelefone = new ArrayList<>();
        
        Pessoa p3 = new Pessoa("Jamile", 464649, 45);
        Endereco end3 = new Endereco("Rua c", "12", "Curuzu");
        Telefone tel3 = new Telefone("984494899");
        
        // Declarando a associação.
        p3.setEndereco(end3);
        List<Telefone> listaTelefone = new ArrayList<>();
        
        
    }
    
}
