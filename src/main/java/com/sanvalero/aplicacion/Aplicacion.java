package com.sanvalero.aplicacion;
import java.util.Scanner;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);

    public void Aplicacion(){
        int N;
        do {
            System.out.print("Introduce un número entre 1 y 3999: ");
            N = sc.nextInt();
        } while (N < 1 || N > 3999);
        System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));
    }


    }
}
