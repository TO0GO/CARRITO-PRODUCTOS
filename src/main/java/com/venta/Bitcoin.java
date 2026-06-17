package com.venta;

public class Bitcoin implements TipoPago{
    private String direcWallet;
    private double saldo;

    public Bitcoin(String direcWallet,double saldo){
        if(validarBilletera(direcWallet)){
        this.direcWallet=direcWallet;
        this.saldo=saldo;
        }else{
         throw new IllegalArgumentException("Direccion de wallet invalido");
        }
    }

    public boolean validarBilletera(String direcWallet){
        return direcWallet != null && direcWallet.length()>=26;
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
       System.out.println("Pago realizado con exito con  WALLET");
       System.out.println("Direccion de wallet: "+"\t"+direcWallet);
       System.out.println("Monto transferido: "+ "\t"+monto+"BTC");
    }
    
}
