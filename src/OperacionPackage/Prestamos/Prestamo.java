package OperacionPackage.Prestamos;

import java.util.Date;

public class Prestamo{
    private String bancoSolicitador;
    private float importe;
    private float tasa;
    private Date fechaAcreditacion;
    private int cantidadCuotas;
    // que es?
    private String sistema;

    // no se si esta tenia que hacer esto u otra cosa
    private boolean verificarPrestamo(String bancoSolicitador, float importe, float tasa, Date fechaAcreditacion, int cantidadCuotas, String sistema){
        if (this.bancoSolicitador.equals(bancoSolicitador) && this.importe == importe && this.tasa == tasa){
            if (this.fechaAcreditacion == fechaAcreditacion && this.cantidadCuotas == cantidadCuotas && this.sistema.equals(sistema))
            return true;
        }
        return false;
    }

    public Prestamo(String bancoSolicitador, float importe, float tasa, Date fechaAcreditacion, int cantidadCuotas, String sistema){
        this.bancoSolicitador = bancoSolicitador;
        this.importe = importe;
        this.tasa = tasa;
        this.fechaAcreditacion = fechaAcreditacion;
        this.cantidadCuotas = cantidadCuotas;
        this.sistema = sistema;
    }

    public float getImporte() {
        return importe;
    }

    public Date getFecha(){
        return fechaAcreditacion;
    }
}