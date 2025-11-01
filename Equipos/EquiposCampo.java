package Equipos;
import Cotratos.Medible;

public class EquiposCampo extends Equipo implements Medible{

    public EquiposCampo(String nombre, int id, double consumoElectrico, int usosMaximos) {
        super(nombre, id, consumoElectrico, usosMaximos);
    }
    @Override
    public String medicion() {
        return "El equipo de campo: " + this.nombre + " ha realizado " + this.usosHechos + " tarabajo(s).";
    }
    
}
