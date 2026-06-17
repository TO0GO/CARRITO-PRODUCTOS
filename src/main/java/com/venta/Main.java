package com.venta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carrito carro1=new Carrito();
        Producto p1=new Producto("Compu Asus", 1000.45);
        Producto p2=new Producto("Compu Lenovo", 1500.29);
        Producto p3=new Producto("Compu Mac", 2500.60);

        carro1.agregarProducto(p1);
        carro1.agregarProducto(p2);
        carro1.agregarProducto(p3);

       double monto= carro1.montoPagar();
   
       System.out.println("=======================================");
       System.out.println("\t ***CARRITO***");
       carro1.mostrarCarrito();
       System.out.println("=======================================");
       System.out.println("El monto a pagar es: "+monto);
        System.out.println("=======================================");

       
       Scanner sc= new Scanner(System.in);
       int opcion;
       do{
       System.out.println("\t ESCOJA UN METODO DE PAGO");
       System.out.println("1. Transferencia ");
       System.out.println("2. Tarjeta de Credito ");
       System.out.println("3. Paypal");
       System.out.println("4. Bitcoin");
       System.out.println("5. Salir");
       System.out.println("=======================================");
        opcion=sc.nextInt();
      
       switch (opcion) {
        case 1:
            Transferencia tr=new Transferencia("4521369854", 50000.65);
            if(tr.pago(monto)){
               tr.recibo(monto);
            }else{
              System.out.println("El monto no es suficiente");
            }
          
            break;
        case 2:
            TarjetaCredito tc=new TarjetaCredito("7412365478954123", "1236541254", 4050.54);
           if(tc.pago(monto)){
               tc.recibo(monto);
            }else{
              System.out.println("El monto no es suficiente");
            }
            break;
        case 3:
            Paypal pyp=new Paypal("dy@outlook.com", 2000.20);
         if(pyp.pago(monto)){
               pyp.recibo(monto);
            }else{
              System.out.println("El monto no es suficiente");
            }
        break;
        case 4:
            Bitcoin btc=new Bitcoin("df56se52gf21dr84ty25jk87yu", 80800.80);
           if(btc.pago(monto)){
               btc.recibo(monto);
            }else{
              System.out.println("El monto no es suficiente");
            }
        break;
        case 5:
             System.out.println("=======================================");
             System.out.println("***GRACIAS POR SU COMPRA*** ");
             System.out.println("=======================================");
        break;
              
        default:
            System.out.println("=======================================");
            System.out.println("Nos existe esa forma de pago");
            System.out.println("=======================================");
       }
       }while (opcion!=5) ;
        
       
    }
}