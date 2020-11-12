package SocioPackage.Aporte;

import SocioPackage.Accionistas.Accionista;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAportes {
    private List<Aporte> aportes = new ArrayList<Aporte>();;

    public ColeccionAportes(List<Aporte>aportes){
        this.aportes = aportes;
    }


    public void agregarAporte(Aporte aporte){
        aportes.add(aporte);
    }

    public List<Aporte> getAll(){
        return aportes;
    }
}
