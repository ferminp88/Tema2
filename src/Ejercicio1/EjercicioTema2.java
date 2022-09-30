package Ejercicio1;

public class EjercicioTema2 {

    public static void main(String[] args) {

    double precio = precioConIva(1542);
    System.out.println("El precio del producto con iva es = " + precio);
    }

    static double precioConIva(double precio){
        return precio= precio+(precio*20/100);

    }
}
