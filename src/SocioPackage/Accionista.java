package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class Accionista {
    private String CUIL;
    private Integer porcentaje;
    private List<Accionista> accionistas = new ArrayList<Accionista>();

    public Accionista(String CUIL,Integer porcentaje){
        this.CUIL = CUIL;
        this.porcentaje = porcentaje;
    }

    public Accionista getAccionista(String CUIL){

        Accionista resultado = null;
        for(int i = 0;i<accionistas.size();i++){
            if(accionistas.get(i).getCuil() == CUIL){
                resultado = accionistas.get(i);
                break;
            }
        }
        return resultado;
    }


    public String getCuil(){
        return CUIL;
    }


    public Accionista addAccionista(String CUIL,Integer porcentaje){
        Accionista aux = getAccionista(CUIL);
        if(aux == null){
            aux = new Accionista(CUIL,porcentaje);
        }
        return aux;

    }




}
