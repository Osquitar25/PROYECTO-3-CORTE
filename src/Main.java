import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String BLANCO = "\u001B[37m";
        String AZUL = "\u001B[34m";
        String MORADO = "\u001B[35m";

        Scanner teclado=new Scanner(System.in);
        List<Vehiculo>listvehi=new ArrayList<>();

        int opc;
        do {
            System.out.println(MORADO+ """
                    KaOs Motors 🏎💨
                    🏁🛠 " Si llego en grúa, se va rugiendo " 🛠🏁"""+RESET);
            System.out.println(AZUL+"""
                1)REGISTRAR VEHICULO
                2)BUSCAR VEHICULO
                3)SIMULAR TECNO
                4)GENERAR RECIBO
                5)SALIR"""+RESET);
            opc= teclado.nextInt();

            switch (opc){
                case 1->{

                    String marca,modelo,placa;
                    int año,opc1,npuertas;
                    double cilindraje,peso;

                    System.out.println(AZUL+"""
                        1)AGREGAR CARRO 🚗
                        2)AGREGAR MOTO 🏍
                        3)AGREGAR CAMION 🚚"""+RESET);
                    opc1= teclado.nextInt();
                    System.out.println(AZUL+"Digite la marca"+RESET);
                    marca=teclado.next();
                    System.out.println(AZUL+"Digite el modelo"+RESET);
                    modelo=teclado.next();
                    System.out.println(AZUL+"Digite el año"+RESET);
                    año= teclado.nextInt();
                    System.out.println(AZUL+"Digite la placa"+RESET);
                    placa=teclado.next();
                    if (opc1==1){
                        System.out.println(AZUL+"Ingrese numero de puertas"+RESET);
                        npuertas= teclado.nextInt();
                        listvehi.add(new Carro(año,marca,modelo,placa,npuertas));
                    } else if (opc1==2) {
                        System.out.println(AZUL+"Ingrese el cilindraje"+RESET);
                        cilindraje=teclado.nextDouble();
                        listvehi.add(new Moto(año,marca,modelo,placa,cilindraje));
                    } else if (opc1==3) {
                        System.out.println(AZUL+"Ingrese peso"+RESET);
                        peso= teclado.nextDouble();
                        listvehi.add(new Camion(año,marca,modelo,placa,peso));
                    }else {
                        System.out.println(ROJO+"OPCION NO VALIDA"+RESET);
                    }
                }
                case 2->{
                    String placa;
                    System.out.println(AZUL+"Digite la placa del vehiculo que desea ver"+RESET);
                    placa= teclado.next();
                    for (Vehiculo vehiculo: listvehi){
                        if (vehiculo.getPlaca().equals(placa)){
                            System.out.println(vehiculo);
                        }
                    }
                }
                case 3->{
                    Taller taller = new Taller();
                    Simular simular = new Simular();

                    String placaa;

                    boolean placaencontrada =false;
                    System.out.println(AZUL+"Ingrese la placa del vehiculo a buscar"+RESET);
                    placaa=teclado.next();

                    for (Vehiculo vehiculo:listvehi){
                        if (vehiculo.getPlaca().equals(placaa)){
                            placaencontrada=true;

                            simular.revisarVehiculos(teclado);
                            vehiculo.setRtarevision(simular);
                            if (simular.siEsAprobado()){
                                System.out.println(VERDE+"✅✅✅El vehiculo es aproado✅✅✅"+RESET);
                            }else {
                                System.out.println(ROJO+"❌❌❌El vehiculo no es aprobado❌❌❌"+RESET);
                            }
                            System.out.println(AZUL+"\uD83C\uDFC1\uD83C\uDFC1\uD83C\uDFC1RESUMEN DE LA REVISION:\uD83C\uDFC1\uD83C\uDFC1\uD83C\uDFC1"+RESET);

                            taller.setFrenos(simular.isFrenos());
                            taller.setVolante(simular.isVolante());
                            taller.setLuces(simular.isLuces());
                            taller.setLmgases(simular.getLmgases());
                            taller.setLabrado(simular.getLabrado());

                            taller.revisarVehiculos(teclado);
                        }
                    }
                }
                case 4->{

                    String pla;
                    int rta;
                    boolean placa=false;
                    Taller taller=new Taller();

                    System.out.println(MORADO+"""
                            Desea generar el recibo con:
                            1)Solo simulacion de tecno
                            2)Simulacion y arreglos en el taller"""+RESET);
                    rta=teclado.nextInt();

                    System.out.println(MORADO+"Digite la placa "+RESET);
                    pla=teclado.next();

                    if (rta==1){
                        System.out.println(MORADO+"""
                                KaOs Motors 🏎💨
                    🏁🛠 " Si llego en grúa, se va rugiendo " 🛠🏁
                    """+RESET);
                        System.out.println(MORADO+"Sus simulacion de tecno es la siguiente"+RESET);
                        for (Vehiculo vehiculo: listvehi){
                            if (vehiculo.getPlaca().equals(pla)){
                                Simular simular = vehiculo.getRtarevision();
                                placa=true;
                                taller.setFrenos(simular.isFrenos());
                                taller.setVolante(simular.isVolante());
                                taller.setLuces(simular.isLuces());
                                taller.setLmgases(simular.getLmgases());
                                taller.setLabrado(simular.getLabrado());
                                taller.revisarVehiculos(teclado);
                            }
                        }
                        System.out.println(MORADO+"PRECIO FINAL:     200.000"+RESET);
                    }else if (rta==2){
                        for (Vehiculo vehiculo: listvehi){
                        if (vehiculo.getPlaca().equals(pla)){
                            Simular simular = vehiculo.getRtarevision();
                            placa=true;
                            taller.setFrenos(simular.isFrenos());
                            taller.setVolante(simular.isVolante());
                            taller.setLuces(simular.isLuces());
                            taller.setLmgases(simular.getLmgases());
                            taller.setLabrado(simular.getLabrado());
                            taller.revisarVehiculos(teclado);
                        }
                    }


                    }
                }
                case 5->{
                    System.out.println(MORADO+ "🏁🛠 SIGUE RUGIENDO CON KaOs 🛠🏁 " +RESET);
                }
            }
        }while (opc!=5);
    }
}