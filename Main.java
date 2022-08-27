class Main {
  public static void main(String[] args) {
    Empresa empresa1 = new Empresa("Mc donals", "Calle 8", "3002020", "1010");
    System.out.println("Nombre empresa: "+empresa1.getNombre());

    Empleado empleado1 = new Empleado("Sara Gomez", "s@mcdonals.com.co", "administrador", "CC", 1010101010);
    empleado1.setEmpresa(empresa1);
    System.out.println("Nombre del empleado: "+empleado1.getNombre());
    System.out.println("Nombre de la empresa del empleado: "+empleado1.getEmpresa().getNombre());

    MovimientoDinero movimiento1 = new MovimientoDinero(200, "Compre gaseosas", "egreso");
    movimiento1.setEmpleado(empleado1);
    System.out.println("Monto del movimiento: "+movimiento1.getMonto());
    System.out.println("Nombre del empleado que hizo el movimiento: "+movimiento1.getEmpleado().getNombre());

  }
}
