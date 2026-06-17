package com.venta;

import java.nio.file.InvalidPathException;
import java.util.Scanner;

public class Paypal implements TipoPago{

private String correo;
private double saldo;

public Paypal(String correo, double saldo){
    if(validarCorreo(correo)){
    this.correo=correo;
    this.saldo=saldo;
    }else{
       throw new IllegalArgumentException("Correo invalido");
    }
}

public boolean validarCorreo(String correo){
  return correo != null && correo.contains("@");
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
       System.out.println("Pago realizado con exito con PAYPAL");
       System.out.println("Cueta asociada: "+"\t"+correo);
       System.out.println("Monto de cargo: "+"\t"+monto);
    }
     
    
}
