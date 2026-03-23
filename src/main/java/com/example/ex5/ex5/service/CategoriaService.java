package com.example.ex5.ex5.service;

import com.example.ex5.ex5.Categoria;
import com.example.ex5.ex5.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public void salvar(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void excluir(Long id){
        categoriaRepository.deleteById(id);
    }

    public Categoria findById(Long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }
}
