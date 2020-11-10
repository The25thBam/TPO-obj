package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class Documentacion {
    private Integer id;
    private String tipo;
    private EstadoDocumentacion estado;


    private List<Documentacion> socios = new ArrayList<Documentacion>();

    public Documentacion(Integer id,String tipo,EstadoDocumentacion estado){
        this.tipo = tipo;
        this.estado = estado;






    }

    public void cambiarEstado(Integer id,EstadoDocumentacion nuevoEstado){

    }








}
