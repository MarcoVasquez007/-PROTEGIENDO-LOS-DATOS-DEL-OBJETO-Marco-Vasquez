public class Producto {

    private double cantidad;
    public double getCantidad(){
    return cantidad;
    }

    public void setProduct (double cantidad){

        if (cantidad >= 0){
            this.cantidad = cantidad;
        }
    }
}

