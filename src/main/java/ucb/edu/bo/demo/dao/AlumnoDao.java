package ucb.edu.bo.demo.dao;

import java.util.*;
import ucb.edu.bo.demo.dto.*;

public interface AlumnoDao {

  public Alumno buscarPorId(int alumnoId);

  public List<Alumno> buscarTodos();

  public Alumno modificarAlumno(Alumno alumno);

  public Alumno crearAlumno(Alumno alumno);

  public void elimnarAlumno(Alumno alumno);

}
