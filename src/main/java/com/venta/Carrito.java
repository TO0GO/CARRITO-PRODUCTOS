package com.venta;

public class Carrito {
    private Producto[] productos;
  private int indice;

    public Carrito(){
        this.productos=new Producto[3];
        this.indice=0;
    }

      public void agregarProducto(Producto p){
        if(indice< 3){
          productos[indice++]=p;
        }else{
            System.out.println("El carrito esta lleno");
        }

    }

     public void mostrarCarrito(){
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i].nomProducto+"Precio: "+productos[i].precio);
        }
    }

     public double montoPagar(){
        double monto=0;
       for(int i=0;i<productos.length;i++){
          monto+=productos[i].precio;
       }
       return monto;
    }

}
