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
import SocioPackage.Socio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Operacion{
    private String nombre;
    private String estado;
    private String nroCertificado;
    private float importe;
    private String nroOperacion;
    private Date fecha;
    private String CuitSocio;
    private static List<Cheque> cheques = new ArrayList<Cheque>();


    public Operacion(String nombre, String estado, String nroCertificado, float importe, String nroOperacion, Date fecha,String CuitSocio) {
        this.nombre = nombre;
        this.estado = estado;
        this.nroCertificado = nroCertificado;
        this.importe = importe;
        this.nroOperacion = nroOperacion;
        this.fecha = fecha;
        this.CuitSocio = CuitSocio;

    }



    public List<Cheque> getChequeFecha(Date fecha){
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

    public String getEstado(){
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNroOperacion() { return nroOperacion; }

    public String getCuitSocio(){ return CuitSocio; }



    // ----------------------- Metodos de cheques ------------------------------------------



    public List<Cheque> getAll(){
        return cheques;
    }

    public static Cheque getChequeByNro(String nro){
        Cheque resultado = null;
        for(int i = 0;i<cheques.size();i++){
            if(cheques.get(i).getNro() == nro){
                resultado = cheques.get(i);
                break;
            }
        }
        return resultado;
    }

    public static List<Cheque> getChequeByFecha(Date fecha){
        List<Cheque> resultado = null;

        for(int i = 0;i<cheques.size();i++){
            if(cheques.get(i).getFecha() == fecha){
                resultado.add(cheques.get(i));

            }
        }
        return resultado;
    }

    // Este calcula la comision de todos los cheques que tiene la operacion
    public static float calcularComisionCheque(){
        float contador = 0;

        for(int i = 0;i<cheques.size();i++){
            contador = contador + cheques.get(i).getComision();
        }


        return contador;
    }



    public void addCheque(Cheque cheque){
        Cheque aux = getChequeByNro(cheque.getNro());
        if(aux == null){
            cheques.add(cheque);
        }
    }









}