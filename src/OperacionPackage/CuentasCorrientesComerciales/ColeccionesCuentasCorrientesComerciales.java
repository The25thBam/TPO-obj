package OperacionPackage.CuentasCorrientesComerciales;

// no se usa?

import java.util.ArrayList;
import java.util.List;

public class ColeccionesCuentasCorrientesComerciales {
    private List<CuentaCorrienteComercial> cuentasCorrientesComerciales = new ArrayList<CuentaCorrienteComercial>();

    public void ColeccionesCuentaCorrienteComercial(List<CuentaCorrienteComercial> cuentasCorrientesComerciales){
        this.cuentasCorrientesComerciales = cuentasCorrientesComerciales;
    }

    public List<CuentaCorrienteComercial> getAll(){
        return cuentasCorrientesComerciales;
    }

    public CuentaCorrienteComercial getChequeByNro(String id){
        CuentaCorrienteComercial resultado = null;
        for(int i = 0;i<cuentasCorrientesComerciales.size();i++){
            if(cuentasCorrientesComerciales.get(i).getId() == id){
                resultado = cuentasCorrientesComerciales.get(i);
                break;
            }
        }
        return resultado;
    }



    public void addCuentaCorrienteComercial(CuentaCorrienteComercial cuentaCorrienteComercial){
        CuentaCorrienteComercial aux = getChequeByNro(cuentaCorrienteComercial.getId());
        if(aux == null){
            cuentasCorrientesComerciales.add(cuentaCorrienteComercial);
        }
    }





}
