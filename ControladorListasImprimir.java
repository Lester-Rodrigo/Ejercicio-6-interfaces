import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Equipos.DronesMonitores;
import Equipos.Equipo;

public class ControladorListasImprimir {

    Main main = new Main();

    Scanner input = new Scanner(System.in);
    int pagina;
    int pagina2;

    int idEspecifico = 0;
    String nombreEspecifico = null;
    boolean coinsidencia = true;

    public ControladorListasImprimir () {
    }

    public void accederListas () {
        for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
             System.out.println(equipo.getId() + "): " + equipo.getNombre() + " consume: "+ equipo.getConsumoElectrico() + " watts.");
        }
        System.out.println("-------¿Qué desea hacer?-------");
        System.out.println("1. Ordenar catálogo por id");
        System.out.println("2. Ordenar catálogo por nombre");
        System.out.println("3. Ordenar catálogo por su consumo eléctrico");
        System.out.println("4. Buscar equipo en específico");
        System.out.println("Seleccione una opción del 1 al 4: ");
        pagina = input.nextInt();
        switch (pagina) {
            case 1:
                main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos().sort(Comparator.comparing(Equipo::getId));
                for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                    System.out.println(equipo.getId() + "): " + equipo.getNombre() + 
                    " consume: "+ equipo.getConsumoElectrico() + " watts.");
                }
                System.out.println("----------------------------------------------------------------------");
                break;
        
            case 2:
                main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos().sort(Comparator.comparing(Equipo::getNombre));
                for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                    System.out.println(equipo.getId() + "): " + equipo.getNombre() + 
                    " consume: "+ equipo.getConsumoElectrico() + " watts.");
                }
                System.out.println("----------------------------------------------------------------------");
                break;

            case 3:
                main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos().sort(Comparator.comparing(Equipo::getConsumoElectrico));
                for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                    System.out.println(equipo.getId() + "): " + equipo.getNombre() + 
                    " consume: "+ equipo.getConsumoElectrico() + " watts.");
                }
                System.out.println("----------------------------------------------------------------------");
                break;

            case 4:
                for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                    System.out.println(equipo.getId() + "): " + equipo.getNombre() + 
                    " consume: "+ equipo.getConsumoElectrico() + " watts.");
                }
                System.out.println("-------Desea buscar el equipo por:-------");
                System.out.println("1. Por id");
                System.out.println("2. Por nombre");
                System.out.println("Seleccione una opción del 1 al 2: ");
                pagina2 = input.nextInt();
                System.out.println("----------------------------------------------------------------------");
                switch (pagina2) {
                    case 1:
                        System.out.println("-------Ingrese el Id del equipo deseado-------");
                        idEspecifico = input.nextInt();
                        System.out.println("----------------------------------------------------------------------");
                        for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                            if (equipo.getId() == idEspecifico) {
                                if (equipo instanceof DronesMonitores) {
                                System.out.println("Id: " + equipo.getId() + "\n" + "Nombre: " + equipo.getNombre() 
                                + "\n" + "Consumo eléctrico: " + equipo.getConsumoElectrico() + "\n" + "Usos hechos: " 
                                + equipo.getUsosHechos() + "\n" + "Usos máximos: " + equipo.getUsosMaximos() + "\n" 
                                + "Disponibilidad: " + equipo.getDisponibilidad() + "\n" + "último vuelo: " 
                                + ((DronesMonitores)equipo).getFechaUltimoVuelo());
                                coinsidencia = true;
                                break;
                                }
                                else {
                                    System.out.println("Id: " + equipo.getId() + "\n" + "Nombre: " + equipo.getNombre() 
                                    + "\n" + "Consumo eléctrico: " + equipo.getConsumoElectrico() + "\n" + "Usos hechos: " 
                                    + equipo.getUsosHechos() + "\n" + "Usos máximos: " + equipo.getUsosMaximos() + "\n" 
                                    + "Disponibilidad: " + equipo.getDisponibilidad());
                                    coinsidencia = true;
                                    break;
                                }
                            }
                            else {
                                coinsidencia = false;
                            }
                        }
                        if (coinsidencia == false) {
                            System.out.println("No se encontró ninguna coinsidencia");
                        }
                        System.out.println("----------------------------------------------------------------------");
                        break;
                
                    case 2:
                        System.out.println("-------Ingrese el nombre del equipo deseado-------");
                        input.nextLine();
                        nombreEspecifico = input.nextLine();
                        System.out.println("----------------------------------------------------------------------");
                        for (Equipo equipo : main.getControladorCreadorImprimir().getControladorCreador().getListaEquipos()) {
                            if (equipo.getNombre().equals(nombreEspecifico)) {
                                if (equipo instanceof DronesMonitores) {
                                System.out.println("Id: " + equipo.getId() + "\n" + "Nombre: " + equipo.getNombre() 
                                + "\n" + "Consumo eléctrico: " + equipo.getConsumoElectrico() + "\n" + "Usos hechos: " 
                                + equipo.getUsosHechos() + "\n" + "Usos máximos: " + equipo.getUsosMaximos() + "\n" 
                                + "Disponibilidad: " + equipo.getDisponibilidad() + "\n" + "último vuelo: " 
                                + ((DronesMonitores)equipo).getFechaUltimoVuelo());
                                coinsidencia = true;
                                break;
                                }
                                else {
                                    System.out.println("Id: " + equipo.getId() + "\n" + "Nombre: " + equipo.getNombre() 
                                    + "\n" + "Consumo eléctrico: " + equipo.getConsumoElectrico() + "\n" + "Usos hechos: " 
                                    + equipo.getUsosHechos() + "\n" + "Usos máximos: " + equipo.getUsosMaximos() + "\n" 
                                    + "Disponibilidad: " + equipo.getDisponibilidad());
                                    coinsidencia = true;
                                    break;
                                }
                            }
                           else {
                                coinsidencia = false;
                            }
                        }
                        if (coinsidencia == false) {
                            System.out.println("No se encontró ninguna coinsidencia");
                        }
                        System.out.println("----------------------------------------------------------------------");
                        break;
                }
                break;
        }
    }
}
