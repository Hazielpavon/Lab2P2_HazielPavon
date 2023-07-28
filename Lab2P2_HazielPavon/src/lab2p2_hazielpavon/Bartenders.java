package lab2p2_hazielpavon;

public class Bartenders {

    private String Nombre;
    private int edad;
    private String Turno;
    private int licores;
    private int sueldo;

    public Bartenders(String Nombre, int edad, String Turno, int licores, int sueldo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Turno = Turno;
        this.licores = licores;
        this.sueldo = sueldo;
    }

    public Bartenders() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return " Nombre = " + Nombre + " , edad = " + edad + " , Turno = " + Turno + " , licores = " + licores + " , sueldo = " + sueldo;
    }

}
