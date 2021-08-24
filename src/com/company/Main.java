package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("########## INICIO_TEMPERATURA_GLOBAIS ########## ");

        String arrCidade[] = new String[10];
        int vetTemperatura[][] = new int[10][2];


        arrCidade[0] = "Londres";
        arrCidade[1] = "Madrid";
        arrCidade[2] = "Nueva York";
        arrCidade[3] = "Buenos Aires";
        arrCidade[4] = "Asuncioin";
        arrCidade[5] = "Sao Paulo";
        arrCidade[6] = "Lima";
        arrCidade[7] = "Santiago de Chile";
        arrCidade[8] = "Lisboa";
        arrCidade[9] = "Tokio";

        Random random = new Random();

        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 9; y++) {
                int vTemperatura = (random.nextInt(45));
                vetTemperatura[y][x] = vTemperatura;
            }
        }

        // -- Print das informacoes
        System.out.println("ID  -   Cidade" + " -   " + "Min" + "   -   " + "Max");

        for (int y = 0; y <= 9; y++) {
            int vTemperatura = (random.nextInt(45));
            System.out.println(y + "    -   " + arrCidade[y] + " -   " + vetTemperatura[y][0] + " -   " + vetTemperatura[y][1]);
        }
        // --


        int vOpcao;

        do {
            System.out.printf("Escolha a Cidade pelo ID 0 a 9 (99 para Sair):");

            Scanner scanner = new Scanner(System.in);
            vOpcao = scanner.nextInt();

            if (vOpcao > 0 && vOpcao < 9) {
                System.out.println("Cidade  -   Minimo  -   Maximo");
                System.out.println(arrCidade[vOpcao] + "    -   " + vetTemperatura[vOpcao][0] + "   -   " + vetTemperatura[vOpcao][0]);
            }else{
                System.out.println("// -------------------- \\");
                System.out.println("Opcao Incorreta!!!");
                System.out.println("\\ -------------------- //");
            }

        } while (vOpcao != 99);

        System.out.println("########## FIM_TEMPERATURA_GLOBAIS ########## ");
    }
}
