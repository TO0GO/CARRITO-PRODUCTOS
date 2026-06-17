package com.venta;

public class Transferencia implements TipoPago{
    private String numCuenta;
    private double saldo;
    public Transferencia(String  numCuenta,double saldo){
        if(validarCuenta(numCuenta)){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
        }else{
            throw new IllegalArgumentException("Dato de cuenta invalido");
        }
        
    }
    
     private boolean validarCuenta(String numCuenta){
         return numCuenta != null && numCuenta.matches("\\d{10}");
    }

    @Override
    public boolean pago(double monto) {
        if(saldo>=monto){
            saldo-=monto;
            return true;
        }
        return false;
    }

    @Override
    public void recibo(double monto) {
      System.out.println("Pago realizado con exito con TRANSFERENCIA");
      System.out.println("Numro de cuenta: "+"\t"+numCuenta);
      System.out.println("Monto transferencia: "+"\t"+monto);
      
    }
    
}
