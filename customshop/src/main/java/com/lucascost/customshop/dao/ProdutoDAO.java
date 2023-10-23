package com.lucascost.customshop.dao;

import com.lucascost.customshop.model.Categoria;
import com.lucascost.customshop.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

    public ArrayList<Produto> findAllByDisponivel(int disponivel);
    public ArrayList<Produto> findAllByDisponivelAndCategoria(int disponivel, Categoria cat);
}
