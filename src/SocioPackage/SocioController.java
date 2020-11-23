package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private static List<Socio> socios = new ArrayList<Socio>();

    public static Socio getSocio(String CUIT){
        Socio resultado = null;
        for(int i = 0;i<socios.size();i++){
            if(socios.get(i).getCuit() == CUIT){
                resultado = socios.get(i);
                break;
            }
        }

        return resultado;

    }


    public static Socio addSocio(String CUIT, String razonSocial, String FechaInicio, String tipoSocio, String actividadPrincipal, String direccion, String telefono, String correo, boolean estado){
        //System.out.println("Socio: " + CUIT + "Boolean: " + estado);
        Socio aux = getSocio(CUIT);
        if(aux == null){
            aux = new Socio(CUIT,razonSocial, FechaInicio, tipoSocio,actividadPrincipal,direccion,telefono,correo,estado);
        }
        return aux;

    }
}
