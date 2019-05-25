package clase_1;

public class Alimento extends Producto {
  private int caducidad;

  @Override
  public String despliega() {
    return this.getDescripcion() + " " + this.caducidad;
  }
}
