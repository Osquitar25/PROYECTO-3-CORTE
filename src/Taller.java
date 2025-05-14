import java.util.Scanner;

public class Taller extends Simular{

    String RESET = "\u001B[0m";
    String ROJO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String BLANCO = "\u001B[37m";
    String AZUL = "\u001B[34m";
    @Override
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
    }
}
