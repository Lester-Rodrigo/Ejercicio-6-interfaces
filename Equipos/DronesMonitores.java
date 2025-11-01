package Equipos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Cotratos.Registrable;

public class DronesMonitores extends Equipo implements Registrable{
    private String sector;
    private LocalDateTime fechaUltimoVuelo; 

    public DronesMonitores(String nombre, int id, double consumoElectrico, int usosMaximos, String sector) {
        super(nombre, id, consumoElectrico, usosMaximos);
        this.sector = sector;
        this.fechaUltimoVuelo = null;
    }

    @Override
    public String registro() {
        return "El dron monitor: " + this.nombre + " con ID " + this.id + ") ha realizado " + this.usosHechos 
        + " vuelo(s) en el sector " + this.sector + ".";
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDateTime getFechaUltimoVuelo() {
        return fechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo() {
         LocalDateTime vueloReciente = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String asignarUltimoVuelo = vueloReciente.format(formato);
        this.fechaUltimoVuelo = LocalDateTime.parse(asignarUltimoVuelo, formato);
    }
    
}
