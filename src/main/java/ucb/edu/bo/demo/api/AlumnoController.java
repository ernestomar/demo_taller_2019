package ucb.edu.bo.demo.api;

import java.net.URI;
import java.util.*;
import javax.servlet.http.*;
import ucb.edu.bo.demo.bl.*;
import ucb.edu.bo.demo.dto.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/alumno")
public class AlumnoController {

  private CursoBl cursoBl;

  @Autowired
  AlumnoController(CursoBl cbl) {
      this.cursoBl = cbl;
  }

  @GetMapping(path="/", produces = "application/json")
  public Alumno buscarPorId(@RequestParam(name = "id") int alumnoId)  {
    return this.cursoBl.buscarPorId(alumnoId);
  }

  @GetMapping(path="/all", produces = "application/json")
  public List<Alumno> buscarTodos()  {
    return this.cursoBl.buscarTodos();
  }

  @PostMapping(path="/", produces = "application/json", consumes="application/json")
  public Alumno crearAlumno(@RequestBody Alumno alumno)  {
    System.out.println("Controller: " + alumno);
    return this.cursoBl.crearAlumno(alumno);
  }
}
