package Equipos;
import Cotratos.Accionable;

public class EquipoRegado extends Equipo implements Accionable{
    private String sector;

    public EquipoRegado(String nombre, int id, double consumoElectrico, int usosMaximos, String sector) {
        super(nombre, id, consumoElectrico, usosMaximos);
        this.sector = sector;
    }

    @Override
    public String accion() {
        return "El equipo de regado: " + this.nombre + " con ID " + this.id + ") ha regado el sector" + this.sector + ".";
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
}
