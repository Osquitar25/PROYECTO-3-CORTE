import java.util.Scanner;

public class Taller extends Simular{

    private double stmafrenos=5000;
    private double stmadireccion=5000;
    private double stamluces=5000;
    private double stmagases=5000;
    private double stmaneumaticos=5000;
    private double stmalimpiabrisas=5000;
    private double stmaclaxon=5000;
    private double bateria=5000;
    private double cinturon=5000;

    String RESET = "\u001B[0m";
    String ROJO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String BLANCO = "\u001B[37m";
    String AZUL = "\u001B[34m";
    String AMARILLO = "\u001B[33m";



    public Taller() {
    }

    public Taller(boolean bateria, boolean cinturon, boolean frenos, double labrado, boolean limpiabri, double lmgases, boolean luces, boolean pito, boolean volante, double stamluces, double stmadireccion, double stmafrenos, double stmagases, double stmaneumaticos) {
        super(bateria, cinturon, frenos, labrado, limpiabri, lmgases, luces, pito, volante);
        this.stamluces = stamluces;
        this.stmadireccion = stmadireccion;
        this.stmafrenos = stmafrenos;
        this.stmagases = stmagases;
        this.stmaneumaticos = stmaneumaticos;
    }

    public double getStamluces() {
        return stamluces;
    }

    public void setStamluces(double stamluces) {
        this.stamluces = stamluces;
    }

    public double getStmadireccion() {
        return stmadireccion;
    }

    public void setStmadireccion(double stmadireccion) {
        this.stmadireccion = stmadireccion;
    }

    public double getStmafrenos() {
        return stmafrenos;
    }

    public void setStmafrenos(double stmafrenos) {
        this.stmafrenos = stmafrenos;
    }

    public double getStmagases() {
        return stmagases;
    }

    public void setStmagases(double stmagases) {
        this.stmagases = stmagases;
    }

    public double getStmaneumaticos() {
        return stmaneumaticos;
    }

    public void setStmaneumaticos(double stmaneumaticos) {
        this.stmaneumaticos = stmaneumaticos;
    }

