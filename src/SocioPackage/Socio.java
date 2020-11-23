package SocioPackage;

import SocioPackage.Accionistas.Accionista;
import SocioPackage.Accionistas.ColeccionAccionistas;
import SocioPackage.Aporte.Aporte;
import SocioPackage.Aporte.ColeccionAportes;
import SocioPackage.Documentaciones.ColeccionDocuementacion;
import SocioPackage.Documentaciones.Documentacion;
import SocioPackage.FDR.FDR;
import SocioPackage.Facturas.ColeccionFactura;
import SocioPackage.Facturas.Factura;
import SocioPackage.LineaCredito.LineaCredito;

import java.util.Date;
import java.util.List;

public class Socio {
    private String CUIT;
    private String razonSocial;
    private String FechaInicio;
    private String tipoSocio;
    private String actividadPrincipal;
    private String direccion;
    private String telefono;
    private String correo;
    private boolean estado;

    private ColeccionAccionistas accionistas;
    private ColeccionDocuementacion documentaciones;
    private ColeccionFactura facturas;
    private LineaCredito lineaDeCredito;
    private ColeccionAportes aportes;
    private FDR fondoDeRiesgo;

    public Socio(String CUIT,String razonSocial, String FechaInicio,String tipoSocio,String actividadPrincipal,String direccion,String telefono,String correo,boolean estado){
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
        this.FechaInicio = FechaInicio;
        this.tipoSocio = tipoSocio;
        this.actividadPrincipal = actividadPrincipal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    // --------------------------- Socio -------------------------------------------


    public String getCuit(){
        return CUIT;
    }


    // --------------------------- Accionistas ---------------------------------------

    public List<Accionista> getAccionistas(){
        return accionistas.getAll();
    }


    //--------------------------------- Documentacion ----------------------------------

    public List<Documentacion> getDocumentaciones(){ return documentaciones.getAll(); }

    // ---------------------------- Facturas ------------------------------------

    public List<Factura> getFacturas(){ return facturas.getAll(); }

    public void addFactura(String nro,Float importe,Character tipo){
        Factura nuevaFactura = new Factura(nro,importe,tipo);
        facturas.addFactura(nuevaFactura);
    }



    // ----------------------- Linea de Credito ---------------------------------

    public void crearLineaCredito(float monto, Date fechaInicio, Date fechaFin,Boolean aprobada,Character estado){
        lineaDeCredito = new LineaCredito(monto,fechaInicio,fechaFin,aprobada,estado);

    }

    public Float getMontoLinea(){
        return lineaDeCredito.obtenerMonto();
    }

    public Character verificarEstado(){
        return  lineaDeCredito.getEstado();
    }


    // ----------------------- Aportes -------------------------------------------


    public List<Aporte> getAportes(){
        return aportes.getAll();
    }

    public void addAporte(Integer monto,Date fecha){
        Aporte nuevoAporte = new Aporte(monto,fecha);
        aportes.agregarAporte(nuevoAporte);

    }


    // ------------------- FDR -----------------------------------------------------

    public Integer getValor(){
        return  fondoDeRiesgo.getValor();
    }

    public void addFondoRiesgo(Integer valor){
        fondoDeRiesgo = new FDR(valor);
    }




}
