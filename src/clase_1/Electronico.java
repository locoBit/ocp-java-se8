package clase_1;

public class Electronico extends Producto {

  private int voltaje;

  @Override
  public String despliega() {
    return this.getDescripcion() + " " + this.voltaje;
  }
}
