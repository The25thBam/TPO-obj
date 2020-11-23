package OperacionPackage;

import OperacionPackage.Cheques.Cheque;
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


    public static Operacion addOperacion(String nroOperacion,String nombre,String estado,String nroCertificado,float importe,Date fecha,String CuitSocio){
        Operacion aux = getOperacion(nroOperacion);
        if(aux == null){
            aux = new Operacion(nombre,estado,nroCertificado,importe,nroOperacion,fecha,CuitSocio);
        }

        return aux;

    }



    // Esta funcion busca la operacion y le agrega un cheque a su listado
    public static Cheque addCheque(String nroOpeacion,String banco, String nro, Date fecha, float valor, float tasaDeDescuento,float comision){
        Operacion operacionAux = getOperacion(nroOpeacion);
        Cheque aux = new Cheque(banco,nro,fecha,valor,tasaDeDescuento,comision);
        if(operacionAux != null){
            operacionAux.addCheque(aux);
            return aux;
        }
        else {
            return aux;
        }

    }



    public static List<Operacion> getOperacionesByFecha(Date fecha){
        List<Operacion> aux = new ArrayList<Operacion>();
        for(int i = 0;i<operaciones.size();i++){
            if(operaciones.get(i).getFecha().equals(fecha)){
                aux.add(operaciones.get(i));
            }
        }

        return aux;
    }

    /* ----------------------------------- Cosultas Generales ------------------------------------------------- */

    // Esta funcion implementa la consulta general 1
    public static float calcularComisionChequeByFecha(Date fecha){
        List<Operacion> opAux = getOperacionesByFecha(fecha);
        float contador = 0;
        for(int i = 0;i<operaciones.size();i++){
            contador = contador + operaciones.get(i).calcularComisionCheque();
        }

        return contador;

    }


    public static boolean estaEnPeriodo(Operacion op,Date fechaInicio,Date fechaFin){
        if(op.getFecha().after(fechaInicio) && op.getFecha().before(fechaFin)){
            return true;
        }
        return false;
    }


    // Esta funcion implementa la consulta general nro 2
    public static List<Operacion> getOperacionesMonetizadasBySocio(Date fechaInicio,Date fechaFin,String Cuit){
        List<Operacion> operacionesAux = new ArrayList<Operacion>();
        for(int i = 0;i<operaciones.size();i++){
            if(estaEnPeriodo(operaciones.get(i),fechaInicio,fechaFin) && operaciones.get(i).getCuitSocio().equals(Cuit)){
                operacionesAux.add(operaciones.get(i));
            }


        }

        return operacionesAux;
    }






}

