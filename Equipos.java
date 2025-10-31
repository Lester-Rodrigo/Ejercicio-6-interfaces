public class Equipos {
    protected String nombre;
    protected int id;
    protected double consumoElectrico;
    protected int usosHechos;
    protected int usosMaximos;
    protected boolean estado;

    public Equipos(String nombre, int id, double consumoElectrico, int usosMaximos) {
        this.nombre = nombre;
        this.id = id;
        this.consumoElectrico = consumoElectrico;
        this.usosHechos = 0;
        this.usosMaximos = usosMaximos;
        this.estado = true;
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

    public void setUsosHechos(int usosHechos) {
        this.usosHechos = usosHechos;
    }

    public int getUsosMaximos() {
        return usosMaximos;
    }

    public void setUsosMaximos() {
        this.usosMaximos = this.usosMaximos + 1  ; 
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado() {
        if (this.usosHechos > this.usosMaximos) {
            this.estado = false;
        }
        else {
            this.estado = true;
        }
    }
    
}
