package com.lucascost.customshop.service;

import com.lucascost.customshop.dao.CategoriaDAO;
import com.lucascost.customshop.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaDAO dao;

    @Override
    public Categoria inserirNovaCategoria(Categoria categoria) {
        try {
            if(categoria.getNome() != null && categoria.getNome().trim().length() > 0){
                dao.save(categoria);
                return categoria;
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println("Debug + "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Debug + "+ex.getMessage());
        }
        return null;
    }

    @Override
    public Categoria alterarCategoria(Categoria categoria) {
        try {
            if(categoria.getId() != null && categoria.getNome() != null && categoria.getNome().trim().length() > 0){
                dao.save(categoria);
                return categoria;
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println("Debug + "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Debug + "+ex.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<Categoria> recuperarTodasCategorias() {
        return (ArrayList<Categoria>) dao.findAll();
    }

    @Override
    public ArrayList<Categoria> recuperarPorPalavraChave(String palavraChave) {
        if(palavraChave != null)
            return dao.findByNomeContaining(palavraChave);

        return null;
    }
}
