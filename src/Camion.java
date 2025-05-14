public class Camion extends Vehiculo{

    private double Peso;

    public Camion() {
    }

    public Camion(int año, String marca, String modelo, String placa, double peso) {
        super(año, marca, modelo, placa);
        Peso = peso;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "Peso=" + Peso +
                ", Año=" + Año +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }
}
