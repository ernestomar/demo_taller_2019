package ucb.edu.bo.demo.dao;

import ucb.edu.bo.demo.dto.*;
import org.springframework.data.jpa.repository.JpaRepository;

interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
