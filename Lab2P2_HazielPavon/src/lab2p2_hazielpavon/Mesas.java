package lab2p2_hazielpavon;

public class Mesas {

    private int Platos;
    private int utencilios;
    private int Precio;
    private int total2;

    public Mesas() {

    }

    public Mesas(int Platos, int utencilios, int Precio, int total2) {
        this.Platos = Platos;
        this.utencilios = utencilios;
        this.Precio = Precio;
        this.total2 = total2;
    }

    public int getPlatos() {
        return Platos;
    }

    public void setPlatos(int Platos) {
        this.Platos = Platos;
    }

    public int getUtencilios() {
        return utencilios;
    }

    public void setUtencilios(int utencilios) {
        this.utencilios = utencilios;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    @Override
    public String toString() {
        return " Platos = " + Platos + " , utencilios = " + utencilios + " , Precio = " + Precio + " , total2 = " + total2;
    }

}
