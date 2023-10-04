package com.lucascost.customshop.controller;

import com.lucascost.customshop.model.Categoria;
import com.lucascost.customshop.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoriaController {

    @Autowired
    private ICategoriaService service;

    @GetMapping("/categoria")
    public ResponseEntity<ArrayList<Categoria>> listarTodas(){
        return ResponseEntity.ok().body(service.recuperarTodasCategorias());
    }

    @GetMapping("/categoria/busca")
    public ResponseEntity<ArrayList<Categoria>> recuperarPorPalavraChave(@RequestParam(name="key") String palavraChave){
        if(palavraChave != null)
            return ResponseEntity.ok().body(service.recuperarPorPalavraChave(palavraChave));
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/categoria")
    public ResponseEntity<Categoria> adicionar(@RequestBody Categoria categoria){
        if(categoria.getId() != null)
            categoria.setId(null);

        Categoria resultado = service.inserirNovaCategoria(categoria);
        if(resultado != null)
            return ResponseEntity.status(201).body(resultado);
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/categoria")
    public ResponseEntity<Categoria> alterarDados(@RequestBody Categoria categoria){
        Categoria resultado = service.alterarCategoria(categoria);
        if(resultado != null)
            return ResponseEntity.ok(resultado);
        return ResponseEntity.badRequest().build();
    }
}
