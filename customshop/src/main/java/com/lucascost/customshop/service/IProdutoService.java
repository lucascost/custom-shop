package com.lucascost.customshop.service;

import com.lucascost.customshop.model.Categoria;
import com.lucascost.customshop.model.Produto;

import java.util.ArrayList;

public interface IProdutoService {
    public Produto inserirNovoProduto(Produto produto);
    public Produto alterarProduto(Produto produto);
    public Produto recuperarPorId(int id);
    public ArrayList<Produto> listarTodos();
    public ArrayList<Produto> listarDisponiveis();
    public ArrayList<Produto> listarPorCategoria(Categoria categoria);
}
