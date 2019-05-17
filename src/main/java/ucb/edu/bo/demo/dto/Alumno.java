package ucb.edu.bo.demo.dto;

public class Alumno {
  private Integer alumnoId;
  private String nombre;
  private String apellido;

  public Alumno() {}

  public Integer getAlumnoId() {
    return alumnoId;
  }

  public void setAlumnoId(Integer aId) {
    this.alumnoId = aId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nom) {
    this.nombre = nom;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String ape) {
    this.apellido = ape;
  }

  public String toString() {
    return "ID: " + this.alumnoId + " NOMBRE: " + this.nombre + " APELLIDO: " + this.apellido;
  }
}
