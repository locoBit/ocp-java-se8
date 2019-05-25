package clase_1;

public abstract class Producto {
  private int    id;
  private String descripcion;
  private double precio;
  static int descuento = 30;

  public Producto() {}

  public Producto(int id, String descripcion, double precio) {
    this.id = id;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public abstract String despliega();

  public int getId() {
    return id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getPrecio() {
    return precio;
  }
}
