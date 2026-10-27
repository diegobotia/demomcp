package com.udea.demomcp.repository;

import com.udea.demomcp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea,  Long> {
    List<Tarea> findByCompletado(Boolean completado);
    List<Tarea> findByTituloContainingIgnoreCase(String fragmentado);
}
