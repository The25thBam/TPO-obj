package SocioPackage.Accionistas;

import java.util.ArrayList;
import java.util.List;

public class Accionista {
    private String CUIL;
    private Integer porcentaje;

    public Accionista(String CUIL,Integer porcentaje){
        this.CUIL = CUIL;
        this.porcentaje = porcentaje;
    }


    public String getCuil(){
        return CUIL;
    }







}
