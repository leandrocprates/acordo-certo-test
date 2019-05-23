/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.cadastro;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lprates
 */
@Service
public class AlunoService {
    
        @Autowired
        AlunoRepository alunoRepository ; 

        public void criarAluno(Aluno aluno){
            alunoRepository.save(aluno) ;
            System.out.println("Saida Id Aluno : " + aluno.getId());
        }
    
        public Aluno findById(Long id){
            
            Aluno alunoRetorno = null ; 
            Optional<Aluno> optional = alunoRepository.findById(id);
            if ( optional.isPresent() ) {
                alunoRetorno = optional.get() ;
                System.out.println("Retorno Id Aluno : " + alunoRetorno.getId());
            }            
            return alunoRetorno;
        }
        
        
        public List<Aluno> buscarListAll(){
            return alunoRepository.findAll();
        }
        
        public void deletarUsuario(Long id){
            alunoRepository.deleteById(id);
        }
        
        
    
}
