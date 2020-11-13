package SocioPackage.LineaCredito;

import java.util.Date;

public class LineaCredito {

    private Float monto;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean aprobada;
    //Esto no se para que es
	//Era para saber si esta endeudado o no(creo)
    private Character estado;

    public  LineaCredito(Float monto,Date fechaInicio,Date fechaFin,Boolean aprobada,Character estado){
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aprobada = aprobada;
        this.estado = estado;
    }



    public Float obtenerMonto(){
        return monto;
    }


    public Boolean estaAprobada(){
        return aprobada;
    }


    public  Character getEstado(){
        return estado;
    }

}
