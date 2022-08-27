import java.util.ArrayList;

public class Empresa
{
  private String nombre;
  private String direccion;
  private String telefono;
  private String NIT;
  private ArrayList<Empleado> empleados;

  public Empresa(){}

  public Empresa(String nombre, String direccion, String telefono, String NIT)
  {
    this.nombre= nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    this.NIT=NIT;
    this.empleados = new ArrayList<Empleado>();
  }

  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }

  public void setDireccion(String direccion)
  {
    this.direccion=direccion;
  }

  public void setTelefono(String telefono)
  {
    this.telefono=telefono;
  }

  public void setNIT(String NIT)
  {
    this.NIT=NIT;
  }

  public String getNombre() {
    return nombre;  
  }
  
  public String getDireccion() {
    return direccion;  
  }
  
  public String getTelefono() {
    return telefono;  
  }
  
  public String getNIT() {
    return NIT;
  }

  public void setEmpleados(ArrayList<Empleado> empleados)
  {
    this.empleados = empleados;
  }

  public ArrayList<Empleado> getEmpleados() {
    return this.empleados;  
  }
}
