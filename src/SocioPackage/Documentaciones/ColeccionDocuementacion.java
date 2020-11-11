package SocioPackage.Documentaciones;

import SocioPackage.Accionistas.Accionista;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDocuementacion {
    private List<Documentacion> documentaciones = new ArrayList<Documentacion>();


    public ColeccionDocuementacion(List<Documentacion>documentaciones){
        this.documentaciones = documentaciones;
    }

    public List<Documentacion> getAll(){
        return documentaciones;
    }

    public Documentacion getDocumentacion(Integer id){

        Documentacion resultado = null;
        for(int i = 0;i<documentaciones.size();i++){
            if(documentaciones.get(i).getDocumentacionId() == id){
                resultado = documentaciones.get(i);
                break;
            }
        }
        return resultado;
    }

    public void cambiarEstado(Integer id,EstadoDocumentacion nuevoEstado){
        Documentacion resultado = null;
        for(int i = 0;i<documentaciones.size();i++){
            if(documentaciones.get(i).getDocumentacionId() == id){
                //resultado = accionistas.get(i);
                break;
            }
        }

    }



    public void addDocumentacion(Documentacion nuevaDocumentacion){
        Documentacion aux = getDocumentacion(nuevaDocumentacion.getDocumentacionId());
        if(aux == null){
            documentaciones.add(nuevaDocumentacion);
        }

    }




}
