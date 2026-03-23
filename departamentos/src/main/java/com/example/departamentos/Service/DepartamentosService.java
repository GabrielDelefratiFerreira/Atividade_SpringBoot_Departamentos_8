package com.example.departamentos.Service;

import com.example.departamentos.Model.DepartamentosModel;
import com.example.departamentos.Repository.DepartamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentosService {

    @Autowired
    private DepartamentosRepository departamentosRepository;

    public List<DepartamentosModel> findAll(){
        return departamentosRepository.findAll();
    }

    public Optional<DepartamentosModel> buscarPorId(Long id){
        return departamentosRepository.findById(id);
    }

    public DepartamentosModel criarDepartamento(DepartamentosModel departamento){
        return departamentosRepository.save(departamento);
    }

    public void deletarDepartamento(Long id){
        departamentosRepository.deleteById(id);
    }
}