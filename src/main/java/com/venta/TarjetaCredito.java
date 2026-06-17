package com.venta;

public class TarjetaCredito implements TipoPago {
    private String numTarjeta;
    private String CI;
    private double saldo;


    public TarjetaCredito(String numTarjeta, String CI,double saldo){
        if(validarDatos(numTarjeta, CI)){
       this.numTarjeta=numTarjeta;
       this.CI=CI;
       this.saldo=saldo;
        }else{
            throw new IllegalArgumentException("Datos invalidos");
        }
    }

    public boolean validarDatos(String numTarjeta,String CI ){
        return  numTarjeta != null && CI != null && numTarjeta.matches("\\d{16}") && CI.matches("\\d{10}");
    }
    @Override
    public boolean pago(double monto) {
       if(saldo>monto){
          saldo-=monto;
           return true;
       }
       return false;
    }

    @Override
    public void recibo(double monto) {
      System.out.println("Pago realizado con exito con TARJETA DE CREDITO"); 
      System.out.println("Numero de Tarjeta: "+"\t"+numTarjeta);
      System.out.println("Monto de cargo: "+"\t"+monto);
    }
    
}
