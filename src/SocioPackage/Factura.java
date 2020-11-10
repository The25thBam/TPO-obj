package SocioPackage;

public class Factura {
    private String nro;
    private Float importe;
    private Character tipo;


    public Factura(String nro,Float importe,Character tipo){
        this.nro = nro;
        this.importe = importe;
        this.tipo = tipo;
    }


    public Float getImporteFactura(){
        return importe;
    }


}
