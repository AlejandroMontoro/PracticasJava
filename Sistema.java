import java.util.Scanner;

public class Sistema { 
    public static void main(String args[]) {
 
        //Sistema de vacaciones
        Scanner entrada = new Scanner(System.in);
        String nombre = "", departamento = "";
        int clave = 0;
        int antiguedad = 0;
        int vacaciones = 0; 
        //

        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su clave:");
        clave = entrada.nextInt();
        System.out.println("Ingrese su antiguedad:");
        antiguedad = entrada.nextInt();

        if (clave == 1) {

            departamento = "Atencion al cliente";

            if (antiguedad == 1) {
                vacaciones = 6;
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                vacaciones = 14;
            } else if (antiguedad >= 7) {
                vacaciones = 20;
            } else {
                vacaciones = 0;
            }

        } else if (clave == 2) {

            departamento = "Logistica";

            if (antiguedad == 1) {
                vacaciones = 7;
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                vacaciones = 15;
            } else if (antiguedad >= 7) {
                vacaciones = 22;
            } else {
                vacaciones = 0;
            }

        } else if (clave == 3) {
            departamento = "Gerencia";

            if (antiguedad == 1) {
                vacaciones = 10;
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                vacaciones = 20;
            } else if (antiguedad >= 7) {
                vacaciones = 30;
            } else {
                vacaciones = 0;
            }

        } else {
            departamento = "Departamento invalido.";
        }

        System.out.println("Hola " + nombre);
        System.out.println("Departamento " + departamento);
        System.out.println("Por una antiguedad de " + antiguedad + " años, usted tiene derecho a " + vacaciones
                + " dias de vacaciones.");
    }

}
