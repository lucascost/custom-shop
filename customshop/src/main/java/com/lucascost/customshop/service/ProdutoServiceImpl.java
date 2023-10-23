package com.lucascost.customshop.service;

import com.lucascost.customshop.dao.ProdutoDAO;
import com.lucascost.customshop.model.Categoria;
import com.lucascost.customshop.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO dao;

    @Override
    public Produto inserirNovoProduto(Produto produto) {
        try {
            dao.save(produto);
            return produto;
        }
        catch (Exception ex){
            System.out.println("------ ProdutoService.inserirNovoProduto() ------");
            ex.printStackTrace();
            System.out.println("-------------------------------------------------");
        }
        return null;
    }

    @Override
    public Produto alterarProduto(Produto produto) {
        try {
            dao.save(produto);
            return produto;
        }
        catch (Exception ex){
            System.out.println("------ ProdutoService.alterarProduto() ------");
            ex.printStackTrace();
            System.out.println("-------------------------------------------------");
        }
        return null;
    }

    @Override
    public Produto recuperarPorId(int id) {
        return  dao.findById(id).orElse(null);
    }

    @Override
    public ArrayList<Produto> listarTodos() {
        return (ArrayList<Produto>) dao.findAll();
    }

    @Override
    public ArrayList<Produto> listarDisponiveis() {
        return dao.findAllByDisponivel(1);
    }

    @Override
    public ArrayList<Produto> listarPorCategoria(Categoria categoria) {
        return dao.findAllByDisponivelAndCategoria(1, categoria);
    }
}
