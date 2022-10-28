package com.dio.collection.exercicioslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercioList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> resp = new ArrayList<>();

        System.out.println("Responda com sim ou nao: ");
        System.out.println("\n-------------");

        System.out.println("Telefonou para vítima? ");
        String resposta = scan.next();
        resp.add(resposta);

        System.out.println("Esteve no local do crime? ");
        resposta = scan.next();
        resp.add(resposta);

        System.out.println("Mora perto da vítima? ");
        resposta = scan.next();
        resp.add(resposta);

        System.out.println("Devia para vítima? ");
        resposta = scan.next();
        resp.add(resposta);

        System.out.println("Já trabalhou com a vítima? ");
        resposta = scan.next();
        resp.add(resposta);

        System.out.println("Respostas foram: " + resp);

        String toTest = "sim";
        int count = 0;
        for(int i=0; i < resp.size(); i++) {
            String s = resp.get(i);
            if(s.contains(toTest)) count++;
        }
        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }

    }
}
