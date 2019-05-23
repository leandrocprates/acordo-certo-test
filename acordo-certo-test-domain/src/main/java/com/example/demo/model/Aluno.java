/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.example.demo.ennum.Pais;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author lprates
 */

@Entity
@Data
public class Aluno {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private Long id;
    private String nome;
    private String endereco;
    @Enumerated(EnumType.STRING)
    private Pais pais; 
    private Boolean habilitado;
    


    
}
