package com.lucascost.customshop.dao;

import com.lucascost.customshop.model.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {
    public ArrayList<Categoria> findByNomeContaining(String palavra);
}
