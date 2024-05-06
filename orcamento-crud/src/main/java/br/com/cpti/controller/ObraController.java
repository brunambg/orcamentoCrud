package br.com.cpti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cpti.entity.Obra;
import br.com.cpti.repository.ObraRepository;

@RestController
@RequestMapping("/obras")
public class ObraController {
    
        @Autowired
        private ObraRepository repository;
        
        @PostMapping
        public Obra inserir(@RequestBody Obra o) {
            return repository.save(o);
        }
}