package SocioPackage.Facturas;

import SocioPackage.Documentaciones.Documentacion;

import java.util.ArrayList;
import java.util.List;

public class ColeccionFactura {
    private List<Factura> facturas = new ArrayList<Factura>();

    public ColeccionFactura(List<Factura> facturas){
        this.facturas = facturas;
    }

    public List<Factura> getAll(){
        return facturas;
    }

    public Factura getFacturaByNro(String nro){
        Factura resultado = null;
        for(int i = 0;i<facturas.size();i++){
            if(facturas.get(i).getNro() == nro){
                resultado = facturas.get(i);
                break;
            }
        }
        return resultado;
    }



    public void addFactura(Factura factura){
        Factura aux = getFacturaByNro(factura.getNro());
        if(aux == null){
            facturas.add(factura);
        }
    }





}
