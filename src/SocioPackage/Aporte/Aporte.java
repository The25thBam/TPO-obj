package SocioPackage.Aporte;

import java.util.Date;

public class Aporte {
    private Integer monto;
    private Date fechaAporte;

    public Aporte(Integer monto,Date fechaAporte){
        this.monto = monto;
        this.fechaAporte = fechaAporte;
    }


    public Integer getMonto(){
        return monto;
    }

    public Date getFecha(){
        return fechaAporte;
    }




}
