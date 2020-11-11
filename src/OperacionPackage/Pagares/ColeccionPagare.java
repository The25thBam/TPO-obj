package OperacionPackage.Pagares;

// no se usa?
import SocioPackage.Documentaciones.Documentacion;

import java.util.ArrayList;
import java.util.List;

public class ColeccionPagare {
    private List<Pagare> pagares = new ArrayList<Pagare>();

    public ColeccionPagare(List<Pagare> pagares){
        this.pagares = pagares;
    }

    public List<Pagare> getAll(){
        return pagares;
    }

    public Pagare getPagareByNro(String nro){
        Pagare resultado = null;
        for(int i = 0;i<pagares.size();i++){
            if(pagares.get(i).getNro() == nro){
                resultado = pagares.get(i);
                break;
            }
        }
        return resultado;
    }



    public void addPagare(Pagare pagare){
        Pagare aux = getPagareByNro(pagare.getNro());
        if(aux == null){
            pagares.add(pagare);
        }
    }





}
