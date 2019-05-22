package com.example.demo;

import com.example.demo.ennum.Pais;
import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer { 

    
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(DemoApplication.class);
        }        

        

}
