package com.example.demo;

import com.example.demo.ennum.Pais;
import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
/*
        @Autowired
        AlunoRepository alunoRepository ; 
*/    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

        
        
        @Override
        public void run(String... args) throws Exception {
        /*    
            Aluno aluno = new Aluno() ;
            aluno.setEndereço("Avenida Joao Pessoa 408 ");
            aluno.setHabilitado(Boolean.TRUE);
            aluno.setNome("Leandro Prates");
            aluno.setPais(Pais.BRASIL);
            
            alunoRepository.save(aluno) ; 
            
            Optional<Aluno> optional = alunoRepository.findById(1L);
            if ( optional.isPresent() ) {
                Aluno alunoRetorno = optional.get() ;
                System.out.println("Saida Id Aluno : " + alunoRetorno.getId());
            }
            
        */    
        }

        

}
