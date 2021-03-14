package com.company;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    private int numero;
    private int palito;

    public int getPalos() {
        return palos;
    }

    public void setPalos(int palos) {
        this.palos = palos;
    }

    private int palos = 21;
    private int resultado;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    public void saludar() {
        System.out.println("**************************************");
        System.out.println("Bienvenida/o a este juego");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Presiona S si quieres tener el primer turno , N para que comience la PC");
        String letra = scanner.nextLine();
        while(letra != "S" && letra!="s"&& letra!="N"&& letra!= "n") {
            if (letra.equals("S") || letra.equals("s")) {
                System.out.println("Comienzas tu");
                comenzarAJugar(letra);
                break;
            } else if (letra.equals("N") || letra.equals("n")) {
                System.out.println("Comienza la Pc");
                comenzarPc(letra);
                break;
            } else {
                System.out.println("Vuelve a presionar S si quieres tener el primer turno , N para que comience la PC");
                break;
            }
        }
        seguirJuego();
    }

    private void seguirJuego() {

        for(int i=0;i<palos;i++){
            comenzarAJugar("");
            comenzarPc("");
        }
    }

    private void comenzarPc(String letra) {
        palito = random.nextInt(2)+1;
        palos = palos - palito;
        System.out.println("Ahora quedan: "+palos);
    }

    public void comenzarAJugar(String letra){
        System.out.println("Cuantos palitos quieres sacar? 1 ó 2");
        int palito= scanner.nextInt();
        if(palito == 1){
            palos = palos - palito;
            System.out.println("Quedan "+palos);
        }if(palito == 2){
            palos = palos - palito;
            System.out.println("Quedan "+palos);
        }
    }
}
