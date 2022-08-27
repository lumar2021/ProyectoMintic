class MovimientoDinero
{
  private double monto;
  private String concepto;
  private String tipo;
  private Empleado empleado;
  
  public MovimientoDinero(){}
  
  public MovimientoDinero(double monto, String concepto, String tipo)
  {
    this.monto = monto;
    this.concepto = concepto;
    this.tipo = tipo;
  }

  public void setMonto(double monto)
  {
    this.monto=monto;
  }

  public void setConcepto(String concepto)
  {
    this.concepto=concepto;
  }

  public void setTipo(String tipo)
  {
    this.tipo=tipo;
  }

  public double getMonto() {
    return monto;
  }
  
  public String getConcepto() {
    return concepto;
  }
  
  public String getTipo() {
    return tipo;
  }

  public Empleado getEmpleado() {
    return empleado;  
  }

  public void setEmpleado(Empleado empleado)
  {
    this.empleado = empleado;
  }
}
