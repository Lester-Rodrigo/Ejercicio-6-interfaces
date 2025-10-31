public class Equipos {
    protected String nombre;
    protected int id;
    protected double consumoElectrico;
    protected int usosHechos;
    protected int usosMaximos;
    protected boolean disponibilidad;

    public Equipos(String nombre, int id, double consumoElectrico, int usosMaximos) {
        this.nombre = nombre;
        this.id = id;
        this.consumoElectrico = consumoElectrico;
        this.usosHechos = 0;
        this.usosMaximos = usosMaximos;
        this.disponibilidad = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(double consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getUsosHechos() {
        return usosHechos;
    }

    public void setUsosHechos() {
        this.usosHechos = this.usosHechos + 1;
    }

    public int getUsosMaximos() {
        return usosMaximos;
    }

    public void setUsosMaximos(int ampliacion) {
        this.usosMaximos = this.usosMaximos + ampliacion; 
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad() {
        if (this.usosHechos > this.usosMaximos) {
            this.disponibilidad = false;
        }
        else {
            this.disponibilidad = true;
        }
    }
    
}
