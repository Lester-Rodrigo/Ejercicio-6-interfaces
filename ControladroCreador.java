import java.util.ArrayList;

import Equipos.DronesMonitores;
import Equipos.Equipo;
import Equipos.EquipoRegado;
import Equipos.EquiposCampo;

public class ControladroCreador {

    private ArrayList<Equipo> listaEquipos = new ArrayList<>();
    DronesMonitores dron1 = new DronesMonitores("Dron Alpha", 101, 
    15.5, 100, "Sector A");

    public ControladroCreador(){
        listaEquipos.add(dron1);
    }

    public void crearEquipo(int tipoContrato, int tipoEquipo, String nombre, int id, double consumoElectrico, int usosHechos, 
    int usosMaximos, boolean disponibilidad, String sector){
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
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

}