    public void revisarVehiculos(Scanner scanner){
        if (!isFrenos()){
            System.out.println(ROJO+"!!!LOS FRENOS ESTAN FALLANDO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕FUGAS DE LIQUIDO DE ACEITE
                    ⭕AIRE EN EL SISTEMA
                    ⭕FRENO DE MANO DESGASTDO
                    ⭕PASTILLAS DESGASTADAS"""+RESET);
        }else {
            System.out.println(VERDE+"SUS FRENOS ESTAN EN CORRECTO FUNCIONAMIENTO"+RESET);
        }
        if (!isVolante()){
            System.out.println(ROJO+"!!!El sistema de direccion esta fallando!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS
                    ⭕ROTULAS O TERMINALES DESGASTADAS
                    ⭕HOLGURA EN EL SISTEMA
                    ⭕DIRECCION HIDRAULICA CON FUGAS"""+RESET);
        }else {
            System.out.println(VERDE+"SU SISTEMA DE DIRECCION ESTA EN CORRECTO FUNCIONAMIENTO"+RESET);
        }
        if (!isLuces()){
            System.out.println(ROJO+"!!!SU SISTEMA DE LUCES ESTA FALLANDO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕BOMBILLOS FUNDIDOS
                    ⭕ALINEACION INCORRECTA
                    ⭕INTERRUPTORES DAÑADOS"""+RESET);
        }else {
            System.out.println(VERDE+"SU SISTEMA DE LUCES ESTA EN CORRECTO FUNCIONAMIENTO"+RESET);
        }
        if (lmgases>=1.5){
            System.out.println(ROJO+"!!!SU SISTEMA DE EMISION DE GASES ESTA FALLANDO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕SENSOR DE OXIGENO DAÑADO 
                    ⭕FILTRO DE AIRE OBSTRUIDO
                    ⭕INYECCTORES DEFECTUOSOS"""+RESET);
        }else {
            System.out.println(VERDE+"SU SISTEMA DE EMISION DE GASES ESTA EN CORRECTO FUNCIONAMIENTO"+RESET);
        }
        if (labrado<=1.6){
            System.out.println(ROJO+"!!!SUS NEUMATICOS ESTAN EN MAL ESTADO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕NEUMATICOS LISOS
                    ⭕PRESION INADECUADA
                    ⭕USO DE LLANTAS DIFERENTES POR EJE"""+RESET);
        }else {
            System.out.println(VERDE+"SUS NEUMATICOS ESTAN EN BUEN ESTADO"+RESET);
        }
        if (!isBateria()){
            System.out.println("!!!SU BATERIA ESTA FALLANDO!!!");
            System.out.println("""
                    POSIBLES CAUSAS:
                    ⭕Terminales sulfatados
                    ⭕Batería vieja o descargada
                    ⭕Alternador defectuoso""");
        }else {
            System.out.println("SU BATERIA ESTA EN BUEN ESTADO");
        }

        if (!isCinturon()){
            System.out.println("!!!SU CINTURON ESTA FALLANDO!!!");
            System.out.println("""
                    POSIBLES CAUSAS:
                    ⭕Retractores rotos 
                    ⭕Cinturones cortados o desgastados
                    ⭕No retraen o bloquean correctamente""");
        }else {
            System.out.println("SU CINTURON FUNCIONA CORRECTAMENTE");
        }
        if (!isPito()){
            System.out.println(ROJO+"!!!SU CLAXON ESTA EN MAL ESTADO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕Circuito abierto
                    ⭕Botón de activación dañado
                    ⭕Bocina quemada"""+RESET);
        }else {
            System.out.println(VERDE+"SU CLAXON  ESTA EN BUEN ESTADO"+RESET);
        }
        if (!isLimpiabri()){
            System.out.println(ROJO+"!!!SUS LIMPIABRISAS ESTAN EN MAL ESTADO!!!"+RESET);
            System.out.println(BLANCO+"""
                    POSIBLES CAUSAS:
                    ⭕Motor quemado
                    ⭕Gomas desgastadas
                    ⭕Sin líquido limpiador"""+RESET);
        }else {
            System.out.println(VERDE+"SUS LIMPIABRISAS ESTAN EN BUEN ESTADO"+RESET);
        }
    }
    public void costos(){
        if (!isFrenos()){
            System.out.println("El arreglo del sistema de frenos sale por: "+stmafrenos);
        }
        if (!isLuces()) {
            System.out.println("El arreglo del sistema de luces sale por: "+stamluces);
        }
        if (!isVolante()) {
            System.out.println("El arreglo del sistema de direccion sale por: "+stmadireccion);
        }
        if (lmgases>=1.5) {
            System.out.println("El arreglo del sistema de emision de gases sale por: "+stmagases);
        }
        if (labrado<=1.6){
            System.out.println("El arreglo de sus neumaticos sale por: "+stmaneumaticos);
        }
        if (!isLimpiabri()){
            System.out.println("El arreglo de los limpiabrisas sale por: "+stmalimpiabrisas);
        }
        if (!isPito()){
            System.out.println("El arreglo del claxon sale por: "+stmaclaxon);
        }
        if (!isBateria()){
            System.out.println("El arreglo de la ateria sale por: "+bateria);
        }
        if (!isCinturon()){
            System.out.println("El arreglo del cinturon sale por: "+cinturon);
        }
    }
    public double total(){
        double total = 0;
        if (!isFrenos()){
            total=total+stmafrenos;
        }
        if (!isLuces()){
            total=total+stamluces;
        }
        if (!isVolante()){
            total=total+stmadireccion;
        }
        if (lmgases>=1.5){
            total=total+stmagases;
        }
        if (labrado<=1.6){
            total=total+stmaneumaticos;
        }
        if (!isCinturon()){
            total=total+cinturon;
        }
        if (!isBateria()){
            total=total+bateria;
        }
        if (!isPito()){
            total=total+stmaclaxon;
        }
        if (!isLimpiabri()){
            total=total+stmalimpiabrisas;
        }
        System.out.println("\tEl valor total del taller es: "+total+"\t");
        return total;
    }


    @Override
    public String toString() {
        return "Taller{" +
                "stamluces=" + stamluces +
                ", stmafrenos=" + stmafrenos +
                ", stmadireccion=" + stmadireccion +
                ", stmagases=" + stmagases +
                ", stmaneumaticos=" + stmaneumaticos +
                '}';
    }
}
