public class Carro extends Vehiculo{

    private int Npuertas;

    public Carro() {
    }

    public Carro(int año, String marca, String modelo, String placa, int npuertas) {
        super(año, marca, modelo, placa);
        Npuertas = npuertas;
    }

    public int getNpuertas() {
        return Npuertas;
    }

    public void setNpuertas(int npuertas) {
        Npuertas = npuertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Npuertas=" + Npuertas +
                ", Año=" + Año +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }
}
