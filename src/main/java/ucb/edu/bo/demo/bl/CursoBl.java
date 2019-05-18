package ucb.edu.bo.demo.bl;

import java.util.*;
import ucb.edu.bo.demo.dao.*;
import ucb.edu.bo.demo.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CursoBl {

  AlumnoDao alumnoDao;

  @Autowired
  CursoBl (AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
  }

  public Alumno buscarPorId(int alumnoId) {
    return this.alumnoDao.buscarPorId(alumnoId);
  }

  public List<Alumno> buscarTodos() {
    return this.alumnoDao.buscarTodos();
  }

  public Alumno modificarAlumno(Alumno alumno) {
    return this.alumnoDao.modificarAlumno(alumno);
  }

  public Alumno crearAlumno(Alumno alumno) {
    System.out.println("BL: " + alumno);
    return this.alumnoDao.crearAlumno(alumno);
  }

  public void elimnarAlumno(Alumno alumno) {
    this.alumnoDao.elimnarAlumno(alumno);
  }

}
