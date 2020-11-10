package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class Documentacion {
    private String tipo;
    private EstadoDocumentacion estado;


    private List<Documentacion> socios = new ArrayList<Documentacion>();

    public Documentacion(String tipo,EstadoDocumentacion estado){
        this.tipo = tipo;
        this.estado = estado;
    }





}
