import java.util.Scanner;

public class Carro extends Vehiculo{

    String RESET = "\u001B[0m";
    String ROJO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String BLANCO = "\u001B[37m";
    String AZUL = "\u001B[34m";
    String AMARILLO = "\u001B[33m";

    private int Npuertas;
    private double pctecno = 230000;

    public Carro() {
    }

    @Override
    public int tipo() {
        return 1;
    }

    public Carro(int año, String marca, String modelo, String placa, int npuertas) {
        super(año, marca, modelo, placa);
        Npuertas = npuertas;
    }

    public int getNpuertas() {
        return Npuertas;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNpuertas(int npuertas) {
        Npuertas = npuertas;
    }

    public double getPctecno() {
        return pctecno;
    }

    public void setPctecno(double pctecno) {
        this.pctecno = pctecno;
    }


    @Override
    public String toString() {
        return "CARRO" +
                "\n Numero de puertas = " + Npuertas +
                "\n Precio Tecno = " + pctecno +
                "\n Año = " + Año +
                "\n Marca = " + Marca +
                "\n Modelo = " + Modelo +
                "\n Placa = " + Placa +
                "\n Resultado Simulacion = " + rtarevision ;
    }
}
