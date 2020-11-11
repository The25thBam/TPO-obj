package SocioPackage;

import SocioPackage.Accionistas.Accionista;
import SocioPackage.Accionistas.ColeccionAccionistas;
import SocioPackage.Documentaciones.ColeccionDocuementacion;
import SocioPackage.Documentaciones.Documentacion;
import SocioPackage.Facturas.ColeccionFactura;
import SocioPackage.Facturas.Factura;

import java.util.List;

public class Socio {
    private String CUIT;
    private String razonSocial;
    private TipoSocio tipoSocio;
    private String actividadPrincipal;
    private String direccion;
    private String telefono;
    private String correo;
    private Estado estado;

    private ColeccionAccionistas accionistas;
    private ColeccionDocuementacion documentaciones;
    private ColeccionFactura facturas;
    public Socio(String CUIT,String razonSocial,TipoSocio tipoSocio,String actividadPrincipal,String direccion,String telefono,String correo,Estado estado){
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
        this.tipoSocio = tipoSocio;
        this.actividadPrincipal = actividadPrincipal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }




    public String getCuit(){
        return CUIT;
    }



    public List<Accionista> getAccionistas(){
        return accionistas.getAll();
    }

    public List<Documentacion> getDocumentaciones(){ return documentaciones.getAll(); }

    public List<Factura> getFacturas(){ return facturas.getAll(); }

}
