public class Camion extends Vehiculo{

    private double Peso;
    private double pctecno=350000;

    public Camion() {
    }

    @Override
    public int tipo() {
        return 3;
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

    public double getPctecno() {
        return pctecno;
    }

    public void setPctecno(double pctecno) {
        this.pctecno = pctecno;
    }

    @Override
    public String toString() {
        return "CAMION" +
                "\n pctecno = " + pctecno +
                "\n Peso = " + Peso +
                "\n Año = " + Año +
                "\n Marca = " + Marca +
                "\n Modelo = " + Modelo +
                "\n Placa = " + Placa +
                "\n Resultado Simulacion = " + rtarevision ;
    }
}
