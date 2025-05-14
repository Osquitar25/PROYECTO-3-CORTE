import java.util.Random;
import java.util.Scanner;

public class Simular {
    String RESET = "\u001B[0m";
    String ROJO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String BLANCO = "\u001B[37m";
    String AZUL = "\u001B[34m";
    String AMARILLO = "\u001B[33m";

    protected boolean frenos;
    protected boolean volante;
    protected boolean luces;
    protected double lmgases;
    protected double labrado;


    public Simular() {
    }

    public Simular(boolean frenos, double labrado, double lmgases, boolean luces, boolean volante) {
        this.frenos = frenos;
        this.labrado = labrado;
        this.lmgases = lmgases;
        this.luces = luces;
        this.volante = volante;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    public double getLabrado() {
        return labrado;
    }

    public void setLabrado(double labrado) {
        this.labrado = labrado;
    }

    public double getLmgases() {
        return lmgases;
    }

    public void setLmgases(double lmgases) {
        this.lmgases = lmgases;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }
    public void revisarVehiculos(Scanner scanner){
        int rtaf,rtav,rtal,rtal2;
        System.out.println(AMARILLO+"""
                Sus frenos estan en buen estado
                1)si
                2)no"""+RESET);
        rtaf= scanner.nextInt();

        if (rtaf==1){
            frenos=true;
        }else {
            frenos=false;
        }
        System.out.println(AMARILLO+"""
                El volante regresa a su posicion tras una curva
                1)si
                2)no"""+RESET);
        rtav=scanner.nextInt();
        if (rtav==1){
            volante=true;
        }else {
            volante=false;
        }
        System.out.println(AMARILLO+"""
                Todas las luces encienden
                1)si
                2)no"""+RESET);
        rtal=scanner.nextInt();
        System.out.println(AMARILLO+"""
                Las luces delanteras estan bien alineadas
                1)si
                2)no"""+RESET);
        rtal2=scanner.nextInt();
        if (rtal==1 && rtal2==1){
            luces=true;
        }else {
            luces=false;
        }

        System.out.println(AMARILLO+"En cuanto se encuentra el limite de gases"+RESET);
        Random lmtegas=new Random();
        lmgases=lmtegas.nextDouble(2.5)+0.5;
        System.out.println(AMARILLO+" "+RESET+lmgases);
        if (lmgases <= 1.5){
            System.out.println(VERDE+"✅✅✅Cumple con el limite de gases✅✅✅"+RESET);
        }else {
            System.out.println(ROJO+"❌❌❌No cumple con el limite de gases❌❌❌"+RESET);
        }
        System.out.println(AMARILLO+"En cuanto se encuentra la profundidad del labrado"+RESET);
        Random lmtelabra=new Random();
        labrado=lmtelabra.nextDouble(3.0)+0.0;
        System.out.println(AMARILLO+" "+RESET+labrado);
        if (labrado >= 1.6){
            System.out.println(VERDE+"✅✅✅Cumple con el minimo del labrado✅✅✅"+RESET);
        }else {
            System.out.println(ROJO+"❌❌❌No cumple con el minimo del labrado❌❌❌"+RESET);
        }
    }
    public boolean siEsAprobado (){
        return frenos && volante && luces && lmgases<=1.5 && labrado>=1.6;
    }

    @Override
    public String toString() {
        return "Simular{" +
                "frenos=" + frenos +
                ", volante=" + volante +
                ", luces=" + luces +
                ", lmgases=" + lmgases +
                ", labrado=" + labrado +
                '}';
    }
}
