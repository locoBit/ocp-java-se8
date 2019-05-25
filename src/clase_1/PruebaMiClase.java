package clase_1;

import java.util.ArrayList;

public class PruebaMiClase {

  public static void main(String[] args) {
    Producto alimento = new Alimento();
    Producto[][] productosArray = new Producto[1][3];

    ArrayList<Producto> productos = new ArrayList<Producto>();

    productos.add(new Alimento());
    productos.add(new Electronico());

    productos.stream().forEach(producto -> {
      System.out.println(producto.despliega());
      System.out.println(producto.descuento);
    });
  }
}
