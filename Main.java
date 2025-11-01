import java.util.Scanner;

import Equipos.DronesMonitores;
import Equipos.Equipo;
import Equipos.EquipoRegado;
import Equipos.EquiposCampo;

public class Main {

    private static ControladorCreadorImprimir controladorCreadorImprimir = new ControladorCreadorImprimir();
    public static void main(String[] args) {

        ControladorListasImprimir listasImprimir = new ControladorListasImprimir();

        //Scanner para registrara ingresos
        Scanner input = new Scanner(System.in);
        int pagina;
        int idEquipo;

        do{
            do {
                System.out.println("------Menú Principal------");
                System.out.println("1. Ver catálogo");
                System.out.println("2. Ingresar nuevo equipo");
                System.out.println("3. Activar equipos");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opción del 1 al 4: ");
                pagina = input.nextInt();
            }while (pagina < 1 || pagina > 4);
            switch (pagina) {
                case 1:
                    System.out.println("-------Catálogo de equipos:-------");
                    listasImprimir.accederListas();
                    break;

                case 2:
                    controladorCreadorImprimir.crearEquipos();
                    break;

                case 3:
                    for (Equipo equipo : controladorCreadorImprimir.getControladorCreador().getListaEquipos()) {
                        System.out.println(equipo.getId() + "): " + equipo.getNombre() 
                        + " consume: "+ equipo.getConsumoElectrico() + " watts.");
                    }
                    System.out.println("-------Ingrese el id del equipo a activar:-------");
                    idEquipo = input.nextInt();
                    for (Equipo equipo : controladorCreadorImprimir.getControladorCreador().getListaEquipos()) {
                        if (idEquipo == equipo.getId()) {
                            equipo.setUsosHechos();
                            if (equipo instanceof DronesMonitores) {
                                ((DronesMonitores)equipo).setFechaUltimoVuelo();
                                System.out.println(((DronesMonitores)equipo).registro());
                            }
                            else if (equipo instanceof EquipoRegado) {
                                System.out.println(((EquipoRegado)equipo).accion());
                            }
                            else if (equipo instanceof EquiposCampo) {
                                System.out.println(((EquiposCampo)equipo).medicion());
                            }
                            
                        }
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;
            }

        } while (pagina != 4);
    }

    public static ControladorCreadorImprimir getControladorCreadorImprimir() {
        return controladorCreadorImprimir;
    }

    public Main () {
    }
}
