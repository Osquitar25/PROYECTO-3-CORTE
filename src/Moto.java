public class Moto extends Vehiculo{

    private double Cilindraje;

    public Moto() {
    }

    public Moto(int año, String marca, String modelo, String placa, double cilindraje) {
        super(año, marca, modelo, placa);
        Cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "Cilindraje=" + Cilindraje +
                ", Año=" + Año +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }
}
