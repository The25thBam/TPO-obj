package SocioPackage.Accionistas;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAccionistas {
    private List<Accionista> accionistas = new ArrayList<Accionista>();

    public ColeccionAccionistas(List<Accionista> accionistas){
        this.accionistas = accionistas;
    }


    public List<Accionista> getAll(){
        return accionistas;
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


    public void addAccionista(Accionista nuevoAccionista){
        Accionista aux = getAccionista(nuevoAccionista.getCuil());
        if(aux == null){
            accionistas.add(nuevoAccionista);
        }

    }


}
