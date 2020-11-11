package OperacionPackage.Pagares;

import java.util.Date;

public class Pagare{
    private String nro;
    private Date fecha;
    private float monto;

    // no se si esta tenia que hacer esto u otra cosa
    private boolean verificarPagare(String nro, Date fecha, float monto){
        if (this.nro.equals(nro) && this.fecha == fecha && this.monto == monto){
            return true;
        }
        return false;
    }

    public Pagare(String nro, Date fecha, float monto){
        this.nro = nro;
        this.fecha = fecha;
        this.monto= monto;
    }

    public float getMonto() {
        return monto;
    }

    public String getNro(){
        return nro;
    }
}