package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private List<Socio> socios = new ArrayList<Socio>();

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


    public Socio addSocio(String CUIT, String razonSocial, TipoSocio tipoSocio, String actividadPrincipal, String direccion, String telefono, String correo, Estado estado){
        Socio aux = getSocio(CUIT);
        if(aux == null){
            aux = new Socio(CUIT,razonSocial,tipoSocio,actividadPrincipal,direccion,telefono,correo,estado);
        }
        return aux;

    }
}
