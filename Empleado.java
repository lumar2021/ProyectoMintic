import java.util.ArrayList;

public class Empleado
{
  private String nombre;
  private String correo;
  private String rol;
  private String tipoDocumento;
  private int documento = 0;
  private Empresa empresa;
  private ArrayList<MovimientoDinero> movimientos;

  public Empleado(){}

  public Empleado(String nombre, String correo, String rol, String tipoDocumento, int documento)
  {
    this.nombre = nombre;
    this.correo = correo;
    this.rol = rol;
    this.tipoDocumento = tipoDocumento;
    this.documento = documento;   
  }

  public String getNombre() {
    return nombre;  
  }

  public String getCorreo() {
    return correo;  
  }

  public String getRol() {
    return rol;  
  }

   public String getTipoDocumento() {
    return tipoDocumento;  
  }
  
  public int getDocumento() {
    return documento;  
  }

  public Empresa getEmpresa() {
    return empresa;  
  }

  public void setEmpresa(Empresa empresa)
  {
    this.empresa = empresa;
  }

  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  
  public void setTipoDocumento(String tipoDocumento)
  {
    this.tipoDocumento = tipoDocumento;
  }

  public void setDocumento(int documento)
  {
    this.documento = documento;
  }

  public void setCorreo(String correo)
  {
    this.correo = correo;
  }

  public void setRol(String rol)
  {
    this.rol = rol;
  }

  public void setMovimientos(ArrayList<MovimientoDinero> movimientos)
  {
    this.movimientos = movimientos;
  }

  public ArrayList<MovimientoDinero> getMovimientos() {
    return this.movimientos;  
  }
}
