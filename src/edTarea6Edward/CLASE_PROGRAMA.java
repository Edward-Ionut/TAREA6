package edTarea6Edward;

public class CLASE_PROGRAMA {
    //Clase para aplicar descuentos
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double Total;
        //Hacemos un if, para saber si el numero de producto es mayor que 3
        if(numProductos>3){
            precioProducto-=5;
            //En este if, si el precio es distinto de 0 se aplicará un IVA u otro;
            if (numProductos!=0){
                Total = precioProducto*IVA;
                //@Return
                salidaIVA(Total);
            }else {
                Total = precioProducto*IVA2;
                //@Return
                salidaIVA2(Total);
            }
        }
    }
    //Método del IVA 1
    public void salidaIVA2(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    //Método del IVA2
    public void salidaIVA(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    //Variables IVA
    private static final double IVA2 = 0.95;
    private static final double IVA = 0.8;
}
