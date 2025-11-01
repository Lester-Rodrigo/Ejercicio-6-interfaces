import java.util.ArrayList;

import Equipos.DronesMonitores;
import Equipos.Equipo;
import Equipos.EquipoRegado;
import Equipos.EquiposCampo;

public class ControladroCreador {
    private boolean equipoNuevo = true;

    private ArrayList<Equipo> listaEquipos = new ArrayList<>();
    DronesMonitores dron1 = new DronesMonitores("Dron Alpha", 101, 
    15.5, 100, "Sector A");
    DronesMonitores dron2 = new DronesMonitores("Dron Beta", 102, 
    15.5, 100, "Sector B");
    DronesMonitores dron3 = new DronesMonitores("Dron Sigma", 103, 
    15.5, 100, "Sector C");
    EquipoRegado equipoRegado1 = new EquipoRegado("Aspersor 1", 15, 20.5, 
    500, "Sector G");
    EquipoRegado equipoRegado2 = new EquipoRegado("Aspersor 2", 16, 20.5, 
    500, "Sector H");
    EquipoRegado equipoRegado3 = new EquipoRegado("Aspersor 3", 17, 20.5, 
    500, "Sector I");
    EquiposCampo equiposCampo1 = new EquiposCampo("Pala electrónica", 10, 15.7, 600);
    EquiposCampo equiposCampo2 = new EquiposCampo("Hoz electrónica", 11, 15.7, 600);
    EquiposCampo equiposCampo3 = new EquiposCampo("Hacha electrónica", 12, 15.7, 600);
    EquiposCampo equiposCampo4 = new EquiposCampo("Rastrillos electrónica", 9, 15.7, 600);

    public ControladroCreador(){
        listaEquipos.add(dron1);
        listaEquipos.add(dron2);
        listaEquipos.add(dron3);
        listaEquipos.add(equipoRegado1);
        listaEquipos.add(equipoRegado2);
        listaEquipos.add(equipoRegado3);
        listaEquipos.add(equiposCampo1);
        listaEquipos.add(equiposCampo2);
        listaEquipos.add(equiposCampo3);
        listaEquipos.add(equiposCampo4);
    }

    public boolean crearEquipo(int tipoContrato, int tipoEquipo, String nombre, int id, double consumoElectrico, int usosHechos, 
    int usosMaximos, boolean disponibilidad, String sector){
        equipoNuevo = true;
        if (tipoContrato == 1) {
            switch (tipoEquipo) {
                case 1:
                    EquipoRegado equipoRegado = new EquipoRegado(nombre, id, consumoElectrico, usosMaximos, sector);
                    listaEquipos.add(equipoRegado);
                    break;
            }
        } 
        else if (tipoContrato == 2) {
            switch (tipoEquipo) {
                case 1:
                    EquiposCampo equipoCampo = new EquiposCampo(nombre, id, consumoElectrico, usosMaximos);
                    listaEquipos.add(equipoCampo);
                    break;
            }
        } 
        else if (tipoContrato == 3) {
            switch (tipoEquipo) {
                case 1:
                    DronesMonitores dron = new DronesMonitores(nombre, id, consumoElectrico, usosMaximos, sector);
                    listaEquipos.add(dron);
                    break;
            }
        }
        return equipoNuevo;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

}
