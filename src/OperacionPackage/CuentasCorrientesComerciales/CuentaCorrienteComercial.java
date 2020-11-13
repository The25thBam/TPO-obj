package OperacionPackage.CuentasCorrientesComerciales;

import java.util.Date;

public class CuentaCorrienteComercial{
    String id;
    String empresa;
    float importeTotal;
    Date vencimiento;

    private boolean verificarCuenta(String id, String empresa, float importeTotal, Date vencimiento){
        if (this.id.equals(id) && this.empresa.equals(empresa) && this.importeTotal == importeTotal && this.vencimiento == vencimiento){
            return true;
        }
        return false;
    }

    public void CuentaCorrienteComercial(String id, String empresa, float importeTotal, Date vencimiento){
        this.id = id;
        this.empresa = empresa;
        this.importeTotal = importeTotal;
        this.vencimiento = vencimiento;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public String getId(){
        return id;
    }


}