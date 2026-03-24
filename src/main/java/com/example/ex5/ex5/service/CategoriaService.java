package com.example.ex5.ex5.service;

import com.example.ex5.ex5.Categoria;
import com.example.ex5.ex5.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void delete(Long id){
        categoriaRepository.deleteById(id);
    }

    public Optional<Categoria> buscar(Long id){
        return categoriaRepository.findById(id);
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Categoria update(Long id, Categoria categoria){
        categoria.setId(id);
        return categoriaRepository.save(categoria);
    }
}
