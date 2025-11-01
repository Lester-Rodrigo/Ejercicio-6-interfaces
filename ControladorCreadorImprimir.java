import java.util.Scanner;

public class ControladorCreadorImprimir {

    ControladroCreador controladorCreador = new ControladroCreador();

    Scanner input = new Scanner(System.in);
    //Id
    int idAccionables = 0;
    int idMedibles = 0;
    int idRegistrables = 0;
    //Atributos para crear equipos
    int tipoContrato;
    int tipoEquipo;
    String nombre;
    int id;
    double consumoElectrico;
    int usosHechos;
    int usosMaximos;
    boolean disponibilidad;
    String sector;

    public ControladorCreadorImprimir () {
    }

        public ControladroCreador getControladorCreador() {
        return controladorCreador;
    }

    public String crearEquipos (){

        System.out.println("-------Ingrese el tipo de contrato:-------");
        System.out.println("1: Accionable");
        System.out.println("2: Medible");
        System.out.println("3: Registrable");
        tipoContrato = input.nextInt();
        if (tipoContrato == 1) {
            System.out.println("-------Ingrese el tipo de equipo:------- ");
            System.out.println("1: Equipo de Riego");
            tipoEquipo = input.nextInt();
            input.nextLine();
            idAccionables = idAccionables + 1;
            id = idAccionables;
            System.out.println("Ingrese el nombre del equipo: ");
            nombre = input.nextLine();
            System.out.println("Ingrese el consumo eléctrico del equipo: ");
            consumoElectrico = input.nextDouble();
            System.out.println("Ingrese los usos máximos del equipo: ");
            usosMaximos = input.nextInt();
            controladorCreador.crearEquipo(tipoContrato, tipoEquipo, nombre, id, consumoElectrico, 
            usosHechos, usosMaximos, disponibilidad, null);
        }
        else if (tipoContrato == 2) {
            System.out.println("-------Ingrese el tipo de equipo:------- ");
             System.out.println("1: Equipo de Campo");
            tipoEquipo = input.nextInt();
            input.nextLine();
            idMedibles = idMedibles + 1;
            id = idMedibles;
            System.out.println("Ingrese el nombre del equipo: ");
            nombre = input.nextLine();
            System.out.println("Ingrese el sector asigando al equipo: ");
            sector = input.nextLine();
            System.out.println("Ingrese el consumo eléctrico del equipo: ");
            consumoElectrico = input.nextDouble();
            System.out.println("Ingrese los usos máximos del equipo: ");
            usosMaximos = input.nextInt();
            controladorCreador.crearEquipo(tipoContrato, tipoEquipo, nombre, id, consumoElectrico, 
            usosHechos, usosMaximos, disponibilidad, sector);
        }
        else if (tipoContrato == 3) {
            System.out.println("-------Ingrese el tipo de equipo:------- ");
            System.out.println("1: Drone de Monitoreo");
            tipoEquipo = input.nextInt(); 
            input.nextLine();
            idRegistrables = idRegistrables + 1;
            id = idRegistrables;
            System.out.println("Ingrese el nombre del equipo: ");
            nombre = input.nextLine();
            System.out.println("Ingrese el sector asigando al equipo: ");
            sector = input.nextLine();
            System.out.println("Ingrese el consumo eléctrico del equipo: ");
            consumoElectrico = input.nextDouble();
            System.out.println("Ingrese los usos máximos del equipo: ");
            usosMaximos = input.nextInt();
            controladorCreador.crearEquipo(tipoContrato, tipoEquipo, nombre, id, consumoElectrico, 
            usosHechos, usosMaximos, disponibilidad, sector);
        }
        return "Equipo creado exitosamente.";
    }

}
