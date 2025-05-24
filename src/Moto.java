public class Moto extends Vehiculo{

    private double Cilindraje;
    private double pctecno=160000;

    public Moto() {
    }

    @Override
    public int tipo() {
        return 2;
    }

    public Moto(int año, String marca, String modelo, String placa, double cilindraje) {
        super(año, marca, modelo, placa);
        Cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        Cilindraje = cilindraje;
    }

    public double getPctecno() {
        return pctecno;
    }

    public void setPctecno(double pctecno) {
        this.pctecno = pctecno;
    }

    @Override
    public String toString() {
        return "MOTO" +
                "\n Cilindraje = " + Cilindraje +
                "\n Precio Tecno = " + pctecno +
                "\n Año = " + Año +
                "\n Marca = " + Marca +
                "\n Modelo = " + Modelo +
                "\n Placa = " + Placa +
                "\n Resultado Simulacion = " + rtarevision ;
    }
}
