package lab2p2_hazielpavon;

public class Meseros {

    private String Nombre;
    private int edad;
    private String Turno;
    private int propina;
    private int sueldo;

    public Meseros(String Nombre, int edad, String Turno, int propina, int sueldo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Turno = Turno;
        this.propina = propina;
        this.sueldo = sueldo;
    }

    public Meseros() {

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

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return   " Nombre = " + Nombre + " , edad = " + edad + " , Turno = " + Turno + ", propina = " + propina + " , sueldo = " + sueldo;
    }

}
