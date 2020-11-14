package OperacionPackage;

import OperacionPackage.Cheques.Cheque;
import OperacionPackage.Cheques.ColeccionesCheque;
import OperacionPackage.Comision.Comision;
import OperacionPackage.CuentasCorrientesComerciales.CuentaCorrienteComercial;
import OperacionPackage.CuentasCorrientesComerciales.ColeccionesCuentasCorrientesComerciales;
import OperacionPackage.Pagares.Pagare;
import OperacionPackage.Pagares.ColeccionesPagare;
import OperacionPackage.Prestamos.Prestamo;
import OperacionPackage.Prestamos.ColeccionesPrestamo;

import java.util.Date;
import java.util.List;

public class Operacion{
    String nombre;
    Status estado;
    String nroCertificado;
    int cantidadOperaciones;
    float importe;
    String nroOperacion;
    Date fecha;

    public Operacion(String nombre, Status estado, String nroCertificado, int cantidadOperaciones, float importe, String nroOperacion, Date fecha) {
        this.nombre = nombre;
        this.estado = estado;
        this.nroCertificado = nroCertificado;
        this.cantidadOperaciones = cantidadOperaciones;
        this.importe = importe;
        this.nroOperacion = nroOperacion;
        this.fecha = fecha;
    }

    public Cheque getChequeFecha(Date fecha){
        return ColeccionesCheque.getChequeByFecha(fecha);
    }

    public Pagare getPagareFecha(Date fecha){
        return ColeccionesPagare.getPagareByFecha(fecha);
    }

    public Cheque getChequeNro(String nroOperacion){
        return ColeccionesCheque.getChequeByNro(nroOperacion);
    }

    public Pagare getPagareNro(String nroOperacion){
        return ColeccionesPagare.getPagareByNro(nroOperacion);
    }


    public String detectarTipoOperacion(){
        return this.nombre;
    }

    public float getImporte(){
        return importe;
    }

    public Status getEstado(){
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }


}