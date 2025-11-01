import java.util.Scanner;

import Equipos.Equipo;

public class Main {

    private static ControladorCreadorImprimir controladorCreadorImprimir = new ControladorCreadorImprimir();
    public static void main(String[] args) {

        //Scanner para registrara ingresos
        Scanner input = new Scanner(System.in);
        int pagina;

        do{
            do {
                System.out.println("------Menú Principal------");
                System.out.println("1. Ver catálogo");
                System.out.println("2. Ingresar nuevo equipo");
                System.out.println("3. Activar equipos");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opción del 1 al 4: ");
                pagina = input.nextInt();
                System.out.println("--------------------------");
            }while (pagina < 1 || pagina > 4);
            switch (pagina) {
                case 1:
                    System.out.println("-------Catálogo de equipos:-------");
                    for (Equipo equipo : controladorCreadorImprimir.getControladorCreador().getListaEquipos()) {
                        System.out.println(equipo.getId() + "): " + equipo.getNombre());
                    }
                    break;

                case 2:
                    controladorCreadorImprimir.crearEquipos();
                    break;

                case 3:
                    
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
}
