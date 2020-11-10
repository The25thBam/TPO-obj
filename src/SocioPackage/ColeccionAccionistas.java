package SocioPackage;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAccionistas {
    private List<Accionista> accionistas = new ArrayList<Accionista>();

    public ColeccionAccionistas(List<Accionista> accionistas){
        this.accionistas = accionistas;
    }


    public List<Accionista> getAll(){
        return accionistas;
    }


}
