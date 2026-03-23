package com.example.departamentos.Repository;

import com.example.departamentos.Model.DepartamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentosRepository extends JpaRepository<DepartamentosModel, Long> {
}
