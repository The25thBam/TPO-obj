package OperacionPackage.Prestamos;

// no se usa?
import SocioPackage.Documentaciones.Documentacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColeccionesPrestamo {
    private List<Prestamo> prestamos = new ArrayList<Prestamo>();

    public ColeccionesPrestamo(List<Prestamo> prestamos){
        this.prestamos = prestamos;
    }

    public List<Prestamo> getAll(){
        return prestamos;
    }

    public Prestamo getPrestamoByFecha(Date fecha){
        Prestamo resultado = null;
        for(int i = 0;i<prestamos.size();i++){
            if(prestamos.get(i).getFecha() == fecha){
                resultado = prestamos.get(i);
                break;
            }
        }
        return resultado;
    }



    public void addPrestamo(Prestamo prestamo){
        Prestamo aux = getPrestamoByFecha(prestamo.getFecha());
        if(aux == null){
            prestamos.add(prestamo);
        }
    }





}
