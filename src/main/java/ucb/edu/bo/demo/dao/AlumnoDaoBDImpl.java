package ucb.edu.bo.demo.dao;

import java.util.*;
import ucb.edu.bo.demo.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class AlumnoDaoBDImpl implements AlumnoDao {

  @Autowired
  private AlumnoRepository repo;

  public AlumnoDaoBDImpl() {
  }

  public Alumno buscarPorId(int alumnoId) {
    return repo.findById(alumnoId).orElse(new Alumno());
  }

  public List<Alumno> buscarTodos() {
    return repo.findAll();
  }

  public Alumno crearAlumno(Alumno alumno) {
    return repo.save(alumno);
  }

  public Alumno modificarAlumno(Alumno alumno) {
    return repo.save(alumno);
  }

  public void elimnarAlumno(Alumno alumno) {
    repo.deleteById(alumno.getAlumnoId());
  }

}
