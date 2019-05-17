package ucb.edu.bo.demo.dao;

import java.util.*;
import ucb.edu.bo.demo.dto.*;
import org.springframework.stereotype.Service;

@Service
public class AlumnoDaoMemImpl implements AlumnoDao {
  private List<Alumno> alumnos;

  AlumnoDaoMemImpl() {
      alumnos = new ArrayList<Alumno>();
      Alumno a1 = new Alumno();
      a1.setAlumnoId(1);
      a1.setNombre("Juan");
      a1.setApellido("Perez");
      alumnos.add(a1);
  }
  public Alumno buscarPorId(int alumnoId) {
    return alumnos.get(alumnoId - 1);
  }

  public List<Alumno> buscarTodos() {
    return alumnos;
  }

  public Alumno crearAlumno(Alumno alumno) {
    System.out.println("DAO MEM: " + alumno);
    alumno.setAlumnoId(alumnos.size()+1);
    alumnos.add(alumno);
    return alumno;
  }

  public Alumno modificarAlumno(Alumno alumno) {
    return null;
  }



  public void elimnarAlumno(Alumno alumno) {
    // no hago nada
  }

}
