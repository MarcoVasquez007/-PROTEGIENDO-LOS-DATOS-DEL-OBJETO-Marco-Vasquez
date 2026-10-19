public class Main{
    public static void main(String[] args){
        Producto p = new Producto();
        Producto p2 = new Producto();

        p.setProduct(15.0);
        p2.setProduct(17.0);

        System.out.println(p.getCantidad());
        System.out.println(p2.getCantidad());
    }
}