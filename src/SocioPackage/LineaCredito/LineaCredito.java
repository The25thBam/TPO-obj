package SocioPackage.LineaCredito;

import java.util.Date;

public class LineaCredito {

    private Float monto;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean aprobada;
    //Esto no se para que es
    private Character estado;

    public  LineaCredito(Float monto,Date fechaInicio,Date fechaFin,Boolean aprobada,Character estado){
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aprobada = aprobada;
        this.estado = estado;
    }

}
