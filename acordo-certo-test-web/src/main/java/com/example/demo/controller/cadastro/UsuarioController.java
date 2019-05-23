/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.cadastro;

import com.example.demo.model.Aluno;
import com.example.demo.service.cadastro.AlunoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 

* Modelo de Requisicao  para criar usuario :
* 
* 
http://localhost:9097/usuario/criar

Content-Type :   application/json 

{
    "nome" : "Teste 1 ", 
    "endereço" : "Avenida 1 ", 
    "pais" : "BRASIL" ,  
    "habilitado" : "true"
}

{
    "nome" : "Teste 2 ", 
    "endereço" : "Avenida 2 ", 
    "pais" : "ESTADOS_UNIDOS" ,  
    "habilitado" : "true"
}


 * 
 * 
 * 
 * 
 */
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    AlunoService alunoService; 
    
    
    @RequestMapping(value = "/criar" , method = RequestMethod.POST)
    public ResponseEntity<Aluno> criarUsuario(@RequestBody Aluno aluno){
        alunoService.criarAluno(aluno);
        return new ResponseEntity<Aluno>(aluno, HttpStatus.OK ); 
    }
    
    
    @RequestMapping(value = "/buscartudo" , method = RequestMethod.GET)
    public ResponseEntity<List<Aluno>> buscartodosUsuarios(){
        List<Aluno> listaTodosAlunos = alunoService.buscarListAll() ; 
        return new ResponseEntity<List<Aluno>>(listaTodosAlunos, HttpStatus.OK ); 
    }
    
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Long id ){
        Aluno aluno = alunoService.findById(id); 
        return new ResponseEntity<Aluno>(aluno, HttpStatus.OK ); 
    }

    
    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<Aluno> deletePorId(@PathVariable Long id ){
        alunoService.deletarUsuario(id) ; 
        return new ResponseEntity<>(null, HttpStatus.OK );
            
    }
    

    
}
