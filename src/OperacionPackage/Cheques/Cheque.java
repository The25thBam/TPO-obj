package OperacionPackage.Cheques;

import java.util.Date;

public class Cheque{
    private String banco;
    private String nro;
    private Date fecha;
    private float valor;
    private float tasaDeDescuento;


    // no se si esta tenia que hacer esto u otra cosa
    private boolean verificarCheque(String banco, String nro, Date fecha, float valor, float tasaDeDescuento){
        if (this.banco.equals(banco) && this.nro.equals(nro) && this.fecha == fecha && this.valor == valor && this.tasaDeDescuento == tasaDeDescuento){
            return true;
        }
        return false;
    }

    public Cheque(String banco, String nro, Date fecha, float valor, float tasaDeDescuento){
        this.banco = banco;
        this.nro = nro;
        this.fecha = fecha;
        this.valor = valor;
        this.tasaDeDescuento = tasaDeDescuento;
    }

    public float getValor() {
        return valor;
    }

    public String getNro(){
        return nro;
    }

    public Date getFecha() {
        return fecha;
    }
}