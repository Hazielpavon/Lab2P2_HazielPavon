package lab2p2_hazielpavon;

public class Chefs {

    private String Nombre;
    private int edad;
    private String Turno;
    private int estrellas;
    private int sueldo;

    public Chefs(String Nombrex, int edadx, String Turnox, int estrellasx, int sueldox) {
        this.Nombre = Nombrex;
        this.edad = edadx;
        this.Turno = Turnox;
        this.estrellas = estrellasx;
        this.sueldo = sueldox;
    }

    public Chefs() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombrex) {
        this.Nombre = Nombrex;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edadx) {
        this.edad = edadx;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turnox) {
        this.Turno = Turnox;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellasx) {
        this.estrellas = estrellasx;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldox) {
        this.sueldo = sueldox;
    }

    @Override
    public String toString() {
        return " Nombre = " + Nombre + ", edad = " + edad + " , Turno = " + Turno + ", estrellas = " + estrellas + " , sueldo = " + sueldo;
    }

}
