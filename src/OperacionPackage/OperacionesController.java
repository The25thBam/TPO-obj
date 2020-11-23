package OperacionPackage;

import OperacionPackage.Cheques.ColeccionesCheque;
import SocioPackage.Socio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperacionesController {
    private static List<Operacion> operaciones = new ArrayList<Operacion>();



    public static Operacion getOperacion(String nroOperacion){
        Operacion resultado = null;
        for(int i = 0;i<operaciones.size();i++){
            if(operaciones.get(i).getNroOperacion().equals(nroOperacion)){
                resultado = operaciones.get(i);
                break;
            }
        }

        return resultado;
    }


    public static Operacion addOperacion(String nroOperacion,String nombre,status estado,String nroCertificado,float importe,Date fecha){
        Operacion aux = getOperacion(nroOperacion);
        if(aux == null){
            aux = new Operacion(nombre,estado,nroCertificado,importe,nroOperacion,fecha);
        }

        return aux;

    }


}

