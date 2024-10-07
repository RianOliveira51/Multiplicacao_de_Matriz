package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de linhas na Matriz");
        int n = sc.nextInt();


        int[][] vectA = new int[n][n];
        int[][] vectB = new int[n][n];
        int[][] vectC = new int[n][n];

        System.out.println("Digite os valores da matriz A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vectA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vectB[i][j] = sc.nextInt();
            }
        }


        System.out.println();
        System.out.println("Valores dentro da matriz A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(vectA[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("Matriz B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(vectB[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Qual operação deseja fazer, 1 - Soma ou 2 - Multiplicação");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        vectC[i][j] = vectA[i][j] + vectB[i][j];
                    }
                }

                System.out.println();
                System.out.println("Vetor C");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(vectC[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                System.out.println("Multiplicação em Matriz");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        vectC[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            vectC[i][j] += vectA[i][k] * vectB[k][j];
                        }
                    }
                }

                System.out.println("Vetor C");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(vectC[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            break;
        }
    }
}