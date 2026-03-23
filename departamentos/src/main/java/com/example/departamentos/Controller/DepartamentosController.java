package com.example.departamentos.Controller;

import com.example.departamentos.Model.DepartamentosModel;
import com.example.departamentos.Service.DepartamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/departamentos")
public class DepartamentosController {

    @Autowired
    private DepartamentosService departamentosService;

    @GetMapping
    public List<DepartamentosModel> findAll(){
        return departamentosService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentosModel> buscarPorId(@PathVariable Long id){
        return departamentosService.buscarPorId(id);
    }

    @PostMapping
    public DepartamentosModel criarDepartamento(@RequestBody DepartamentosModel departamento){
        return departamentosService.criarDepartamento(departamento);
    }

    @DeleteMapping("/{id}")
    public void deletarDepartamento(@PathVariable Long id){
        departamentosService.deletarDepartamento(id);
    }
}