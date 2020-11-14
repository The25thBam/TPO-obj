package OperacionPackage.Pagares;

// no se usa?
import OperacionPackage.Cheques.Cheque;
import SocioPackage.Documentaciones.Documentacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColeccionesPagare {
    private static List<Pagare> pagares = new ArrayList<Pagare>();

    public ColeccionesPagare(List<Pagare> pagares){
        this.pagares = pagares;
    }

    public List<Pagare> getAll(){
        return pagares;
    }

    public static Pagare getPagareByNro(String nro){
        Pagare resultado = null;
        for(int i = 0;i<pagares.size();i++){
            if(pagares.get(i).getNro() == nro){
                resultado = pagares.get(i);
                break;
            }
        }
        return resultado;
    }

    public static Pagare getPagareByFecha(Date fecha){
        Pagare resultado = null;
        for(int i = 0;i<pagares.size();i++){
            if(pagares.get(i).getFecha() == fecha){
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
