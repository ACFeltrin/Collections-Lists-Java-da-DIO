package com.dio.collection.exercicioslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ExercicioList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> temp = new ArrayList<Double>();

        while (true) {
            System.out.println("Digite a temperatura: ");
            scan.hasNextDouble();
            temp.add(scan.nextDouble());

            if (temp.size() == 6) break;

        }
        System.out.println("todas as temperaturas: " + temp);

        Iterator<Double> iterator = temp.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        double media = soma / 6;
        System.out.println("A média das temperaturas: " + media);

        int count = 0;

        Iterator<Double> iterator1 = temp.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (temp >= media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }

        }
    }
}