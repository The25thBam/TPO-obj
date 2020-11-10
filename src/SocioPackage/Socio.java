package SocioPackage;

import SocioPackage.Estado;

import java.util.ArrayList;
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

    private List<Socio> socios = new ArrayList<Socio>();
    private ColeccionAccionistas accionistas;

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


    public Socio getSocio(String CUIT){
        Socio resultado = null;
        for(int i = 0;i<socios.size();i++){
            if(socios.get(i).getCuit() == CUIT){
                resultado = socios.get(i);
                break;
            }
        }

        return resultado;

    }

    public String getCuit(){
        return CUIT;
    }

    public Socio addSocio(String CUIT,String razonSocial,TipoSocio tipoSocio,String actividadPrincipal,String direccion,String telefono,String correo,Estado estado){
        Socio aux = getSocio(CUIT);
        if(aux == null){
            aux = new Socio(CUIT,razonSocial,tipoSocio,actividadPrincipal,direccion,telefono,correo,estado);
        }
        return aux;

    }

    public List<Accionista> getAccionistas(){
        return accionistas.getAll();
    }








}
