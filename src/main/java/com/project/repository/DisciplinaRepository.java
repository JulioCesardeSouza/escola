package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.model.Disciplina;
@Repository
public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {
	

}
