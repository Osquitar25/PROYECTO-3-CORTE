public abstract class Vehiculo {

    protected String Marca;
    protected String Modelo;
    protected int Año;
    protected String Placa;
    protected Simular rtarevision;
    protected int tipo;


    public Vehiculo() {
    }

    public Vehiculo(int año, String marca, String modelo, String placa) {
        Año = año;
        Marca = marca;
        Modelo = modelo;
        Placa = placa;
    }
    public int tipo(){
        return tipo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public Simular getRtarevision() {
        return rtarevision;
    }

    public void setRtarevision(Simular rtarevision) {
        this.rtarevision = rtarevision;
    }

    @Override
    public String toString() {
        return "VEHICULO" +
                "\n Año =" + Año +
                "\n Marca =" + Marca +
                "\n Modelo =" + Modelo +
                "\n Placa =" + Placa +
                "\n rtarevision =" + rtarevision;
    }
}
