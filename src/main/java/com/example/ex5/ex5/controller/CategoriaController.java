package com.example.ex5.ex5.controller;

import com.example.ex5.ex5.Categoria;
import com.example.ex5.ex5.repository.CategoriaRepository;
import com.example.ex5.ex5.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public void cadastrar(@RequestBody Categoria categoria) {
        categoriaService.salvar(categoria);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id) {
        categoriaService.excluir(id);
    }

    @GetMapping
    public List<Categoria> buscarTodos(){
        return categoriaService.buscarTodos();
    }

    @GetMapping("{id}")
    public Categoria buscarPorId(@PathVariable Long id) {
        return categoriaService.findById(id);
    }
}
