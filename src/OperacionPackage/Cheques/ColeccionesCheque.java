package OperacionPackage.Cheques;

// no se usa?

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ColeccionesCheque {
    private static List<Cheque> cheques = new ArrayList<Cheque>();

    public ColeccionesCheque(List<Cheque> cheques){
        this.cheques = cheques;
    }

    public List<Cheque> getAll(){
        return cheques;
    }

    public static Cheque getChequeByNro(String nro){
        Cheque resultado = null;
        for(int i = 0;i<cheques.size();i++){
            if(cheques.get(i).getNro() == nro){
                resultado = cheques.get(i);
                break;
            }
        }
        return resultado;
    }

    public static Cheque getChequeByFecha(Date fecha){
        Cheque resultado = null;
        for(int i = 0;i<cheques.size();i++){
            if(cheques.get(i).getFecha() == fecha){
                resultado = cheques.get(i);
                break;
            }
        }
        return resultado;
    }



    public void addCheque(Cheque cheque){
        Cheque aux = getChequeByNro(cheque.getNro());
        if(aux == null){
            cheques.add(cheque);
        }
    }





}
